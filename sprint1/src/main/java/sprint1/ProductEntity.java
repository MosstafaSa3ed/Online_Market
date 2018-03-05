package sprint1;

public class ProductEntity {
	private String Name,Cate;
	private int ID;
	private double price;
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	private static int ProductID=2000;
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
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public ProductEntity(String name, String cat , double price )
	{
		setPrice(price);
		setCate(cat);
		setName(name);
		setID(ProductID++);
	}
}
