package edu.neu.csye6200;

public abstract class AbstractUserFactory {
	
	public abstract User getObject();
	
	public abstract User getObject(String csvdata);
}
