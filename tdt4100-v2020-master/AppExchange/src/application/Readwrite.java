package application;

import java.io.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public interface Readwrite {
	//Abstract method
	void read(String path, ArrayList<Double> rateList, ArrayList<String> currencyList);
	
	//default method 
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
}
