package application;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class CurrencyCalculatorRead {

	private String inCurrency, outCurrency;
	private double inAmount;
	
    ArrayList<Currency> resultCurrencyList = new ArrayList<>(); //("NOK", "KRW", "SEK", "DKK");
    
    private ArrayList<String> currencyList = new ArrayList<>();
	private ArrayList<Double> rateList = new ArrayList<>();

	
    
    public CurrencyCalculatorRead() {
    }
    
    
    public CurrencyCalculatorRead(ArrayList<String> currencyList, ArrayList<Double> rateList, String inCurrency, String outCurrency, double inAmount) {
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
		
		/*
		
		for(int i=0; i<currencyList.size();i++) {
			System.out.println("Wow!");
			System.out.println(currencyList.get(i));
			resultCurrencyList.add(new Currency(currencyList.get(i), inAmount/rateList.get(i) ));
		} // this shows the value of money in every currency types. 
		
		for(int j=0; j<currencyList.size();j++) {
			if (outCurrency == resultCurrencyList.get(j).getName()) {
				flag = false;
				return resultCurrencyList.get(j).getAmount()*rateList.get(j);
			} // this shows the value of money by outCurrency selected. 
		}
		
		return 0.0;
		
		*/
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// CurrencyCalculatorRead Calculator = new CurrencyCalculatorRead(inCurrency, outCurrency, inAmount);
	}

}
