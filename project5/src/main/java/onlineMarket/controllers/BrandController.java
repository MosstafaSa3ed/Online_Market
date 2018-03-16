package onlineMarket.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import onlineMarket.entities.AdminEntity;
import onlineMarket.entities.BrandEntity;
import onlineMarket.entities.BuyerEntity;
import onlineMarket.entities.SysProductEntity;
import onlineMarket.repositories.BrandRepository;

@Controller
public class BrandController {
	@Autowired
	private BrandRepository BrandRepo;
	
	@PostMapping("/AddBrand")
	public String addBrand(@ModelAttribute BrandEntity brand,Model model)
	{
		model.addAttribute("brand", new BrandEntity());
		if(!BrandRepo.exists(brand.getName())) {
			BrandRepo.save(brand);
			return "AdminHome";
		}
		
		return "AddBrand";
	}
}
