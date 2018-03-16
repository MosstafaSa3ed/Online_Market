package onlineMarket.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import onlineMarket.entities.BuyerEntity;
import onlineMarket.entities.ProductEntity;
import onlineMarket.entities.SellerEntity;
import onlineMarket.entities.StoreEntity;
import onlineMarket.entities.SysProductEntity;
import onlineMarket.repositories.SellerRepository;

@Controller
public class SellerController {
	public static SellerEntity sell;
	public static SysProductEntity sysProd;
	@Autowired
	SellerRepository SellerRepo;
	@GetMapping("/SellerRegister")
	public String Register(Model model)
	{
		model.addAttribute("seller", new SellerEntity());
		return "SellerRegister";
	}
	@PostMapping("/SellerRegister")
	public String SellerRegister(@ModelAttribute SellerEntity seller,Model model)
	{
		sell=seller;
		model.addAttribute("seller", new SellerEntity());
		if(SellerRepo.exists(seller.getEmail()))
		{
			return "SellerRegister";
		}
		SellerRepo.save(seller);
		return "SellerHome";
	}
	
	@GetMapping("/SellerLogin")
	public String Login(Model model)
	{
		model.addAttribute("seller", new SellerEntity());
		return "SellerLogin";
	}
	@PostMapping("/SellerLogin")
	public String SellerLogin(@ModelAttribute SellerEntity seller,Model model)
	{
		sell=seller;
		model.addAttribute("seller", new SellerEntity());
		
		if(SellerRepo.exists(seller.getEmail()))
		{
			SellerEntity temp= (SellerEntity) SellerRepo.findOne(seller.getEmail());
			if(seller.getPassword().equals(temp.getPassword()))
				return "SellerHome";
		}
		return "SellerLogin";
	}
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
