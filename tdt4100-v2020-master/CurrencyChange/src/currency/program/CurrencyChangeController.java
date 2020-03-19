// https://worri.tistory.com/114
// https://aristatait.tistory.com/31 [aristataIT]
// http://btsweet.blogspot.com/2014/04/javafx4-fxml-ui.html
// http://btsweet.blogspot.com/2014/03/javafx1-hello-javafx.html

package currency.program;

import java.net.URL;
import java.util.ResourceBundle;
 
import java.util.ArrayList;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;

public class CurrencyChangeController {
	ArrayList<Currency> currency = new ArrayList<Currency>();
	String inCurrency, outCurrency;
	
	@FXML 
	ComboBox inCombo, outCombo;
	
	ObservableList<String> list = FXCollections.observableArrayList("NOK", "KRW", "SEK", "DKK");
	
	@FXML
	TextField inText, outText;
	
	@FXML
	Button btnExchange;
	
	@FXML
	void initialize(URL location, ResourceBundle resources) {
		//currency.add(Currency("NOK", 1.0));
		//currency.add(Currency("KRW", 0.016));	
		//currency.add(Currency("SEK", 1.89));	
		//currency.add(Currency("DKK", 2.68));	
		combobox.setItems(list);
	}
	
	@FXML
	public void btnChange() {
		
		
		currency.getAmount()
		currency.setCurrency(inText);
		
	}
}
