package onlineMarket.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import onlineMarket.repositories.BrandRepository;
import onlineMarket.repositories.ProductRepository;
import onlineMarket.repositories.StoreRepository;
import onlineMarket.repositories.SysProductRepository;
import onlineMarket.entities.*;;
@RestController
@RequestMapping("/sellers")
public class ProductController {
	@Autowired
	ProductRepository ProductRepo;
	@Autowired
	SysProductRepository SysProductRepo;
	@Autowired
	 BrandRepository BrandRepo;
	@Autowired
	StoreRepository StoreRepo;
	/*@RequestMapping("/getProd")
	public String getProd(Model md)
	{
		md.addAttribute("test",ProductRepo.findByName("prod"));
		return "try";
	}*/
	// kont bagrb el update
	/*@RequestMapping("/update")
	public String upd()
	{
		ProductEntity p= ProductRepo.findByStoreNameIn("esm");
		int x=p.getCounter();
		x++;
		p.setCounter(x);
		ProductRepo.save(p);
		return "try";
	}
	*/
	@RequestMapping("/AddProd/{name}/{storeName}/{price}/{brand}")
	public ResponseEntity<ProductEntity> add(@PathVariable String name , @PathVariable String brand,@PathVariable String storeName,@PathVariable double price)
	{
		//ProductEntity prod=new ProductEntity
		ProductEntity prod= ProductRepo.findByNameInAndStoreNameIn(name, storeName);
		SysProductEntity sys=SysProductRepo.findByName(name);
		if(!BrandRepo.exists(brand) || sys==null)
			return new ResponseEntity<ProductEntity>(prod, HttpStatus.BAD_REQUEST);
		
		if(prod==null )
		{
			prod=new ProductEntity(name,storeName,price,brand);
			ProductRepo.save(prod);
			return new ResponseEntity<ProductEntity>(prod, HttpStatus.OK);
		}
		else
		{
			int x=prod.getCounter();
			prod.setCounter(x+1);
			ProductRepo.save(prod);
			return new ResponseEntity<ProductEntity>(prod, HttpStatus.OK);

		}
		
	}
	
	
	@RequestMapping("/buy/{name}/{amount}/{store}")
	public ResponseEntity<ProductEntity> buy(@PathVariable String name ,@PathVariable int amount,@PathVariable String store)
	{
		///kan mwgod brand bs 7stha mlhash lzma l2nha kda kda mwgoda f product nfso
		ProductEntity pro = null;
		if(name!=null&& store!=null)
		{	
			pro=ProductRepo.findByNameInAndStoreNameIn(name, store);
			if(pro!=null  && pro.getCounter()>=amount )
			{

				int counter=pro.getCounter()-amount;
				int soldCounter= pro.getSoldCounter()+amount;
				pro.setCounter(counter);
				pro.setSoldCounter(soldCounter);
				pro.setBuyerCounter( pro.getBuyerCounter()+1 );
				ProductRepo.save(pro);
				return new ResponseEntity<ProductEntity>(pro, HttpStatus.OK);
			}
		}
		return new ResponseEntity<ProductEntity>(pro, HttpStatus.BAD_REQUEST);
	}
	
	@RequestMapping("/view/{name}/{store}")
	public ProductEntity viewedStat(@PathVariable String name,@PathVariable String store)
	{
		ProductEntity pro;
		pro=ProductRepo.findByNameInAndStoreNameIn(name, store);
		pro.setViewedCounter( pro.getViewedCounter()+1 );
		return pro;
	}
}
