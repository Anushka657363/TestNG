package testNG;
import org.testng.Assert;
import org.testng.annotations.Test;
public class TestNGEx12 {
	@Test(retryAnalyzer=IRetryClass.class)
	public void login() {
		System.out.println("LoginTest");
		Assert.assertTrue(false);
	//	Assert.assertTrue(true);
		
	}

}
