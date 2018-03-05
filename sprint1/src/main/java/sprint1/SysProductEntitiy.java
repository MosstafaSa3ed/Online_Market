package sprint1;

public class SysProductEntitiy {
	private String Name,Cate;
	private int ID;
	private double LowPrice,HighPrice;
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
	public static int getProductID() {
		return SysProductID;
	}
	public static void setProductID(int productID) {
		SysProductID = productID;
	}
	private static int SysProductID=1;
	
	public SysProductEntitiy(String name, String cat , double lp , double hp)
	{
		setCate(cat);
		setName(name);
		setHighPrice(hp);
		setLowPrice(lp);
		setID(SysProductID++);
	}
	
}
