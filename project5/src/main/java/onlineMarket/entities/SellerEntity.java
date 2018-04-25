package onlineMarket.entities;

import javax.persistence.Entity;
@Entity
public class SellerEntity extends UserEntity 
{
	
	public SellerEntity() {}
	public SellerEntity(String email,String pass)
	{
		setEmail(email);
		setPassword(pass);	
	}
}
