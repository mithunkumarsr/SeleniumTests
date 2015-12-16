package learning;
import org.testng.SkipException;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SellItemsTest {
	
	@BeforeTest
	public void shouldBeSkipped(){
		//Check whether the user has loggedin Condition
		if (!isLoggedIn()){
			throw new SkipException("Skipping because user has not logged in");
		}
	}
	
	@Test
	public void testSellingBooks(){
		System.out.println("Testing the books sale");	
	}
	
	public boolean isLoggedIn(){
		return false;
	}
}
