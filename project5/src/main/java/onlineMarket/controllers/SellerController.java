package onlineMarket.controllers;

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
import org.springframework.web.bind.annotation.SessionAttributes;

import onlineMarket.entities.BuyerEntity;
import onlineMarket.entities.ProductEntity;
import onlineMarket.entities.SellerEntity;
import onlineMarket.entities.StoreEntity;
import onlineMarket.entities.SysProductEntity;
import onlineMarket.entities.UserEntity;
import onlineMarket.repositories.SellerRepository;

@RestController
@RequestMapping("/sellers")
public class SellerController {
	public static SellerEntity sell;
	public static SysProductEntity sysProd;
	
	@Autowired
	SellerRepository SellerRepo;
	
	@RequestMapping("/reg/{email}/{pass}")
	public ResponseEntity<UserEntity> Register(@PathVariable String email,@PathVariable String pass)
	{
		UserEntity sellObj= new SellerEntity(email,pass);
		if(email!=null && pass!=null && !SellerRepo.exists(sellObj.getEmail()))
		{
			SellerRepo.save(sellObj);
			return new ResponseEntity<UserEntity>(sellObj, HttpStatus.OK);
		}
		return new ResponseEntity<UserEntity>(sellObj, HttpStatus.BAD_REQUEST);
	}
	
	
	@RequestMapping("/log/{email}/{pass}")
	public ResponseEntity<UserEntity> login(@PathVariable String email, @PathVariable String pass)
	{
		UserEntity s = null;
		UserEntity sellObj= new SellerEntity(email,pass);
		if(email!=null && pass!=null && SellerRepo.exists(sellObj.getEmail()))
		{
			s= (SellerEntity) SellerRepo.findOne(sellObj.getEmail());
			if(s.getPassword().equals(sellObj.getPassword()) )
			{
				return new ResponseEntity<UserEntity>(s, HttpStatus.OK);
			}
		}
		return new ResponseEntity<UserEntity>(s, HttpStatus.BAD_REQUEST);
	}
//////////////////////////////////////////
	
	@GetMapping("/AddStore")
	public String addStore(Model model)
	{
		model.addAttribute("store", new StoreEntity());
		return "AddStore";
	}
	
	@GetMapping("/AddProd")
	public String addProduct(Model model)
	{
		System.out.println("hello");
		model.addAttribute("prod", new ProductEntity());
		return "AddProd";
	}
}
