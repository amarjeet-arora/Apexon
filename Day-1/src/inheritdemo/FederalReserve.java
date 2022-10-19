package inheritdemo;

public abstract class FederalReserve {

	public abstract void checkBalance();
	public abstract void withdraw();
	public abstract void deposit();
	
	private int a;
	private int b;
	public FederalReserve(int a, int b) {
		 
		this.a = a;
		this.b = b;
	}
	
	public FederalReserve(){
		
	}
	
}
