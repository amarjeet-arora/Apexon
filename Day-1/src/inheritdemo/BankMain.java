package inheritdemo;
//singleton design pattern
public class BankMain {
	public static void main(String[] args) {
		
		SSBank ss=SSBank.loadInstance();
		System.out.println(ss.hashCode());
		
		
		SSBank ss2=SSBank.loadInstance();
		System.out.println(ss2.hashCode());
		
		
		 
	}

}
