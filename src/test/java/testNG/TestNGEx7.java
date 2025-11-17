package testNG;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
public class TestNGEx7 {
	//add these parameters value form xml file
	@Test
	@Parameters({"UserName","Password"})//this is used in xml
	public void login(String username,String password) {//these are local variables
		System.out.println("UserName:"+username+"Password: "+password);
	}
	
	

}
