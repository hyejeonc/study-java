package application;
// mathematics + logic + computatation in another class - CurrencyCalculator 
// controller is only for linking for GUI 
// possibility to add more currencies with rates in the calculator
// possibility to change the rate of already existing currencies
// save + load 

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
//import javafx.scene.control.Button;
import javafx.scene.control.*;
//import javafx.scene.control.Label;
//import javafx.scene.control.TextField;

//import java.awt.Label; 
 
public class SampleController implements Initializable{
    
    ObservableList<String> list = FXCollections.observableArrayList("NOK", "KRW", "SEK", "DKK");
    @FXML public ComboBox<String> comboboxIn, comboboxOut; //fx:id 값이랑 동일하게
    @FXML public Label myLabel; //fx:id 값이랑 동일하게
    @FXML public TextField textfieldIn;
    
    private String inCurrency, outCurrency;
    private float nok, krw, sek, dkk, inAmount, outAmount;
    
    
    //nok = 1;
    //krw = 0.77;
    //sek = 0.97;
    //dkk = 1.37;
    
    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        Combo();
        //comboboxOut.setItems(list);
        //combobox.setOnAction(event -> comboChange(event));
    }
    
    public void Combo() {
    	//comboboxOut.getItems().addAll("NOK", "KRW", "SEK", "DKK");
        comboboxOut.setItems(list);
        comboboxIn.setItems(list);
    }
    
    public void comboChangeIn(ActionEvent event) {
        inCurrency = comboboxIn.getValue();
        
    }
    
    public void comboChangeOut(ActionEvent event) {
    	outCurrency = comboboxOut.getValue();
    }
    
    public void buttonAction(ActionEvent event) {
    	double r = 0;
    	double result = 0;
    	
    	inAmount = Float.valueOf(textfieldIn.getText());
    	
    	System.out.println(outCurrency);
    	
    	if (outCurrency == "NOK") {// r을 위에껄로 나눠
        	r = 1; 
        } else if (outCurrency == "KRW") {
        	r = 0.77;
        } else if (outCurrency == "SEK") {
        	r = 0.91;
        } else if (outCurrency == "DKK") {
        	r = 1.37;
        }
    	//System.out.println(r);
    	//System.out.println(inAmount);
    	System.out.println(inCurrency);
    	
    	if (inCurrency == "NOK") {// r을 위에껄로 나눠
        	result = inAmount * r / 1; 
        	
        } else if (inCurrency == "KRW") {
        
        	// System.out.println(r);
        	result = inAmount * r / 0.77; 
        	//System.out.println(result);
        } else if (inCurrency == "SEK") {
        	
        	result = inAmount * r / 0.91; 
        } else if (inCurrency == "DKK") {
        
        	result = inAmount * r / 1.37; 
        }
    	System.out.println(result);
    	myLabel.setText(Double.toString(result));
    	
    }
}
