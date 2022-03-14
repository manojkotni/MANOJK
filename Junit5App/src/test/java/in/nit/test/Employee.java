package in.nit.test;


import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class Employee {
	@Test
	@Tag("dev")
	
	public void testA() {
		System.out.println("HELLO-TEST-A");
	}
	@Test
	@Tag("prod")
	public void testB() {
		System.out.println("HELLO-TEST-B");
	}
	

}
