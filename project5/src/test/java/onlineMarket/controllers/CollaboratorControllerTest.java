package onlineMarket.controllers;

import org.testng.annotations.Test;

import onlineMarket.entities.CollaboratorEntity;
import onlineMarket.entities.StoreEntity;
import onlineMarket.repositories.CollaboratorRepository;
import onlineMarket.repositories.SellerRepository;
import onlineMarket.repositories.StoreRepository;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.when;

import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.testng.annotations.BeforeTest;

public class CollaboratorControllerTest {
	@Mock
	public CollaboratorRepository collRepo;;
	@Mock
	public SellerRepository sellRepo;
	@Mock
	public StoreRepository storeRepo;
	@InjectMocks
	public CollaboratorController collCon;
	
  @BeforeTest
  public void beforeTest() {
      MockitoAnnotations.initMocks(this);
  }


  @Test
  public void addColla1() {
	  CollaboratorEntity coll= new CollaboratorEntity("maii", "btngan");
	  when(sellRepo.exists("maii")).thenReturn(true);
	  when(storeRepo.findBySellerNameInAndNameIn("storeOwner", "btngan")).thenReturn(new StoreEntity());
	  when(collRepo.save(coll)).thenReturn(null);
	  assertThat(collCon.addColla("maii", "btngan", "storeOwner"),is(true));
	  
  }
  
  @Test
  public void addColla2() {
	  CollaboratorEntity coll= new CollaboratorEntity("maii", "btngan");
	  when(sellRepo.exists("maii")).thenReturn(false);
	  when(storeRepo.findBySellerNameInAndNameIn("storeOwner", "btngan")).thenReturn(new StoreEntity());
	  when(collRepo.save(coll)).thenReturn(null);
	  assertThat(collCon.addColla("maii", "btngan", "storeOwner"),is(false));
	  
  }
  @Test
  public void addColla3() {
	  CollaboratorEntity coll= new CollaboratorEntity("maii", "btngan");
	  when(sellRepo.exists("maii")).thenReturn(true);
	  when(storeRepo.findBySellerNameInAndNameIn("maii", "btngan")).thenReturn(new StoreEntity());
	  when(collRepo.save(coll)).thenReturn(null);
	  assertThat(collCon.addColla("maii", "btngan", "maii"),is(false));
	  
  }
  
}
