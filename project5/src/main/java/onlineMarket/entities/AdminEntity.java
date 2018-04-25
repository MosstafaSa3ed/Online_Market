package onlineMarket.entities;

import javax.persistence.Entity;
@Entity
public class AdminEntity extends UserEntity
{
	public AdminEntity() {}
	public AdminEntity(String email,String pass)
	{
		setEmail(email);
		setPassword(pass);	
	}
}
