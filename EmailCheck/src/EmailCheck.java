
public class EmailCheck {
	
	public boolean okEmail(String email){
		
		System.out.println("HEJ");
		System.out.println("HEJ PÅ DIG");
		
		if(email.isEmpty())
			return false; 
		
		if(!email.contains("@"))
			return false;
		
		return true; 
	}

}
