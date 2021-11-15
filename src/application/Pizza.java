package application;

import java.util.ArrayList;
import java.util.StringTokenizer;

/**
 * @author Alex
 *
 */
public abstract class Pizza {
	protected ArrayList<Topping> toppings = new ArrayList<Topping>();
	protected Size size;
	public abstract double price();
	
	public Pizza (Size orderSize, String toppingsList) {
		//Plain pizza?
		size = orderSize;
		String topString = toppingsList;
		//StringTokenizer tokenizer = new StringTokenizer(topString, ",");
		String toppingStringArr[] = topString.split(",");
		for (int counter = 0; counter < toppingStringArr.length; counter++) {
			//might need to check if valid topping
			//might need to check array size
			Topping addTopping = Topping.lookup(toppingStringArr[counter]);
			toppings.add(addTopping);
		}
		
	}
	public Pizza (Size orderSize) { //plain
		size = orderSize;
	}
	
	public Size getSize() {
		return this.size;
	}
	
	// throws IllegalArgumentException if too many toppings
	public void addTopping(Topping addedTop) {
		if (toppings.size() < 7) {
			toppings.add(addedTop);	
		}

	}
	
	public void removeTopping(Topping removeTop) {
		toppings.remove(removeTop);
	}
	
	//add add/delete topping method?
}
