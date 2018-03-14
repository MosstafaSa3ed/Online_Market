package onlineMarket.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import onlineMarket.entities.BrandEntity;
import onlineMarket.entities.ProductEntity;
import onlineMarket.entities.SysProductEntity;
import onlineMarket.repositories.ProductRepository;
import onlineMarket.repositories.SysProductRepository;

@Controller
public class SysProductController {
	@Autowired
	private SysProductRepository SysProductRepo;
	
	
	public String addPro(SysProductEntity SPE)
	{
	//	model.addAttribute("brand", new BuyerEntity());
		SysProductRepo.save(SPE);
		return "addSysProd";
	}
	
}
