package sprint1;

public class SellerEntity extends User_entity {
	
	private static int SellerID=20;
	
	public static int getSellerID() {
		return SellerID;
	}
	
	public SellerEntity(String email,String pass)
	{
		setID(SellerID++);
		setPassword(pass);
		setEmail(email);
	}

}
