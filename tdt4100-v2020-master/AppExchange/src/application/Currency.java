package application;

public class Currency {
	private String name; // International name, i.e., NOK KRW SEK DKK 
	private double rate; // rate

	public Currency() {
		
	}
	
	public Currency(String name, double rate) {
		this.name = name;
		this.rate = rate;
	}
	
	public void setName(String newName) {
		name = newName;
	}
	
	public void setRate(double newRate) {
		rate = newRate;
	}

	public String getName() {
		return name;
	}
	
	public double getRate() {
		return rate;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}