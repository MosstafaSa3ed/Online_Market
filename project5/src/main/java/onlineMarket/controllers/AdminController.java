package onlineMarket.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import onlineMarket.entities.AdminEntity;
import onlineMarket.entities.BrandEntity;
import onlineMarket.entities.BuyerEntity;
import onlineMarket.entities.SysProductEntity;
import onlineMarket.repositories.AdminRepository;

@Controller
public class AdminController {
	
	@Autowired
	AdminRepository AdminRepo;
	
	@RequestMapping("/")
	public String home()
	{
		return "Home";
	}
	@RequestMapping("/Register")
	public String Register()
	{
		return "Register";
	}
	
	@RequestMapping("/Login")
	public String Login()
	{
		return "Login";
	}
	
	@GetMapping("/AdminLogin")
	public String login(Model model)
	{
		model.addAttribute("admin",new BuyerEntity() );
		return "AdminLogin";
	}
	
	@PostMapping("/AdminLogin")
	public String select(@ModelAttribute AdminEntity admin,Model model)
	{
		model.addAttribute("admin",new AdminEntity() );
		if(AdminRepo.exists(admin.getEmail())) 
		{
			AdminEntity a= (AdminEntity) AdminRepo.findOne(admin.getEmail()); 
			if(a.getPassword().equals(admin.getPassword()) )
				return "AdminHome";
		}
			return "Home";
		
	}
	
	@GetMapping("/AddBrand")
	public String AddBrand(Model model)
	{
		model.addAttribute("brand",new BrandEntity());
		return "AddBrand";
	}
	
	@GetMapping("/AddSysProd")
	public String AddSysProd(Model model)
	{
		model.addAttribute("SysProd",new SysProductEntity());
		return "AddSysProd";
	}
	
	
	
	/*@GetMapping("/addBrand")
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
	}*/
	
}
