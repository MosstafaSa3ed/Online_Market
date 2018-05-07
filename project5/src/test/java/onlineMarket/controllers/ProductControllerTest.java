package onlineMarket.controllers;

<<<<<<< HEAD
import onlineMarket.entities.ProductEntity;
=======
import onlineMarket.entities.ActionEntity;
import onlineMarket.entities.BuyerEntity;
import onlineMarket.entities.ProductEntity;
import onlineMarket.entities.SellerEntity;
import onlineMarket.entities.StoreEntity;
>>>>>>> b380d7ec6c41dd35ae469dd31ca1a9eec2bf96ea
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
<<<<<<< HEAD
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

=======
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

>>>>>>> b380d7ec6c41dd35ae469dd31ca1a9eec2bf96ea
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
<<<<<<< HEAD
=======
	@Mock
	private StoreRepository storeRepo;
	@Mock
	private ActionRepository actionRepo;
	@Mock
	private SellerRepository sellRepo;
	@Mock 
	private BuyerRepository buyRepo;
	
>>>>>>> b380d7ec6c41dd35ae469dd31ca1a9eec2bf96ea
	
	@InjectMocks
	public ProductController controller;
	
	@BeforeTest
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
    }
	
@Test
<<<<<<< HEAD
  public void add() {
=======
  public void add_new() {
>>>>>>> b380d7ec6c41dd35ae469dd31ca1a9eec2bf96ea
	String name="new",store="store",brand="nike";
	 when(prodRepo.findByNameInAndStoreNameIn(name,store )).thenReturn(null);
	 when(sysRepo.findByName(name)).thenReturn(new SysProductEntity());
	 when(brandRepo.exists(brand)).thenReturn(true);
<<<<<<< HEAD
	// when(prodRepo.save(new ProductEntity())).thenReturn(null);
	 assertThat(controller.add(name, store, 111, brand, 1),is(true));
  }
  
  
  

=======
	 when(prodRepo.save(new ProductEntity())).thenReturn(null);
	 assertThat(controller.add(name, store, 111, brand, 1),is(true));
  }

@Test
	public void add_exist()
	{
		 String name="new",store="store",brand="nike";
		 when(prodRepo.findByNameInAndStoreNameIn(name,store )).thenReturn(new ProductEntity());
		 when(sysRepo.findByName(name)).thenReturn(new SysProductEntity());
		 when(brandRepo.exists(brand)).thenReturn(true);
		 when(prodRepo.save(new ProductEntity())).thenReturn(null);
		 assertThat(controller.add(name, store, 111, brand, 1),is(true));
	}
  
