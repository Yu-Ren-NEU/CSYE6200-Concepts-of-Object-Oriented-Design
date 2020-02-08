package edu.neu.csye6200;

public class GraphValue extends AbstractGraphValue {

	@Override
	public String MagnitudeString(double doubleValue) {
		// TODO Auto-generated method stub
		StringBuilder result = new StringBuilder();
		for(int i = 0; i < (int)doubleValue; i++) {
			result.append("*");
		}
		return result.toString();
	}

}
