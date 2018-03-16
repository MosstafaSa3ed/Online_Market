package onlineMarket.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import onlineMarket.entities.BuyerEntity;
import onlineMarket.repositories.BuyerRepository;

@Controller
public class BuyerController {
	
	@Autowired
	BuyerRepository BuyerRepo; 
	
	@GetMapping("/BuyerRegister")
	public String register(Model model)
	{
		model.addAttribute("buyer",new BuyerEntity() );
		return "BuyerRegister";
	}
	
	@PostMapping("/BuyerRegister")
	public String addBuyer(@ModelAttribute BuyerEntity buyer,Model model)
	{
		model.addAttribute("buyer",new BuyerEntity() );
		if(!BuyerRepo.exists(buyer.getEmail())) {
			BuyerRepo.save(buyer);
			return "BuyerHome";
		}
		
		return "BuyerRegister";
	}
	
	@GetMapping("/BuyerLogin")
	public String login(Model model)
	{
		model.addAttribute("buyer",new BuyerEntity() );
		return "BuyerLogin";
	}
	
	@PostMapping("/BuyerLogin")
	public String select(@ModelAttribute BuyerEntity buyer,Model model)
	{
		model.addAttribute("buyer",new BuyerEntity() );
		if(BuyerRepo.exists(buyer.getEmail())) 
		{
			BuyerEntity b= (BuyerEntity) BuyerRepo.findOne(buyer.getEmail()); 
			if(b.getPassword().equals(buyer.getPassword()) )
				return "BuyerHome";
		}
			return "BuyerRegister";
		
	}
}
