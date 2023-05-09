package Exception_handling_custom_Bank;

public class IndicateDeposit  {

	private Double balance;

	

	public Double getBalance() {
		return balance;
	}


	public void setBalance(Double balance) {
		this.balance = balance;
	}


	public IndicateDeposit( double balance) {
		
		this.balance = balance;
	}
	
	
	public double withdraw()
	{
		return getBalance();
	}
	
}
