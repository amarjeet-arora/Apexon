package junitdemo;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.rules.*;

public class CalculatorTest {
	static Calculator cal;
	@Rule
	public Timeout globalTimeout= Timeout.seconds(2);

	@BeforeClass
	@DisplayName("called before test")
	public static void callBefore() {
		System.out.println("called");
       cal= new Calculator();
	}

	@Test()
	@DisplayName("testing in timeframe")
	public void testAdd() throws InterruptedException {
		TimeUnit.SECONDS.sleep(1);
     assertEquals(20, cal.add(10, 10));
	}

	@Test
	
	public void testMul() {
		assertEquals(100, cal.mul(10, 10));
	}
	@AfterClass
	public static void callAfter() {
		System.out.println("called at last");
       cal= null;
	}
}
