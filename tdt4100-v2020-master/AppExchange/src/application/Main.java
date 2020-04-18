package application;
// https://stackoverflow.com/questions/57553993/no-window-comes-up-when-running-javafx-application    
import javafx.application.Application;
 
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.fxml.FXMLLoader;


public class Main extends Application {
    @Override
    public void start(Stage primaryStage) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("AppExchange.fxml"));
            Scene scene = new Scene(root,400,400); 
            
            primaryStage.setTitle("Two");
            primaryStage.setScene(scene);
            primaryStage.show();
            System.out.println("On the end of showMainView()");
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
    
    public static void main(String[] args) {
        launch(args);
    }
}
 