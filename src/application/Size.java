/**
 * 
 */
package application;

/**
 * @author Alex
 *
 */
public enum Size {
	small, medium, large;
	
	public static Size lookup(final String id) {
        for(Size enumValue: values()){
           if(enumValue.name().equalsIgnoreCase(id)){
              return enumValue;
           }
        }  
        throw new IllegalArgumentException("'" + id + "' is not a valid size");
       }
}
