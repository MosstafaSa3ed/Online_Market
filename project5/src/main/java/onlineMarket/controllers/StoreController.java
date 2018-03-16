package onlineMarket.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import onlineMarket.entities.BrandEntity;
import onlineMarket.entities.StoreEntity;
import onlineMarket.repositories.StoreRepository;


@Controller
public class StoreController
{
	@Autowired
	StoreRepository StoreRepo;
	
	@PostMapping("/AddStore")
	public String addBrand(@ModelAttribute StoreEntity store,Model model)
	{
		store.setSellerName(SellerController.sell.getEmail());
		model.addAttribute("store", new StoreEntity());
		if(!StoreRepo.exists(store.getName())) {
			StoreRepo.save(store);
			return "SellerHome";
			}
			
			return "AddStore";
	}
}


