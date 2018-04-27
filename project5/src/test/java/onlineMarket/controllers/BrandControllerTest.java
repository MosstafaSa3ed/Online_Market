package onlineMarket.controllers;

import org.testng.annotations.Test;

import onlineMarket.entities.BrandEntity;
import onlineMarket.repositories.BrandRepository;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.when;

import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.testng.annotations.BeforeTest;

public class BrandControllerTest {
	@Mock
	private BrandRepository BrandRepo;
	@InjectMocks
	private BrandController BrandCon;
	
  @BeforeTest
  public void beforeTest() {
      MockitoAnnotations.initMocks(this);

  }

  @Test
  public void add1() {
	  BrandEntity brand = new BrandEntity("bte5","a7mar");
	  when(BrandRepo.exists("bte5")).thenReturn(false);
	  when(BrandRepo.save(brand)).thenReturn(null);
	  assertThat(BrandCon.add("bte5", "a7mar"),is(true));
  }
  @Test
  public void add2() {
	  BrandEntity brand = new BrandEntity("bte5","a7mar");
	  when(BrandRepo.exists("bte5")).thenReturn(true);
	  assertThat(BrandCon.add("bte5", "a7mar"),is(false));
  }
}
