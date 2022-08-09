package webapp;

public class UserValidationService {
	
	public boolean isUserValid(String user,String password) {
		if(user.equals("shubham")&&password.equals("shivade"))
		return true;
		
		return false;
	}

}
