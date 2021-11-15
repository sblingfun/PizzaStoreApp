/**
 * 
 */
package application;

/**
 * @author Alex
 *
 */
public enum Topping { //keep in alphabetical order
	Anchovies, Broccoli, Chicken, ExtraCheese, Ham, Mushroom, Olives, Pepperoni, PenneVodka, Pineapple, Sausage;
	
	/**
	 * This method calculated the tuition due for an international student and updates the students tuition due to that amount.
	 * @param 
	 * @return enumValue the name of the major of the input string
	 */
	public static Topping lookup(final String id) {
        for(Topping enumValue: values()){
           if(enumValue.name().equalsIgnoreCase(id)){
              return enumValue;
           }
        }  
        throw new IllegalArgumentException("'" + id + "' is not a valid topping");
       }
}

