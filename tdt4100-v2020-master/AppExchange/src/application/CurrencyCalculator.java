package application;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class CurrencyCalculator {

	private String inCurrency, outCurrency;
	private double inAmount;
	
    ArrayList<Currency> resultCurrencyList = new ArrayList<>(); //("NOK", "KRW", "SEK", "DKK");
    
    private ArrayList<String> currencyList = new ArrayList<>();
	private ArrayList<Double> rateList = new ArrayList<>();

	
    
    public CurrencyCalculator() {
    }
    
    
    public CurrencyCalculator(ArrayList<String> currencyList, ArrayList<Double> rateList, String inCurrency, String outCurrency, double inAmount) {
    	this.currencyList = currencyList;
    	this.rateList = rateList;
    	this.inCurrency = inCurrency;
    	this.outCurrency = outCurrency;
    	this.inAmount = inAmount;
    }
    
	public double getResult() {
		//boolean flag = true; 
		double result = inAmount;
		
		for(int i=0; i<currencyList.size();i++) {
			if (currencyList.get(i) == inCurrency){
				result = result / rateList.get(i);
				System.out.println("here in Currency! ");
			}
			
			if (currencyList.get(i) == outCurrency){
				result = result * rateList.get(i);
				System.out.println("here out Currency! ");
			}
		}
		
		return result;
		
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// CurrencyCalculatorRead Calculator = new CurrencyCalculatorRead(inCurrency, outCurrency, inAmount);
	}

}
