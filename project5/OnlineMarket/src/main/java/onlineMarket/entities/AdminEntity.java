package onlineMarket.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
