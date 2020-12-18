package business;

public class Bank {

	public int amount = 1000;
	private String acno = "kcb505";

	public int deposit(String acno, int dep_amount) {
		if (acno.equals(this.acno)) {
			this.amount = this.amount + dep_amount;
			System.out.println("deposit taking place...");
			return this.amount;
		} 
		else {
			return 0;
		}
		
	}
}
