package edu.neu.csye6200;

import java.util.Comparator;
/**
 * AbstractGlobalGNPModel
 * @author dpeters
 *
 * FINAL EXAM 100 TOTAL POINTS 
 * (20 points for Part I and 80 points for Part II)
 * 
 * 20 POINTS DEDUCTION:
 * 
 * 1. if submitted late;
 * 2. if submitted in wrong format
 * 
 *  REQUIRED FORMAT:
 *   workspace_EclipseVersion_firstName_lastName_final.zip
 *   e.g.
 *   workspace_2019-6_dan_peters_final.zip
 * 
 * 
 * PART  I: 20 TOTAL POINTS
 * 
 * Design a class that will start two alternating threads demonstrating control as they alternate output.
 * Two threads take turns alternating output to console
 * the letters of the alphabet (ALL 26 LETTERS, LOWERCASE and UPPERCASE)
 * FOR EXAMPLE:
 * 		aAbAcCdD... 
 * etc.
 * 
 * 
 * PART II: 80 TOTAL POINTS
 * 
 * Given:
 * 
 * AbstractGraphValue.java
 * AbstractRegion.java
 * Graphable.java
 * AbstractGlobalGNPModel.java
 * 
 * 
 * 15 POINTS: Design a GraphValue class
 * which:
 * 1. Implements the API specified in AbstractGraphValue;
 * 
 * 
 * 15 POINTS: Design 5 Region classes for Regions of the world
 * WHERE Each Region has it's own unique Adjustment to it's GNP metric
 * 
 * 1. France, Adjustment 2
 * 2. UAE, Adjustment -3
 * 3. USA, Adjustment -1
 * 4. Bahamas, Adjustment -2
 * 5. Canada, Adjustment -1
 * 
 * NOTE: 
 * 	Each Region must ADJUST it's GNP metric (using it's unique Adjustment) 
 * 	EACH TIME a Region GNP is changed
 * 	AND your graph must show that the CORRECT adjustment has been applied to the Region's GNP
 * 
 * EXAMPLE: 
 * 	CHANGE GNP: TRIPLE GNP AND THEN adjust GNP
 * 	CHANGE GNP: ADD 100 to GNP AND THEN adjust GNP
 * 
 * Use the given CSV string for initializing the state of the corresponding Region class:
 * 
 *    "RegionID,RegionName,RegionGNPMetric"
 * 
 * Parse each CSV string to construct a corresponding Region class:
 * 
 *  "3,France,40"
 *  "5,UAE,50"
 *  "4,USA,30"
 *  "1,Bahamas,10"
 *  "2,Canada,20"
 *  
 * Each Region class MUST:
 * 	1. Implement the API specified in AbstractRegion;
 * 
 * 
 * 50 POINTS: Design a GlobalGNPModel class
 * which:
 * 1. Implements the API specified in AbstractGlobalGNPModel;
 * 2. Implements the following demo method (complete the following code fragment):
 * 	
   public static void demo() {
		System.out.println("\n\t" + GlobalGNPModel.class.getName() + ".demo()...");
		
		// 10 POINTS: GlobalGNPModel must implement toString() 
		//   WHERE: toString() returns model state (all regions SORTED BY GNP metric) as a String
		
		GlobalGNPModel obj = new GlobalGNPModel();

		// Add 5 Regions to Model
		
		System.out.println();
		

		10 POINTS:
		// show ONLY the average annual GNP metric for each region
		obj.graphGNP();	// show ONLY each value, e.g. 4.0, 2.0, 3.0
		obj.graphGNP();	// graph and show ONLY the Magnitude of each value, e.g. 3.0	***
		System.out.println("\n\t Original Values");
		System.out.println(obj);	// output model state, SORTED BY GNP metric

		10 POINTS:
		// sort  ASCENDING  average annual GNP metric for each region
		obj.graphGNP();	// graph and show ONLY the Magnitude of each value, e.g. 3.0	***
		// sort  DESCENDING  average annual GNP metric for each region
		obj.graphGNP();	// graph and show ONLY the Magnitude of each value, e.g. 3.0	***
		System.out.println("\n\t SORTED Values");
		System.out.println(obj);	// output model state, SORTED BY GNP metric
		
		10 POINTS:
		// TRIPLE   the average annual GNP metric for each region
		// sort  ASCENDING  average annual GNP metric for each region
		obj.graphGNP();	// graph and show ONLY the Magnitude of each value, e.g. 3.0	***
		// sort  DESCENDING  average annual GNP metric for each region
		obj.graphGNP();	// graph and show ONLY the Magnitude of each value, e.g. 3.0	***
		System.out.println("\n\t SORTED TRIPLE Values");
		System.out.println(obj);	// output model state, SORTED BY GNP metric
		
		10 POINTS:
		// ADD 100 to   the average annual GNP metric for each region
		// sort  ASCENDING  average annual GNP metric for each region
		obj.graphGNP();	// graph and show ONLY the Magnitude of each value, e.g. 3.0	***
		// sort  DESCENDING  average annual GNP metric for each region
		obj.graphGNP();	// graph and show ONLY the Magnitude of each value, e.g. 3.0	***
		System.out.println("\n\t SORTED PLUS 100 Values");
		System.out.println(obj);	// output model state, SORTED BY GNP metric

		System.out.println("\n\t" + GlobalGNPModel.class.getName() + ".demo()... done!");
   }
 */
public abstract class AbstractGlobalGNPModel {
	/**
	 * Add a Region of the world to the model
	 * 
	 * @param r		Region of the world to add
	 */
	public abstract void add(AbstractRegion r);
	/**
	 * Sort the regions in the model
	 * 
	 * @param c		Comparator for sorting order
	 */
	public abstract void sort(Comparator<AbstractRegion> c);
	/**
	 * Update the average annual GNP metric in each region in the model
	 * 
	 * @param offset	add offset to each region's GNP metric 
	 * @param factor	multiply each region's GNP metric by factor
	 */
	public abstract void updateGNP(int offset, int factor);
	/**
	 * show ONLY the average annual GNP metric VALUES
	 * for each region in model
	 * in the following example format (one output line on console):
	 * 
	 * 4.0, 2.0, 3.0
	 */
	public abstract void showGNP();
	/**
	 * Graph ONLY the MAGNITUDE of the average annual GNP metric values
	 * for each region in model
	 * in the following example format (one line per graphed value):
	 * 
	 * 4.0	****
	 * 2.0	**
	 * 3.0	*** 
	 */
	public abstract void graphGNP();

}