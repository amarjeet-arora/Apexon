package junitdemo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Rule;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

 @Timeout(2)
public class AppTest {
	
	
	 
	@Test()
	 
	public void showTest() {
		System.out.println("demo test");
		assertEquals(10, 0);
	}

}
