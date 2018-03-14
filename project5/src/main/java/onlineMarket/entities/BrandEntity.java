package onlineMarket.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class BrandEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer BrandId;
	private String name,descreption;
	
	public Integer getBrandId() {
		return BrandId;
	}

	public void setBrandId(Integer brandId) {
		BrandId = brandId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescreption() {
		return descreption;
	}

	public void setDescreption(String descreption) {
		this.descreption = descreption;
	}

	public BrandEntity() {}
	
}
