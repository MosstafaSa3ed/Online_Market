package onlineMarket.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import onlineMarket.entities.AdminEntity;
import onlineMarket.entities.BrandEntity;
import onlineMarket.entities.BuyerEntity;
import onlineMarket.entities.SysProductEntity;
import onlineMarket.repositories.BrandRepository;

@RestController
@RequestMapping("/brand")

public class BrandController {
	@Autowired
	private BrandRepository BrandRepo;
	
	@RequestMapping("add/{name}/{descreption}")
	public ResponseEntity<BrandEntity> add(@PathVariable String name , @PathVariable String descreption)
	{
		BrandEntity brand= new BrandEntity(name,descreption);
		if(name!=null && descreption!=null && !BrandRepo.exists(name))
		{
			BrandRepo.save(brand);
			return new ResponseEntity<BrandEntity>(brand, HttpStatus.OK);
		}
		return new ResponseEntity<BrandEntity>(brand, HttpStatus.BAD_REQUEST);
	}
//	@PostMapping("/AddBrand")
//	public String addBrand(@ModelAttribute BrandEntity brand,Model model)
//	{
//		model.addAttribute("brand", new BrandEntity());
//		if(!BrandRepo.exists(brand.getName())) {
//			BrandRepo.save(brand);
//			return "AdminHome";
//		}
//		
//		return "AddBrand";
//	}
}
