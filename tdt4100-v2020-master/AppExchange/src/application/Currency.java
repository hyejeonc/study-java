package application;

public class Currency {
	private String name; // International name, i.e., NOK KRW SEK DKK 
	private double amount; // Amount 

	public Currency() {
		
	}
	
	public Currency(String name, double amount) {
		this.name = name;
		this.amount = amount;
	}
	
	public void setName(String newName) {
		name = newName;
	}
	
	public void setRate(float newAmount) {
		amount = newAmount;
	}

	public String getName() {
		return name;
	}
	
	public double getAmount() {
		return amount;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}