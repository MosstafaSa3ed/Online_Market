package sprint1;

public class AdminEntity extends User_entity {
	private static int AdminID=1;
	public static int getAdminID() {
		return AdminID;
	}
	
	public AdminEntity(String email,String pass)
	{
		setEmail(email);
		setPassword(pass);
		setID(AdminID++);
	}
}
