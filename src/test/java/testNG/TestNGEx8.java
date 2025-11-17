package testNG;
import org.testng.annotations.Test;
public class TestNGEx8 {
	
		@Test(enabled=false)
		public void paymentTest() {
			System.out.println("PaymentTest");
		}
		
		@Test(expectedExceptions=ArithmeticException.class)
		public void BillingTest() throws InterruptedException {
			System.out.println("BillingTest");
		//	Thread.sleep(1000);
			throw new ArithmeticException();
		}


}
