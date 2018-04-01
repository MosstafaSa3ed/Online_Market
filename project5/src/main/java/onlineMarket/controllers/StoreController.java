package onlineMarket.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import onlineMarket.entities.BrandEntity;
import onlineMarket.entities.ProductEntity;
import onlineMarket.entities.StoreEntity;
import onlineMarket.repositories.ProductRepository;
import onlineMarket.repositories.StoreRepository;


@RestController
@RequestMapping("/sellers")
public class StoreController
{
	@Autowired
	StoreRepository StoreRepo;
	@Autowired
	ProductRepository ProductRepo;
	
	@RequestMapping("/AddStore/{name}/{sellerName}/{location}/{type}")
	public ResponseEntity<StoreEntity> add(@PathVariable String name , @PathVariable String sellerName,@PathVariable String location,@PathVariable String type)
	{
		StoreEntity store = StoreRepo.findOne(name);
		if(store==null)
		{
			store=new StoreEntity(name,sellerName,location,type);
			StoreRepo.save(store);
			return new ResponseEntity<StoreEntity>(store, HttpStatus.OK);
		}
		return new ResponseEntity<StoreEntity>(store, HttpStatus.BAD_REQUEST);
	}
	@RequestMapping("/SoldStat/{name}")
	public int SoldStat(@PathVariable String name)
	{
		int counter=0;
		List<ProductEntity> myList= ProductRepo.findByStoreNameIn(name);
		for(int i=0 ; i< myList.size() ;i++)
		{
			counter+= myList.get(i).getSoldCounter();
		}
		return counter;
		
	}
	@RequestMapping("/UserStat/{name}")
	public int UserStat(@PathVariable String name)
	{
		int counter=0;
		List<ProductEntity> myList= ProductRepo.findByStoreNameIn(name);
		for(int i=0 ; i< myList.size() ;i++)
		{
			counter+= myList.get(i).getBuyerCounter();
		}
		return counter;
		
	}
	
	@RequestMapping("/view/{name}")
	public int viewedStat(@PathVariable String name)
	{
		int counter=0;
		List<ProductEntity> myList= ProductRepo.findByStoreNameIn(name);
		for(int i=0 ; i< myList.size() ;i++)
		{
			counter+= myList.get(i).getViewedCounter();
		}
		return counter;
	}
}


