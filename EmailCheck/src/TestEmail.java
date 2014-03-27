import static org.junit.Assert.*;

import org.junit.Test;


public class TestEmail {
	
	EmailCheck ec = new EmailCheck(); 

	@Test
	public void test() {
		assertTrue("Det ser ok ut", ec.okEmail("robin.eklund23@gmail.com"));
	}
	
	
	@Test
	public void isEmpty(){
		assertFalse("Du glömde skriva in email", ec.okEmail("")); 
	}
	
	@Test
	public void noAt(){
		assertFalse("Den har inget @", ec.okEmail("robingmail.com"));
	}
	

}
