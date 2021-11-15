/**
 * 
 */
package application;

/**
 * @author Alex
 *
 */
public class PizzaMaker {

	public static Pizza createPizza(String flavor) {
		//catch exceptions?
		Pizza newPizza = null;
		if (flavor.equalsIgnoreCase("pepperoni")) {
			newPizza = new Pepperoni();
		}
		if (flavor.equalsIgnoreCase("hawaiian")) {
			newPizza = new Hawaiian();
		}
		if (flavor.equalsIgnoreCase("deluxe")) {
			newPizza = new Deluxe();
		}
		return newPizza;
	}
	/**
	 * 
	 */
	public PizzaMaker() {


	}

}
