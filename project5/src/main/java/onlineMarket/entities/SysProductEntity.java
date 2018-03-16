package onlineMarket.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class SysProductEntity {
	@Id
	private String Name;
	private String Brand;
	private double LowPrice,HighPrice;


	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getBrand() {
		return Brand;
	}
	public void setBrand(String brand) {
		Brand = brand;
	}
	public double getLowPrice() {
		return LowPrice;
	}
	public void setLowPrice(double lowPrice) {
		LowPrice = lowPrice;
	}
	public double getHighPrice() {
		return HighPrice;
	}
	public void setHighPrice(double highPrice) {
		HighPrice = highPrice;
	}

}
