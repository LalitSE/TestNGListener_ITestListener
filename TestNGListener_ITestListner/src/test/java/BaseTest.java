import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
	
	@BeforeMethod
	public void startBeforeTest() {
		System.out.println("This method will execute before Test");
	}
	
	@AfterMethod
	public void endAfterTest() {
		System.out.println("This method will execute after Test");
	}
}
