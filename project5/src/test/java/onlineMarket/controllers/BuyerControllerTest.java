package onlineMarket.controllers;

import org.testng.annotations.Test;

import onlineMarket.entities.BuyerEntity;
import onlineMarket.repositories.BuyerRepository;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.when;

import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class BuyerControllerTest {
	@Mock
	private BuyerRepository BuyRepo;
	@InjectMocks
	private BuyerController BuyCon;
	
	@BeforeTest
	  public void setUp() throws Exception {
	       MockitoAnnotations.initMocks(this);
	  }


  @Test
  public void Login1() {
	  BuyerEntity buy= new BuyerEntity("maii","maii");
    when(BuyRepo.exists("maii")).thenReturn(true);
    when(BuyRepo.findOne("maii")).thenReturn(buy);
    assertThat(BuyCon.Login("maii", "maii"),is(true));
  }
  @Test
  public void Login2() {
	  BuyerEntity buy= new BuyerEntity("Maii","Maii");
    when(BuyRepo.exists("Maii")).thenReturn(false);
   
    assertThat(BuyCon.Login("Maii", "maii"),is(false));
  }
  
  
  @Test
  public void Register1() {
	  BuyerEntity buy= new BuyerEntity("Maii","Maii");
	  when(BuyRepo.exists("Maii")).thenReturn(false);
	  
	  when(BuyRepo.save(buy)).thenReturn(null);
	  assertThat(BuyCon.Register("Maii", "maii"),is(true));
  }
  @Test
  public void Register2() {
	  BuyerEntity buy= new BuyerEntity("Maii","1");
	  when(BuyRepo.exists("Maii")).thenReturn(false);
	  when(BuyRepo.save(buy)).thenReturn(null);
	  assertThat(BuyCon.Register("Maii", "1"),is(false)); //pass is too short
  }
  @Test
  public void Register3() {
	  BuyerEntity buy= new BuyerEntity("12345","12345");
	  when(BuyRepo.exists("12345")).thenReturn(false);
	  when(BuyRepo.save(buy)).thenReturn(null);
	  assertThat(BuyCon.Register("12345", "12345"),is(true));
  }
}
