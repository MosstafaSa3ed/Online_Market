package onlineMarket.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class SysProductEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer Id;
	private String Name,Cate;
	private double LowPrice,HighPrice;
	private BrandEntity brand;
	public BrandEntity getBrand() {
		return brand;
	}
	public void setBrand(BrandEntity brand) {
		this.brand = brand;
	}
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getCate() {
		return Cate;
	}
	public void setCate(String cate) {
		Cate = cate;
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
