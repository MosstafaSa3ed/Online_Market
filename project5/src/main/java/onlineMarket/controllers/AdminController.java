package onlineMarket.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import onlineMarket.entities.BrandEntity;
import onlineMarket.entities.SysProductEntity;
import onlineMarket.repositories.BrandRepository;

@Controller
public class AdminController {
	
	@GetMapping("/addSysProd")
	public String AddSysProd(Model model)
	{
		model.addAttribute("sysProd",new SysProductEntity());
		return "addSysProd";
	}
	@PostMapping("/addSysProd")
	public String addProd(@ModelAttribute SysProductEntity sysProd)
	{
		SysProductController sys = new SysProductController();
		sys.addPro(sysProd);
		return "addSysProd";
	}
	
	
	@GetMapping("/addBrand")
	public String add(Model model)
	{
		model.addAttribute("brand",new BrandEntity());
		return "addBrand";
	}
	@PostMapping("/addBrand")
	public String addBrand(@ModelAttribute BrandEntity brand)
	{
		BrandController b = new BrandController();
		b.addBrand(brand);
		return "addBrand";
	}
	
}
