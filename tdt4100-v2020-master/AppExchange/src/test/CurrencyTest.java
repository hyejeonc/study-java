package test;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import application.Currency;

public class CurrencyTest {

	Currency currency;	
	
	@Before
	public void setUp() throws Exception {
		currency = new Currency("NOK", 1.0);
	}

	@Test
	public void testSetName() {
		assertEquals(currency.getName(), "NOK");
		currency.setName("SEK");
		assertEquals(currency.getName(), "SEK");
	}

	@Test
	public void testSetRate() {
		currency.setRate(1.5);
		assertEquals(1.5, currency.getRate(), 0.0001);
	}

	@Test
	public void testGetName() {
		currency.setName("DKK");
		assertEquals("DKK", currency.getName());
	}
	
	@Test
	public void testGetRate() {
		currency.setRate(1.5);
		assertEquals(1.5, currency.getRate(), 0.0001);
	}


	

}
