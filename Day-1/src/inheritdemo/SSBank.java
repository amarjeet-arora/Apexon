package inheritdemo;

public class SSBank extends FederalReserve {

	private static SSBank ssBank;
	private SSBank() {
		

		

	}
	public static SSBank loadInstance() {
		if(ssBank == null) {
			ssBank= new SSBank();
		}
		return ssBank;
	}

	public SSBank(int a, int b, int c) {
		super(a, b);
		this.c = c;
	}

	private int c;

	@Override
	public void checkBalance() {
		// TODO Auto-generated method stub

	}

	@Override
	public void withdraw() {
		// TODO Auto-generated method stub

	}

	@Override
	public void deposit() {
		// TODO Auto-generated method stub

	}

}
