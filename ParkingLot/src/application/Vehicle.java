/* The Framework for the application. Here
 * Here we describe the different abstract methods
 * 
 */
package application;

import java.util.Date;

public abstract class Vehicle {
	
	public abstract Date arrivalDate();
	
	public abstract Date departDate();
	
	public abstract String Type();
	
	public abstract double TotalCost();
	
	public abstract double height();
	
	public abstract double weight();
	
	public abstract double length();

}
