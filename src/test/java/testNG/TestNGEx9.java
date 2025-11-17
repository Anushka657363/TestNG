package testNG;
import org.testng.annotations.Test;

public class TestNGEx9 {
	//this execute the methods parallely
	@Test
	public void m1() {
		for(int i=0;i<=100;i++) {
			System.out.println(i);
		}
	}
	
	public void m2() {
		for(int i=101;i<=200;i++) {
			System.out.println(i);
		}
	}
	
	public void m3() {
		for(int i=201;i<=300;i++) {
			System.out.println(i);
		}
	}
	public void m4() {
		for(int i=301;i<=400;i++) {
			System.out.println(i);
		}
	}

}
