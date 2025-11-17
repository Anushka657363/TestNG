package testNG;

import org.testng.annotations.Test;

public class TestNgEx6 {
	  @Test(groups={"sanity"})
		public void paymentTest() {
			System.out.println("TestMethod");	
		}
	    
	    @Test(groups={"smoke"})
	    public void LoginTest() {
	    	System.out.println("LoginMethod");
	    }
	    
	    @Test(groups={"sanity"})
	    public void BillingTest() {
	    	System.out.println("BillingMethod");
	    }
	    
	    @Test(groups={"smoke,Regression"})
	    public void RegistrationTest() {
	    	System.out.println("RegistrationMethod");
	    }
	    

}
