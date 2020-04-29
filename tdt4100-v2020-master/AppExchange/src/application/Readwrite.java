package application;

import java.io.*;
import java.lang.Object;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import javafx.collections.FXCollections;
import javafx.scene.control.ComboBox;

public interface Readwrite {
	//Abstract method
	//void read(String path, ArrayList<Double> rateList, ArrayList<String> currencyList);
	
	//default method 
	// 여러 값 반환> ListArray<Double> rateList
	default void write(String path, String inCurrency, String outCurrency, double inAmount, double outAmount) {
		try{
            
            File file = new File(path);
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
            
            if(file.isFile() && file.canWrite()){
                //쓰기
                bufferedWriter.write("Input: ");
                bufferedWriter.write(Double.toString(inAmount));
                bufferedWriter.write(" ");
                bufferedWriter.write(inCurrency);
                //개행문자쓰기
                bufferedWriter.newLine();
                bufferedWriter.write("Output: ");
                bufferedWriter.write(Double.toString(outAmount));
                bufferedWriter.write(" ");
                bufferedWriter.write(outCurrency);
                
                bufferedWriter.close();
            }
        }catch (IOException e) {
            System.out.println(e);
        }
	}
	
	default Object[] read(String path) {
    	// Feedback: read write both in interface not in controller. 
    	// Implement: write with adding lines not replacing 
    	// 경로를 읽어서 
    	
		ArrayList<Double> rateList = new ArrayList<>();
		ArrayList<String> currencyList = new ArrayList<>();
		
		try{
	        File file = new File(path); // File object 
	        FileReader filereader = new FileReader(file); // Filereader object 
	        BufferedReader bufReader = new BufferedReader(filereader); // Buffer object 
	        
	        String line = "";
	        while((line = bufReader.readLine()) != null){
	            System.out.println(line); //.readLine()은 끝에 개행문자를 읽지 않는다.  
	            
	            try{
	            	rateList.add(Double.valueOf(line)); // 더블이면 rateList 에 추가 
	            	System.out.println("#######Here");
	            }catch(NumberFormatException e){
	            	System.out.println("########There"); 
	            	currencyList.add(line); // 문자 currencyList 에 추가 
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
		
		Object[] results = new Object[2];
		results[0] = currencyList;
		results[1] = rateList;
		
		return results;
		
		}
    
	
	
	
}
