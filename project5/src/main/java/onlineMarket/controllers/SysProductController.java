package onlineMarket.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import onlineMarket.entities.SysProductEntity;
import onlineMarket.repositories.BrandRepository;
import onlineMarket.repositories.SysProductRepository;

@RestController
@RequestMapping("/sysprod")
@CrossOrigin(origins="http://localhost:3000",allowedHeaders="*")
public class SysProductController {
	@Autowired
	SysProductRepository SysProductRepo;

	@Autowired
	BrandRepository BrandRepo;
	
	@RequestMapping("add/{name}/{brand}/{LowPrice}/{HighPrice}")
	public boolean add(@PathVariable String name , @PathVariable String brand,@PathVariable double LowPrice , @PathVariable double HighPrice)
	{
		SysProductEntity sys= new SysProductEntity(name,brand,LowPrice,HighPrice);
		SysProductEntity pro;
		pro= SysProductRepo.findByNameInAndBrandIn(name,brand);
		if(name!=null && brand!=null && LowPrice>=0.0 && HighPrice>=10 && pro==null && BrandRepo.exists(brand))
		{
			SysProductRepo.save(sys);
			return true;
		}
		return false;
	}
	

	
	
}
