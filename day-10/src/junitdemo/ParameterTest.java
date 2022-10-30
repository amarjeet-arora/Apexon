package junitdemo;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ParameterTest {
	
	public static int[][] data(){
		return new int[][] {{1,2,2},{5,3,15},{121,4,484}};
	}
	@ParameterizedTest()
	@MethodSource(value = "data")
	@Tag("DEV")
	void testWithPara(int [] data) {
		MyClass mc= new MyClass();
		int m1= data[0];
		int m2=data[1];
		int expected= data[2];
		assertEquals(expected, mc.multiply(m1, m2));
		
	}
	class MyClass {
		public int multiply(int i, int j) {
			return i*j;
		}
	}

}
