package sprint1;

public class BuyerEntity extends User_entity {
	private static int BuyerID=10000;
	public static int getBuyerID() {
		return BuyerID;
	}
	public BuyerEntity(String email,String pass)
	{
		setEmail(email);
		setPassword(pass);
		setID(BuyerID++);
	}
}
