package onlineMarket.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class StoreEntity 
{
	@Id
	private String Name;
	private String SellerName;
	private String Location;
	private String type;
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getSellerName() {
		return SellerName;
	}
	public void setSellerName(String sellerName) {
		SellerName = sellerName;
	}
	public String getLocation() {
		return Location;
	}
	public void setLocation(String location) {
		Location = location;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
}
