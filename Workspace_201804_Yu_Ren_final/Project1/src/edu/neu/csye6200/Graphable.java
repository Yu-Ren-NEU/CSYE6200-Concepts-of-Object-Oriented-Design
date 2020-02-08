package edu.neu.csye6200;

/**
 * API to provide a Graphical String representation of object state
 * 
 * @author dpeters
 *
 */
public interface Graphable {
	/**
	 * Graphically represent the magnitude of the state of the object
	 * in a console printable String
	 * EXAMPLE Console Output (for a value of 3.0):
	 * 		3.0	***
	 * 
	 * @return	magnitude represented as String, e.g. "2.0	**"
	 */
	String toMagnitudeString();
}