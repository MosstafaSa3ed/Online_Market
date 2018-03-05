package com.swe;

import sprint1.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller

public class UserController {
	database db= new database();
	@RequestMapping("/")
	//@ResponseBody
	public String index()
	{
		return "page";
		//return new ModelAndView("redirect:index.html");
	}
	
	@RequestMapping("/l")
	public ModelAndView index1()
	{
		return new ModelAndView("redirect:login.html");
	}
	
	@RequestMapping("/log" )
	public ModelAndView login(@RequestParam("email")String name,@RequestParam("pass")String pass,@RequestParam("select")String type,Model model )
	{
		if(type.equals("buyer"))
		{
			BuyerEntity entity=new BuyerEntity(name,pass);
			System.out.println(db.buyers.size());
			
			for(int i=0 ; i<db.buyers.size();i++)
			{
				if(db.buyers.get(i).getEmail().equals( name ) && db.buyers.get(i).getPassword().equals( pass ))
				{
					return new ModelAndView("redirect:buyerHome.html");
				}
			}
			return new ModelAndView("redirect:login.html");
		}
		else if(type.equals("seller"))
		{
			SellerEntity entity=new SellerEntity(name,pass);
			for(int i=0 ; i<db.sellers.size();i++)
			{
				if(db.sellers.get(i).getEmail().equals( name ) && db.sellers.get(i).getPassword().equals( pass ))
				{
					return new ModelAndView("redirect:sellerHome.html");
				}
			}
			return new ModelAndView("redirect:login.html");
		}
		else
		{
			AdminEntity entity=new AdminEntity(name,pass);
			if( entity.getEmail().equals(name) && entity.getPassword().equals(pass))
				return new ModelAndView("redirect:adminHome.html");
			return new ModelAndView("redirect:login.html");
		}
	}
	

	@RequestMapping("/register" )
	//@ResponseBody
	public ModelAndView register(@RequestParam("email") String email,@RequestParam("pass") String pass,@RequestParam("select") String type,Model model)
	{
		
		if(type.equals("buyer"))
		{
			BuyerEntity entity=new BuyerEntity(email,pass);
			ModelAndView m=new ModelAndView("redirect:buyerHome.html");
			m.addObject("name",email);
			
			for(int i=0 ; i<db.buyers.size();i++)
			{
				if(db.buyers.get(i).getEmail().equals( email ) )
				{
					return new ModelAndView("redirect:index.html");
				}
			}
		
			db.buyers.addElement(entity);
			return m;
			
		}
		else {
			SellerEntity entity=new SellerEntity(email,pass);
			ModelAndView m=new ModelAndView("redirect:sellerHome.html");
			m.addObject("name",email);
			
			for(int i=0 ; i<db.sellers.size();i++)
			{
				if(db.sellers.get(i).getEmail().equals( email ) )
				{
					return new ModelAndView("redirect:index.html");
				}
			}
		
			db.sellers.addElement(entity);
			return m;
		}
	}
	@RequestMapping("/done")
	public ModelAndView addSysProd(@RequestParam("pname") String pname,@RequestParam("cname") String cname,@RequestParam("lp") double lp,@RequestParam("hp") double hp,Model model)
	{
		SysProductEntitiy entity=new SysProductEntitiy(pname,cname,lp,hp);
		
		for(int i=0 ; i<db.sysProducts.size();i++)
		{
			if(db.sysProducts.get(i).getName().equals(pname) && db.sysProducts.get(i).getCate().equals(cname))
			{
				return new ModelAndView("redirect:adminHome.html");
			}
		}
		db.sysProducts.addElement(entity);
		return new ModelAndView("redirect:Padded.html");
	
	}
}
