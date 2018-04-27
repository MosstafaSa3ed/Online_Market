package onlineMarket.controllers;

import org.testng.annotations.Test;

import junit.framework.Assert;
import onlineMarket.entities.AdminEntity;
import onlineMarket.repositories.AdminRepository;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.when;

import org.aspectj.lang.annotation.Before;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.testng.annotations.AfterMethod;

public class AdminControllerTest {

 @Mock
 public AdminRepository AdRepo;
 @InjectMocks
 public AdminController AdCon;
 
  AdminController ad= new AdminController();
  
  @BeforeTest
  public void setUp() throws Exception {
       MockitoAnnotations.initMocks(this);
  }

  
  @Test
  public void Login() {
	 
	  AdminEntity admin= new AdminEntity("Admin","Admin");
	when(AdRepo.exists("Admin")).thenReturn(true);
	when(AdRepo.findOne("Admin")).thenReturn(admin);
	
	assertThat(AdCon.Login("Admin", "Admin"),is(true));
  //  throw new RuntimeException("Test not implemented");
  }
  
  @Test
  public void Login1() {
	 
	  AdminEntity admin= new AdminEntity("admin","admin");
	when(AdRepo.exists("admin")).thenReturn(false);
	//when(AdRepo.findOne("Admin")).thenReturn(admin);
	
	assertThat(AdCon.Login("admin", "admin"),is(false));

  }
  @Test
  public void Login2() {
	 
	  AdminEntity admin= new AdminEntity("Admin","admin");
	when(AdRepo.exists("Admin")).thenReturn(false);
	when(AdRepo.findOne("Admin")).thenReturn(admin);
	
	assertThat(AdCon.Login("Admin", "admin"),is(false));

  }
}
