package onlineMarket.entities;

import javax.persistence.Entity;

@Entity
public class BuyerEntity extends UserEntity 
{
	public BuyerEntity() {}
	public BuyerEntity(String email,String pass)
	{
		setEmail(email);
		setPassword(pass);
		
	}

}
