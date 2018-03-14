package onlineMarket.entities;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class SellerEntity extends UserEntity 
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer SellerId;
	public SellerEntity() {}
	public SellerEntity(String email,String pass)
	{
		setEmail(email);
		setPassword(pass);	
	}
}
