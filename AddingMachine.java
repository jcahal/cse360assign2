package cse360assign2;

/**
 * This Class implements a simple arithmetic machine
 * 
 * 
 * @author JonathanCahal<br>
 * CSE 360<br>
 * Assignment 2
 * 
 * @since 1.0
 * @version 2.0
 * 
 * @param total The total after calculation
 *
 */

public class AddingMachine {
	
	private int total;
	private String history = "0 "; // 0 added to match initial total
	
	/**
	 * Default  for the AddingMachine Class.
	 * 
	 */
	public AddingMachine () {
		
		total = 0;  // not needed - included for clarity
	
	}
	
	/**
	 * getTotal function for the result of calculation.
	 * 
	 * @return the result of the calculation.
	 */
	public int getTotal () {
		
		return this.total;
	
	}
	
	/**
	 * Basic add function for the AddingMachine Class. Adds value given to the
	 * 	total member of the AddingMachine instance.
	 * 
	 * @param value the int value to be added.
	 */
	public void add (int value) {
		
		this.total = this.total + value;
		
		this.history = this.history + "+ " + value + " "; // must add trailing space
	}
	
	/**
	 * Basic subtract function for the AddingMachine Class. Subtracts value given from the
	 * 	total member of the AddingMachine instance.
	 * 
	 * @param value the int value to be subtracted.
	 */
	public void subtract (int value) {
		
		this.total = this.total - value;
		
		this.history = this.history + "- " + value + " "; // must add trailing space
	}
	
	/**
	 * Displays the history member of the AddingMachine instance.
	 * 
	 * @return The history member of the AddingMachine instance.
	 */
	public String toString () {

		return this.history;
		
	}
	
	/**
	 * Clears the contents of total and history of an AddingMachine instance.
	 * 
	 */
	public void clear() {
		
		this.total = 0;
		
		this.history = "0";
	}
}