package onlineMarket.entities;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class AdminEntity extends UserEntity
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer AdminId;
	public AdminEntity() {}
	public AdminEntity(String email,String pass)
	{
		setEmail(email);
		setPassword(pass);	
	}
}
