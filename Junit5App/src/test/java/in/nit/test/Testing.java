package in.nit.test;


import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

@DisplayName("TESTING EMPLOYE TASK")
public class Testing {
	@RepeatedTest(value = 3)
	public static void setupOnce() {
		System.out.println("FROM ONETIME SETUP");
	}
	
	
	@BeforeEach
	public void setup() {
		System.out.println("FORM SETUP");
	}
	@Test
	@DisplayName("TESTING SETUP METHOD")
	public void testSave() {
		System.out.println("HELLO");
	}

	@Test
	public void testUpdate() {
		System.out.println("HELLO-UPDATE");
	}
	@Test
	public void testdelete() {
		System.out.println("HELLO-DELETE");
	}	
	@AfterEach
	public void clear() {
		System.out.println("CLEAR DATA");
	}
	@AfterAll
	public static void closeAll() {
		System.out.println("ONCE AT END");
	}
	

	
}

