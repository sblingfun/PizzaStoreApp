/**
 * 
 */
package application;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.image.Image;
import javafx.fxml.Initializable;
/**
 * @author Alex
 *
 */
//implements Initializable
public class PizzaCustomController {
	
	private Size pizzaSize = Size.small;
	private String pizzaChoice = null;	
	private MainController mainController;
	//private Image pizzaImage = new Image("file:pepPizza.png");
	private Image pizzaImage;
	private ObservableList<Topping> availableToppings;
	private ObservableList<Topping> inUseToppings;
	
	private void priceCalc() {
		Size = pizzaSize;
	}
	
		public void setMainController(MainController controller) {
			this.mainController = controller;
			pizzaChoice = mainController.getPizzaChoice();
			availableToppings = FXCollections.observableArrayList(Topping.values());
			inUseToppings = FXCollections.observableArrayList();
			availableTop.setItems(availableToppings);
			inUseTop.setItems(inUseToppings);
			//availableTop.getItems().addAll(Topping.values());
			if (mainController.getPizzaChoice().equalsIgnoreCase("Pepperoni")) {
				this.pizzaImage = new Image("file:pepPizza.png");
				//inUseTop.getItems().add(Topping.Pepperoni);
				availableToppings.remove(Topping.Pepperoni);
				inUseToppings.add(Topping.Pepperoni);
			}
			if (mainController.getPizzaChoice().equalsIgnoreCase("Hawaiian")) {
				this.pizzaImage = new Image("file:pinePizza.png");
				//inUseTop.getItems().addAll(Topping.Ham,Topping.Pineapple);
				availableToppings.removeAll(Topping.Ham,Topping.Pineapple);
				inUseToppings.addAll(Topping.Ham,Topping.Pineapple);
			}
			if (pizzaChoice.equalsIgnoreCase("Deluxe")) {
				this.pizzaImage = new Image("file:deluxePizza.png");
				//inUseTop.getItems().addAll(Topping.Broccoli,Topping.Mushroom,Topping.Olives,
				//		Topping.Pepperoni,Topping.Sausage);
				availableToppings.removeAll(Topping.Broccoli,Topping.Mushroom,Topping.Olives,
								Topping.Pepperoni,Topping.Sausage);
				inUseToppings.addAll(Topping.Broccoli,Topping.Mushroom,Topping.Olives,
								Topping.Pepperoni,Topping.Sausage);
			}
			//availableTop.getItems().removeAll(inUseTop.getItems());
			selectedPizImage.setImage(pizzaImage);
			
		}
		
		
		/**
		public void setPizzaChoice (String choice) {
			this.pizzaChoice = choice;
		}
		
		
		public void setPizzaImage(String pizChoice) {
			if (pizChoice.equalsIgnoreCase("Pepperoni")) {
				this.pizzaImage = new Image("file:pepPizza.png");
			}
			if (pizChoice.equalsIgnoreCase("Hawaiian")) {
				this.pizzaImage = new Image("file:pinePizza.png");
			}
			if (pizChoice.equalsIgnoreCase("Deluxe")) {
				this.pizzaImage = new Image("file:deluxePizza.png");
			}
		}
		*/

	    @FXML
	    private Button addPizzaButton;

	    @FXML
	    private Button addToppingButton;

	    @FXML
	    private ListView<Topping> availableTop;

	    @FXML
	    private ListView<Topping> inUseTop;

	    @FXML
	    private TextField priceField;

	    @FXML
	    private Button removeToppingButton;

	    @FXML
	    private ImageView selectedPizImage;

	    @FXML
	    private ComboBox<Size> sizeComboBox;
	    	   

	    @FXML
	    void addPizza(ActionEvent event) {

	    }

	    @FXML
	    void addTopping(ActionEvent event) {
	    	Topping addedTop = availableTop.getSelectionModel().getSelectedItem();
	    	if (addedTop != null) {
				availableToppings.remove(addedTop);
				inUseToppings.add(addedTop);
	    	}
	    	//call price
	    }

	    @FXML
	    void removeTopping(ActionEvent event) {
	    	Topping removeTop = inUseTop.getSelectionModel().getSelectedItem();
	    	if (removeTop != null) {
			availableToppings.add(removeTop);
			inUseToppings.remove(removeTop);
	    	}
	    	//call price
	    }
	    
	    @FXML
	    void setSize(ActionEvent event) {
	    	pizzaSize = sizeComboBox.getValue();
	    	//call price
	    }

		//@Override
		public void initialize() {
			sizeComboBox.getItems().setAll(Size.small,Size.medium,Size.large);
			sizeComboBox.getSelectionModel().selectFirst();
			
			
			//call price
			
			
			/**
			//Platform.runLater();
			Image pizzaImage = null;
			this.setPizzaChoice(pizzaChoice);
			//pizzaImage = new Image("file:pepPizza.png");
			if (pizzaChoice.equalsIgnoreCase("Pepperoni")) {
				pizzaImage = new Image("file:pepPizza.png");
			}
			
			if (mainController.getPizzaChoice().equalsIgnoreCase("Pepperoni")) {
				pizzaImage = new Image("file:pepPizza.png");
			}
			*/
			//ImageView pizzaView = new ImageView();
			
			
			//selectedPizImage.setImage(pizzaImage);
			
		}


}


