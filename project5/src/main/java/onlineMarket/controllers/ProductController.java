package onlineMarket.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import onlineMarket.entities.ProductEntity;
import onlineMarket.repositories.ProductRepository;
import onlineMarket.repositories.StoreRepository;
import onlineMarket.repositories.SysProductRepository;

@Controller 
public class ProductController {
	@Autowired
	ProductRepository ProductRepo;
	@Autowired
	SysProductRepository SysProductRepo;
	@Autowired
	StoreRepository StoreRepo;
	
	
	
	@PostMapping("/AddProd")
	public String add(@ModelAttribute ProductEntity prod,Model model)
	{

		//ProductRepo.UpdateCounter(prod.getStoreName(), prod.getName());
		 model.addAttribute("prod", new ProductEntity());
		
		 ProductRepo.save(prod);
		 return "AddProd";
	}
	
}
