package onlineMarket.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


public class UserEntity {
	
	private String Email,Password;
	
	public UserEntity()
	{
		Email = "";
		Password = "";
	}
	public UserEntity(String Email, String Password)
	{
		this.Email = Email;
		this.Password = Password;
		
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String Email) {
		this.Email = Email;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String Password) {
		this.Password = Password;
	}
	

}
