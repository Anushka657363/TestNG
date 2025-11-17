package testNG;

import org.testng.annotations.Test;

public class TestNGEx11 {
	 @Test
		public void paymentTest() throws InterruptedException {
			System.out.println("PaymentMethod");
			Thread.sleep(2000);
		}
	    
	    @Test
	    public void LoginTest() {
	    	System.out.println("LoginMethod");
	    }
	    
	    @Test
	    public void BillingTest() {
	    	System.out.println("BillingMethod");
	    }
	    
	    @Test
	    public void RegistrationTest() {
	    	System.out.println("RegistrationMethod");
	    }
	    

}
