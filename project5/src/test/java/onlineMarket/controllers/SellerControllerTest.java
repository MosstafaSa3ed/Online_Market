package onlineMarket.controllers;

import org.testng.annotations.Test;

import onlineMarket.entities.BuyerEntity;
import onlineMarket.entities.SellerEntity;
import onlineMarket.repositories.SellerRepository;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.when;

import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.testng.annotations.BeforeTest;

public class SellerControllerTest {
	
	@Mock
	private SellerRepository SellRepo;
	@InjectMocks
	private SellerController SellCon;
	
  @BeforeTest
  public void beforeTest() {
      MockitoAnnotations.initMocks(this);
  }

  @Test
  public void Login1() {
	  SellerEntity sell= new SellerEntity("maii","maii");
    when(SellRepo.exists("maii")).thenReturn(true);
    when(SellRepo.findOne("maii")).thenReturn(sell);
    assertThat(SellCon.login("maii", "maii"),is(true));
  }
  @Test
  public void Login2() {
	  BuyerEntity buy= new BuyerEntity("Maii","Maii");
    when(SellRepo.exists("Maii")).thenReturn(false);
    assertThat(SellCon.login("Maii", "maii"),is(false));
  }
  
  @Test
  public void Register1() {
	  SellerEntity sell= new SellerEntity("Maii","Maii");
	  when(SellRepo.exists("Maii")).thenReturn(false);
	  
	  when(SellRepo.save(sell)).thenReturn(null);
	  assertThat(SellCon.Register("Maii", "maii"),is(true));
  }
  @Test
  public void Register2() {
	  BuyerEntity sell= new BuyerEntity("Maii","1");
	  when(SellRepo.exists("Maii")).thenReturn(false);
	  when(SellRepo.save(sell)).thenReturn(null);
	  assertThat(SellCon.Register("Maii", "1"),is(false)); //pass is too short
  }
  @Test
  public void Register3() {
	  BuyerEntity buy= new BuyerEntity("12345","12345");
	  when(SellRepo.exists("12345")).thenReturn(false);
	  when(SellRepo.save(buy)).thenReturn(null);
	  assertThat(SellCon.Register("12345", "12345"),is(true));
  }


}
