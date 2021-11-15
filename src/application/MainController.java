/**
 * 
 */
package application;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.fxml.FXMLLoader;
//import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 * @author Alex
 *
 */
public class MainController {
	
	private String pizzaChoice = null;
	
	public String getPizzaChoice() {
		return this.pizzaChoice;
	}
	
	
	
	public void initalize() {
		
	}

	//modular load?
	private void launchCustomPizza() throws Exception {
		try {			
			FXMLLoader loader = new FXMLLoader(getClass().getResource("PizzaCustomView.fxml"));
			BorderPane root2 = (BorderPane) loader.load(); 
			PizzaCustomController pizzaView = loader.getController();			
			Scene scene2 = new Scene(root2);			
			Stage stage2 = new Stage();
			stage2.setTitle("Pizza Customization Station");
			stage2.setScene(scene2);
			stage2.show();
			pizzaView.setMainController(this);		
	    }
		catch(Exception e) {
	        e.printStackTrace();
	    }
	}
	
	/**
		FXMLLoader loader = new FXMLLoader(getClass().getResource("PizzaCustom.fxml"));
		BorderPane pizzaCustom = (BorderPane) loader.load();
		PizzaCustomController customView = loader.getController();
	*/
		//customView.setMainController(this);

		@FXML
		private Button deluxeButton;

		@FXML
		private Button hawaiianPizzaButton;

		@FXML
		private Button orderDetailsButton;

		@FXML
		private Button pepPizzaButton;

		    @FXML
		    private TextField phoneNumField;

		    @FXML
		    private Button storeRecordsButton;

		    @FXML
		    void chooseDeluxe(ActionEvent event) {
		    	this.pizzaChoice = "Deluxe";
		    	try {
		    		this.launchCustomPizza();
		    	}
		    	catch(Exception e) {
		    		e.printStackTrace();
		    	}  
		    }

		    @FXML
		    void chooseHawaiian(ActionEvent event) {
		    	this.pizzaChoice = "Hawaiian";
		    	try {
		    		this.launchCustomPizza();
		    	}
		    	catch(Exception e) {
		    		e.printStackTrace();
		    	}  
		    }

		    @FXML
		    void choosePep(ActionEvent event) {		    	
		    	this.pizzaChoice = "Pepperoni";
		    	try {
		    		this.launchCustomPizza();
		    	}
		    	catch(Exception e) {
		    		e.printStackTrace();
		    	}  	
		    }

		    @FXML
		    void enterPhoneNum(ActionEvent event) {

		    }

		    @FXML
		    void viewOrderDetails(ActionEvent event) {

		    }

		    @FXML
		    void viewStoreRecords(ActionEvent event) {

		    }

//stage.onCloseRequestProperty().setValue(e -> Platform.exit());
}

