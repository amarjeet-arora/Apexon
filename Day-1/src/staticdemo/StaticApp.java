package staticdemo;

public class StaticApp {
	// instance var
	 int b=30;
	 // class variable
	 static int a=10; 
	 public void showStan() {
		 System.out.println("show stan");
	 }
	
	public static void show() {
		System.out.println("inside show ");
	}
	static {
		System.out.println("inside static block " +a);
	}
	
}
