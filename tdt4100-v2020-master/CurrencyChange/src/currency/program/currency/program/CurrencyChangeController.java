package currency.program;

import java.awt.Label;
 
import java.net.URL;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
 
public class CurrencyChangeController implements Initializable{
    
    ObservableList<String> list = FXCollections.observableArrayList("Mark", "Tom", "John", "Jack");
    @FXML private ComboBox<String> combobox; //fx:id 값이랑 동일하게
    @FXML private Label label; //fx:id 값이랑 동일하게
    
    
    
    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        //Combo();
        //combobox.setOnAction(event -> comboChange(event));
    }
    
    public void Combo() {
        //combobox.setItems(list);
    }
    
    public void comboChange(ActionEvent event) {
        combobox.getItems().addAll("Ram", "Ben", "Park", "Kim");
        //label.setText(combobox.getValue());
    }
    
    public void buttonAction(ActionEvent event) {
        combobox.getItems().addAll("Ram", "Ben", "Park", "Kim");
    }
}
