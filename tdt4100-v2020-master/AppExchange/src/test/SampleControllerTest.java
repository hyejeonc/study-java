package test;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

import application.SampleController;
import javafx.collections.FXCollections;
import application.Readwrite;

public class SampleControllerTest {
	SampleController sampleController;
	
	@Test
	public void testRead() {
		Object[] readResult = new Object[2];
		readResult = sampleController.read("/Users/hye/Documents/study-java/tdt4100-v2020-master/AppExchange/src/application/test.txt");
		assertNotNull(readResult);
	}
	
	@Test
	public void testReadAction() {
		ArrayList<String> currencyList = new ArrayList<>(Arrays.asList("NOK", "KRW", "SEK", "DKK", "EUR"));
		ArrayList<Double> rateList = new ArrayList();
		rateList.add(1.0);
		rateList.add(1.11);
		rateList.add(0.91);
		rateList.add(0.62);
		rateList.add(0.086);
		
		assertEquals(sampleController.currencyList, currencyList);
		assertEquals(sampleController.rateList, rateList);
	}

	@Test
	public void testComboChangeIn() {
		assertNotNull(sampleController.inCurrency);
	}

	@Test
	public void testComboChangeOut() {
		fail("Not yet implemented");
	}

	@Test
	public void testButtonAction() {
		fail("Not yet implemented");
	}
	
	
	@Test
	public void testwrite() {
		Object[] writeResult = new Object[2];
		sampleController.read("/Users/hye/Documents/study-java/tdt4100-v2020-master/AppExchange/src/application/test.txt");
		fail("Not yet implemented");
		assertNotNull(writeResult);
	}
	
	@Test
	public void testWriteAction() {
		fail("Not yet implemented");
	}
	
	@Test
	public void testResetAction() {
		assertNotNull(sampleController.comboboxIn);
		assertNotNull(sampleController.comboboxOut);
		assertNotNull(sampleController.rateList);
		assertNotNull(sampleController.currencyList);	
	}

}
