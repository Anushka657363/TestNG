package testNG;
import org.testng.Assert;
import org.testng.annotations.Test;
public class TestNGEx4 {
	@Test(dependsOnMethods={"loginTest"})
	public void paymentTest() {
		System.out.println("PaymentTest");
	}
	@Test
	public void loginTest()
	{
		System.out.println("LoginTest");
		Assert.assertTrue(false);
		//if we pass true then payementtest method will executes
	}
	
	

}
