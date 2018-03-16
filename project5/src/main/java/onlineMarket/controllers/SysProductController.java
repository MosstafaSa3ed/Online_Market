package onlineMarket.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import onlineMarket.entities.SysProductEntity;
import onlineMarket.repositories.BrandRepository;
import onlineMarket.repositories.SysProductRepository;

@Controller
public class SysProductController {
	@Autowired
	SysProductRepository SysProductRepo;
	@Autowired
	BrandRepository BrandRepo;
	
	@PostMapping("/AddSysProd")
	public String addProd(@ModelAttribute SysProductEntity sysProd,Model model)
	{
		model.addAttribute("SysProd", new SysProductEntity());
		if(!SysProductRepo.exists(sysProd.getName()) && BrandRepo.exists(sysProd.getBrand()) ) {
			SysProductRepo.save(sysProd);
			return "AdminHome";
		}
		
		return "AddSysProd";
	}
	
	
	
}
