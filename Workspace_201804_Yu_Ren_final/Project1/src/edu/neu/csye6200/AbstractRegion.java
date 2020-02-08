package edu.neu.csye6200;

public abstract class AbstractRegion {	
	/**
	 * get the ID for this region of the world
	 * 
	 * @return		ID for this region of the world. 
	 */
	public abstract int getRegionID();
	/**
	 * get the name for this region of the world
	 * 
	 * @return		name for this region of the world
	 */
	public abstract String getRegionName();
	/**
	 * get the average annual GNP metric for this region of the world
	 * 
	 * @return		Average annual GNP for region 
	 */
	public abstract double getRegionGNP();
	/**
	 * set the average annual GNP metric for this region of the world
	 * 
	 * @param temp	Average annual GNP for region 
	 */
	public abstract void setRegionGNP(double temp);
	/**
	 * Update the average annual GNP metric for this region of the world
	 * 
	 * @param offset	add offset to this region's GNP metric 
	 * @param factor	multiply this region's GNP metric by factor
	 */
	public abstract void updateGNP(int offset, int factor);	
}