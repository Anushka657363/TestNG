package testNG;
import org.testng.annotations.Test;

public class TestNGEx3 {
    @Test
	public void paymentTest() {
		System.out.println("TestMethod");	
	}
    
    @Test(priority=1)
    public void LoginTest() {
    	System.out.println("LoginMethod");
    }
    
    @Test(priority=2)
    public void BillingTest() {
    	System.out.println("BillingMethod");
    }
    
    @Test
    public void RegistrationTest() {
    	System.out.println("RegistrationMethod");
    }
    
    


}
