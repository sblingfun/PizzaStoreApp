/**
 * 
 */
package application;

/**
 * @author Alex
 *
 */
public class Hawaiian extends Pizza {

	/**
	 * 
	 */
	public Hawaiian() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public double price() {
		Size pepSize = super.getSize();
		int numTop = this.toppings.size();
		double basePrice = 10.99;
		double topCost = 0;
		if (pepSize == Size.medium) {
			basePrice += 2.00;
		}
		if (pepSize == Size.large) {
			basePrice += 4.00;
		}
		if (numTop > 1) {
			numTop -= 2;
			topCost = numTop * 1.49;
		}
		double finalCost = basePrice + topCost;
		return finalCost;
	}

}
