package onlineMarket.controllers;

import org.testng.annotations.Test;

import onlineMarket.entities.SysProductEntity;
import onlineMarket.repositories.BrandRepository;
import onlineMarket.repositories.SysProductRepository;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.when;

import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.testng.annotations.BeforeTest;

public class SysProductControllerTest {
	@Mock
	public SysProductRepository sysRepo;
	@Mock
	public BrandRepository brandRepo;
	@InjectMocks
	public SysProductController sysCon;
	
  @BeforeTest
  public void beforeTest() {
      MockitoAnnotations.initMocks(this);

  }


  @Test
  public void add1(){
	  SysProductEntity sys= new SysProductEntity("bte5","fakha",1.25,11);
	  when(sysRepo.findByNameInAndBrandIn("bte5", "fakha")).thenReturn(null);
	  
	  when(brandRepo.exists("fakha")).thenReturn(true);
	  
	  when(sysRepo.save(sys)).thenReturn(null);
	  assertThat(sysCon.add("bte5","fakha",1.25,11),is(true));
  }
  @Test
  public void add2(){
	  SysProductEntity sys= new SysProductEntity("bte5","fakha",1.25,11);
	  when(sysRepo.findByNameInAndBrandIn("bte5", "fakha")).thenReturn(new SysProductEntity());
	  when(sysRepo.exists("fakha")).thenReturn(true);
	  assertThat(sysCon.add("bte5","fakha",1.25,11),is(false));
  }
}
