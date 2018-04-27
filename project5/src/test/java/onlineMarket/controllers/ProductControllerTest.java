package onlineMarket.controllers;

import onlineMarket.entities.ProductEntity;
import onlineMarket.entities.SysProductEntity;
import onlineMarket.repositories.*;

import static org.junit.Assert.assertThat;
import org.testng.annotations.Test;


import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.CoreMatchers.any;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.hamcrest.Matcher;
import org.junit.Before;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
public class ProductControllerTest {
  
	@Mock
	private ProductRepository prodRepo;
	
	@Mock
	private SysProductRepository sysRepo;
	@Mock
	private BrandRepository brandRepo;
	
	@InjectMocks
	public ProductController controller;
	
	@BeforeTest
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
    }
	
@Test
  public void add() {
	String name="new",store="store",brand="nike";
	 when(prodRepo.findByNameInAndStoreNameIn(name,store )).thenReturn(null);
	 when(sysRepo.findByName(name)).thenReturn(new SysProductEntity());
	 when(brandRepo.exists(brand)).thenReturn(true);
	// when(prodRepo.save(new ProductEntity())).thenReturn(null);
	 assertThat(controller.add(name, store, 111, brand, 1),is(true));
  }
  
  
  

}
