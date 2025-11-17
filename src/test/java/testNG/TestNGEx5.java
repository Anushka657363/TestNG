package testNG;
import org.testng.annotations.Test;
public class TestNGEx5 {
	@Test(invocationCount=5)
	public void paymentTest() {
		System.out.println("PaymentMethod");
	}
	
	@Test(timeOut=2000)
	public void BillingTest() throws InterruptedException {
		System.out.println("BillingTest");
		Thread.sleep(1000);
	}

}
