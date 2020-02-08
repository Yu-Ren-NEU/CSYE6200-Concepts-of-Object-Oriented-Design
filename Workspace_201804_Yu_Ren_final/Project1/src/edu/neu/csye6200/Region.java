package edu.neu.csye6200;

public class Region extends AbstractRegion {
	private int RegionId;
	private String RegionName;
	private double RegionGNP;

	public Region() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Region(int regionId, String regionName, double regionGNP) {
		super();
		RegionId = regionId;
		RegionName = regionName;
		RegionGNP = regionGNP;
	}
	
	public Region(String csvdata) {
		super();
		String[] fields = csvdata.split(",");
		int regionid = new Integer(fields[0]);
		String regionname = fields[1];
		double regiongnp = new Double(fields[2]);
		RegionId = regionid;
		RegionName = regionname;
		RegionGNP = regiongnp;
	}

	@Override
	public int getRegionID() {
		// TODO Auto-generated method stub
		return RegionId;
	}

	@Override
	public String getRegionName() {
		// TODO Auto-generated method stub
		return RegionName;
	}

	@Override
	public double getRegionGNP() {
		// TODO Auto-generated method stub
		return RegionGNP;
	}

	@Override
	public void setRegionGNP(double temp) {
		// TODO Auto-generated method stub
		this.RegionGNP = temp;
	}

	@Override
	public void updateGNP(int offset, int factor) {
		// TODO Auto-generated method stub
		this.RegionGNP = (this.RegionGNP + offset) * factor;
	}

	@Override
	public String toString() {
		return "Region [#" + RegionId + ", " + RegionName + ", " + RegionGNP + "]";
	}
	

}
