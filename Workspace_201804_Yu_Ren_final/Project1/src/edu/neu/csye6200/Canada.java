package edu.neu.csye6200;

public class Canada extends Region {
	private double Adjustment;

	public Canada() {
		super();
		// TODO Auto-generated constructor stub
		Adjustment = -1;
	}

	public Canada(int regionId, String regionName, double regionGNP) {
		super(regionId, regionName, regionGNP);
		// TODO Auto-generated constructor stub
		Adjustment = -1;
	}

	public Canada(String csvdata) {
		super(csvdata);
		// TODO Auto-generated constructor stub
		Adjustment = -1;
	}
	
	@Override
	public void updateGNP(int offset, int factor) {
		// TODO Auto-generated method stub
		super.updateGNP(offset, factor);
		super.setRegionGNP(super.getRegionGNP() + Adjustment);
	}

}
