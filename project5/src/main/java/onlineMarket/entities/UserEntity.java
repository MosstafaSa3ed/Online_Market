package onlineMarket.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class UserEntity {
	@Id
	private String Email;
	private String Password;
	
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
