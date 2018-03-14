package onlineMarket.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import onlineMarket.entities.BrandEntity;
import onlineMarket.entities.BuyerEntity;
import onlineMarket.entities.SysProductEntity;
import onlineMarket.repositories.BrandRepository;

@Controller
public class BrandController {
	@Autowired
	private BrandRepository BrandRepo;
	
	public String addBrand(BrandEntity brand)
	{
	//	model.addAttribute("brand", new BuyerEntity());
		BrandRepo.save(brand);
		return "addBrand";
	}
}
