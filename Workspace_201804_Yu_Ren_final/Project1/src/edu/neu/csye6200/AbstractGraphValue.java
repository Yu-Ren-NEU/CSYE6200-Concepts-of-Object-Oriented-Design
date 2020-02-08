package edu.neu.csye6200;

/**
 * Utility Value Magnitude Graphing API
 * @author dpeters
 *
 */
public abstract class AbstractGraphValue {

	/**
	 * Represent the magnitude of supplied value graphically on the console
	 * e.g.
	 *  for value: 		
	 *  
	 *  4.3
	 *  
	 *  graph as follows on console:	
	 *  
	 *  4.3	****
	 * 
	 * @param doubleValue	
	 * @return
	 */
	public abstract String MagnitudeString(double doubleValue);
}