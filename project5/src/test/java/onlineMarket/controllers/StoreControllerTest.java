package onlineMarket.controllers;

import org.testng.annotations.Test;

import onlineMarket.entities.StoreEntity;
import onlineMarket.repositories.StoreRepository;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.when;

import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.testng.annotations.BeforeTest;

public class StoreControllerTest {
	@Mock
	private StoreRepository storeRepo;
	@InjectMocks
	private StoreController storeCon;
	
  @BeforeTest
  public void beforeTest() {
	  MockitoAnnotations.initMocks(this);
  }


  @Test
  public void add1() {
	  StoreEntity store= new StoreEntity("store","seller", "loc", "type");
	  when(storeRepo.findOne("store")).thenReturn(null);
	  when(storeRepo.save(store)).thenReturn(null);
	  assertThat(storeCon.add("store","seller", "loc", "type"),is(true));
  }
  @Test
  public void add2() {
	  StoreEntity store= new StoreEntity("store","seller", "loc", "type");
	  when(storeRepo.findOne("store")).thenReturn(new StoreEntity());
	  when(storeRepo.save(store)).thenReturn(null);
	  assertThat(storeCon.add("store","seller", "loc", "type"),is(false));
  }
}
