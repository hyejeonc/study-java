package application;

public class Currency {
	private String name; // International name, i.e., NOK KRW SEK DKK 
	private float rate; // per NOK

	public Currency() {
		
	}
	
	public Currency(String name, float rate) {
		this.name = name;
		this.rate = rate;
	}
	
	public void setName(String newName) {
		name = newName;
	}
	
	public void setRate(float newRate) {
		rate = newRate;
	}

	public String getName() {
		return name;
	}
	
	public float getRate() {
		return rate;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}