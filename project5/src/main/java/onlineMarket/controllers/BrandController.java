package onlineMarket.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import onlineMarket.entities.BrandEntity;
import onlineMarket.repositories.BrandRepository;

@RestController
@RequestMapping("/brand")
@CrossOrigin(origins="http://localhost:3000",allowedHeaders="*")
public class BrandController {
	@Autowired
	private BrandRepository BrandRepo;
	
	@RequestMapping("add/{name}/{descreption}")
	public boolean add(@PathVariable String name , @PathVariable String descreption)
	{
		BrandEntity brand= new BrandEntity(name,descreption);
		if(name!=null && descreption!=null && !BrandRepo.exists(name))
		{
			BrandRepo.save(brand);
			return true;
		}
		return false;
	}

}
