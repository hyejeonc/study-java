package application;
//
// mathematics + logic + computatation in another class - CurrencyCalculator 
// controller is only for linking for GUI 
// possibility to add more currencies with rates in the calculator
// possibility to change the rate of already existing currencies
// save + load 

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.*;
//import javafx.scene.control.Label;
import javafx.scene.control.TextField;

//import java.awt.Label; 
 
public class SampleController implements Initializable, Readwrite{
    
    
    @FXML public ComboBox<String> comboboxIn, comboboxOut; //
    @FXML public Label myLabel; // Result
    @FXML public TextField textfieldIn; // Input 
    @FXML public Button buttonRead, buttonExchange; 
    
    private String inCurrency, outCurrency;
    private double inAmount, outAmount;
    ArrayList<String> currencyList = new ArrayList<>();
	ArrayList<Double> rateList = new ArrayList<>();
    
	ObservableList<String> list = FXCollections.observableArrayList();
    
    
    //nok = 1;
    //krw = 0.77;
    //sek = 0.97;
    //dkk = 1.37;
    
    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        Combo();
        comboboxOut.setItems(list);
        //combobox.setOnAction(event -> comboChange(event));
    }
    
    public void Combo() {
    	
    	
    	
        
    }
    
    public void comboChangeIn(ActionEvent event) {
        inCurrency = comboboxIn.getValue();
        
    }
    
    public void comboChangeOut(ActionEvent event) {
    	outCurrency = comboboxOut.getValue();
    }
    
    
    public void buttonAction(ActionEvent event) {
    	
    	if (inCurrency == outCurrency) {
    		System.out.println("Yo! You select same currencies to exchange. Try again!");
    		myLabel.setText("Nah, try again!");
    	}else {
    		try{
    			inAmount = Double.valueOf(textfieldIn.getText());
    		} catch (NumberFormatException e) {
    			System.out.println(e);
                System.out.println("Yo! You must insert number value for amount of money!");
    		}
    		
        	CurrencyCalculatorRead Calculator = new CurrencyCalculatorRead(currencyList, rateList, inCurrency, outCurrency, inAmount);
        	
        	//System.out.println(outCurrency);
        	outAmount = Calculator.getResult();
        	myLabel.setText(Double.toString(outAmount));	
    	}
    	
    }
    
    public void readAction(ActionEvent event) {
    	
    	read("/Users/hye/Documents/study-java/tdt4100-v2020-master/AppExchange/src/application/test.txt", rateList, currencyList);

    	//inAmount = Float.valueOf(textfieldIn.getText());
    	//CurrencyCalculatorRead Calculator = new CurrencyCalculatorRead(inCurrency, outCurrency, inAmount);
    	
    	//System.out.println(outCurrency);
    	//myLabel.setText(Double.toString(Calculator.getResult()));	
    }
    
    public void writeAction(ActionEvent event) {
    	write("/Users/hye/Documents/study-java/tdt4100-v2020-master/AppExchange/src/application/result.txt", inCurrency, outCurrency, inAmount, outAmount);
    }
    
    @Override
    public void read(String path, ArrayList<Double> rateList, ArrayList<String> currencyList) {
    	// Feedback: read write both in interface not in controller. 
    	// Implement: write with adding lines not replacing 
    	
		try{
	        File file = new File(path); // File object 
	        FileReader filereader = new FileReader(file); // Filereader object 
	        BufferedReader bufReader = new BufferedReader(filereader); // Buffer object 
	        
	        String line = "";
	        while((line = bufReader.readLine()) != null){
	            System.out.println(line); //.readLine()은 끝에 개행문자를 읽지 않는다.  
	            
	            try{
	            	this.rateList.add(Double.valueOf(line));
	            	System.out.println("#######Here");
	            }catch(NumberFormatException e){
	            	System.out.println("########There");
	            	this.currencyList.add(line);
	            }
	        }
	        bufReader.close();
	        
	    }catch (FileNotFoundException e) {
	    	System.out.println("File does not exist!");
	    }catch(IOException e){
	        System.out.println(e);
	    }
		
		for(int i=0; i<currencyList.size(); i++) {
			System.out.println("########3");
    		System.out.println(currencyList.get(i));
    		System.out.println(rateList.get(i));
    		System.out.println("########4");
    	}
		
		list = FXCollections.observableArrayList(currencyList);
		for(int i=0; i<list.size(); i++) {
    		System.out.println(list.get(i));
    	}
		
		comboboxOut.getItems().addAll(list);
        comboboxOut.setItems(list);
        comboboxIn.setItems(list);
		
    }
		
    public static void main(String[] args) {
		// TODO Auto-generated method stub
    	//SampleController test = new SampleController(); 
    	
	}
}
