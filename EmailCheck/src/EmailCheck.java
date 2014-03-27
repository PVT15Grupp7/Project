
public class EmailCheck {
	
	public boolean okEmail(String email){
		
		if(email.isEmpty())
			return false; 
		
		if(!email.contains("@"))
			return false;
		
		return true; 
	}

}
