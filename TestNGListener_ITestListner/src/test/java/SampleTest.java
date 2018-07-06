import org.testng.SkipException;
import org.testng.annotations.Test;

public class SampleTest extends BaseTest {
	
	@Test
	public void test1() {
		System.out.println("I am in Test1 test method and it will pass");
	}
	
	@Test(expectedExceptions = RuntimeException.class)
	public void test2() {
		System.out.println("I am in Test2 test method and it will fail");
	}
	
	@Test
	public void test3() {
		//System.out.println("Skipping the test3 test method");
		throw new SkipException("Skipping the test3 test method");
	}
}