@Test
public void add_wrong_brand()
{
	 String name="new",store="store",brand="nike";
	 when(prodRepo.findByNameInAndStoreNameIn(name,store )).thenReturn(new ProductEntity());
	 when(sysRepo.findByName(name)).thenReturn(new SysProductEntity());
	 when(brandRepo.exists(brand)).thenReturn(false);
	 when(prodRepo.save(new ProductEntity())).thenReturn(null);
	 assertThat(controller.add(name, store, 111, brand, 1),is(false));
}  
  
	@Test
	public void edit_exist()
	{
		String prod="name",store="store";
		when(prodRepo.findByNameInAndStoreNameIn(prod, store)).thenReturn(new ProductEntity());
		when(prodRepo.save(new ProductEntity())).thenReturn(null);
		assertThat(controller.Edit(prod, store, 325),is(true));
	}
	
	@Test
	public void edit_Not_exist()
	{
		String prod="name",store="store";
		when(prodRepo.findByNameInAndStoreNameIn(prod, store)).thenReturn(null);
		when(prodRepo.save(new ProductEntity())).thenReturn(null);
		assertThat(controller.Edit(prod, store, 325),is(false));
	}
	
	@Test
	public void delete_exist()
	{
		String prod="name",store="store";
		ProductEntity product=new ProductEntity();
		product.setCounter(5);
		when(prodRepo.findByNameInAndStoreNameIn(prod, store)).thenReturn(product);
		assertThat(controller.Delete(prod, store, 2),is(true));
	}
	
	@Test
	public void delete_Not_exist()
	{
		String prod="name",store="store";
		
		when(prodRepo.findByNameInAndStoreNameIn(prod, store)).thenReturn(null);
		assertThat(controller.Delete(prod, store, 2),is(false));
	}
	
	@Test
	public void delete_Not_ُEnough_amount()
	{
		String prod="name",store="store";
		ProductEntity product=new ProductEntity();
		product.setCounter(5);
		when(prodRepo.findByNameInAndStoreNameIn(prod, store)).thenReturn(null);
		assertThat(controller.Delete(prod, store, 8),is(false));
	}
	
	@Test
	public void viewStat()
	{
		String name="name",store="store";
		ProductEntity product =new ProductEntity();
		product.setViewedCounter(8);
		when(prodRepo.findByNameInAndStoreNameIn(name, store)).thenReturn(product);
		product.setViewedCounter(9);
		assertThat(controller.viewedStat(name, store),is(product));
	}
	
	@Test
	public void viewStat_null()
	{
		String name="name",store="store";
		ProductEntity product =null;
		when(prodRepo.findByNameInAndStoreNameIn(name, store)).thenReturn(null);
		
		assertThat(controller.viewedStat(name, store),is(product));
	}
	
	@Test
	public void CollaEdit()
	{
		String prod="name",store="store";
		StoreEntity stor=new StoreEntity();
		stor.setSellerName("seller");
		when(storeRepo.findOne(store)).thenReturn(stor);
		when(prodRepo.findByNameInAndStoreNameIn(prod, store)).thenReturn(new ProductEntity());
		when(actionRepo.save(new ActionEntity())).thenReturn(null);
		when(prodRepo.save(new ProductEntity())).thenReturn(null);
		assertThat(controller.CollaEdit(prod, store, 111, "CollaName"),is(true));
	}
	
	@Test
	public void CollaEdit_No_prod()
	{
		String prod="name",store="store";
		StoreEntity stor=new StoreEntity();
		stor.setSellerName("seller");
		when(storeRepo.findOne(store)).thenReturn(stor);
		when(prodRepo.findByNameInAndStoreNameIn(prod, store)).thenReturn(null);
		when(actionRepo.save(new ActionEntity())).thenReturn(null);
		when(prodRepo.save(new ProductEntity())).thenReturn(null);
		assertThat(controller.CollaEdit(prod, store, 111, "CollaName"),is(false));
	}
	
	@Test
	public void CollaDelete_No_prod()
	{
		String prod="name",store="store";
		StoreEntity stor=new StoreEntity();
		
		stor.setSellerName("seller");
		when(storeRepo.findOne(store)).thenReturn(stor);
		when(prodRepo.findByNameInAndStoreNameIn(prod, store)).thenReturn(null);
		when(actionRepo.save(new ActionEntity())).thenReturn(null);
		when(prodRepo.save(new ProductEntity())).thenReturn(null);
		assertThat(controller.CollaDelete(prod, store, 5, "CollaName"),is(false));
	}
	
	@Test
	public void CollaDelete()
	{
		String prod="name",store="store";
		StoreEntity stor=new StoreEntity();
		stor.setSellerName("seller");
		
		ProductEntity product=new ProductEntity();
		product.setCounter(8);
		
		when(storeRepo.findOne(store)).thenReturn(stor);
		when(prodRepo.findByNameInAndStoreNameIn(prod, store)).thenReturn(product);
		when(actionRepo.save(new ActionEntity())).thenReturn(null);
		when(prodRepo.save(new ProductEntity())).thenReturn(null);
		assertThat(controller.CollaDelete(prod, store, 8, "CollaName"),is(true));
	}
	
	@Test
	public void undo_Add()
	{
		String prod="name",store="store";
		when(prodRepo.findByNameInAndStoreNameIn(prod, store)).thenReturn(null);
		assertThat(controller.Undo("Add", 2, prod, store, 231, 2),is(false));
	}
	
	@Test
	public void undo_Delete()
	{
		String prod="name",store="store";
		when(prodRepo.findByNameInAndStoreNameIn(prod, store)).thenReturn(null);
		assertThat(controller.Undo("Delete", 2, prod, store, 231, 2),is(false));
	}
	
	@Test
	public void undo_Edit()
	{
		String prod="name",store="store";
		when(prodRepo.findByNameInAndStoreNameIn(prod, store)).thenReturn(null);
		assertThat(controller.Undo("Edit", 2, prod, store, 231, 2),is(false));
	}
	
	@Test
	public void CollaAdd_wrong_Brand()
	{
		String prod="name",store="store";
		when(storeRepo.findOne(store)).thenReturn(new StoreEntity());
		when(prodRepo.findByNameInAndStoreNameIn(prod, store)).thenReturn(null);
		when(sysRepo.findByName(prod)).thenReturn(new SysProductEntity());
		when(brandRepo.exists("")).thenReturn(false);
		assertThat(controller.Collaadd(prod, store, 123, "", 2, ""),is(false));
	}
	
	@Test
	public void CollaAdd_Not_exist_prod()
	{
		String prod="name",store="store";
		when(storeRepo.findOne(store)).thenReturn(new StoreEntity());
		when(prodRepo.findByNameInAndStoreNameIn(prod, store)).thenReturn(null);
		when(sysRepo.findByName(prod)).thenReturn(new SysProductEntity());
		when(brandRepo.exists("")).thenReturn(true);
		when(actionRepo.save(new ActionEntity())).thenReturn(null);
		when(prodRepo.save(new ProductEntity())).thenReturn(null);
		assertThat(controller.Collaadd(prod, store, 123, "", 2, ""),is(true));
	}
	
	@Test
	public void CollaAdd_exist_prod()
	{
		String prod="name",store="store";
		when(storeRepo.findOne(store)).thenReturn(new StoreEntity());
		when(prodRepo.findByNameInAndStoreNameIn(prod, store)).thenReturn(null);
		when(sysRepo.findByName(prod)).thenReturn(new SysProductEntity());
		when(brandRepo.exists("")).thenReturn(true);
		when(actionRepo.save(new ActionEntity())).thenReturn(null);
		when(prodRepo.save(new ProductEntity())).thenReturn(null);
		assertThat(controller.Collaadd(prod, store, 123, "", 2, ""),is(true));
	}
	
	@Test
	public void Seller_Buy()
	{
		String prod="name",store="store";
		List<StoreEntity> s=new ArrayList<StoreEntity>();
		s.add(new StoreEntity());
		when(storeRepo.findBySellerNameIn("")).thenReturn(s);
		ProductEntity product=new ProductEntity();
		product.setCounter(2);
		product.setPrice(100);
		when(prodRepo.findByNameInAndStoreNameIn(prod, store)).thenReturn(product);
		
		SellerEntity sell=new SellerEntity();
		sell.setFlag(false);
		when(sellRepo.findOne("")).thenReturn(sell);
		when(sellRepo.save(new SellerEntity())).thenReturn(null);
		assertThat(controller.buy(prod, 2, store, ""),is(140.0));
	}
	
	@Test
	public void Buyer_Buy()
	{
		String prod="name",store="store";
		List<StoreEntity> s=new ArrayList<StoreEntity>();
		when(storeRepo.findBySellerNameIn("")).thenReturn(s);
		ProductEntity product=new ProductEntity();
		product.setCounter(2);
		product.setPrice(100);
		when(prodRepo.findByNameInAndStoreNameIn(prod, store)).thenReturn(product);
		
		BuyerEntity buy=new BuyerEntity();
		buy.setFlag(false);
		when(buyRepo.findOne("")).thenReturn(buy );
		when(buyRepo.save(new BuyerEntity())).thenReturn(null);
		
		assertThat(controller.buy(prod, 2, store, ""),is(170.0));
	}
	
	public void Buy_Not_Exist_Prod()
	{
		String prod="name",store="store";
		List<StoreEntity> s=new ArrayList<StoreEntity>();
		when(storeRepo.findBySellerNameIn("")).thenReturn(s);
		ProductEntity product=new ProductEntity();
		product.setCounter(2);
		product.setPrice(100);
		when(prodRepo.findByNameInAndStoreNameIn(prod, store)).thenReturn(null);
		
		assertThat(controller.buy(prod, 2, store, ""),is(-1.0));
	}
>>>>>>> b380d7ec6c41dd35ae469dd31ca1a9eec2bf96ea
}
