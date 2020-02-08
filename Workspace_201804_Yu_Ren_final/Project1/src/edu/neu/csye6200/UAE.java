package edu.neu.csye6200;

public class UAE extends Region {
	private double Adjustment;

	public UAE() {
		super();
		// TODO Auto-generated constructor stub
		Adjustment = -3;
	}

	public UAE(int regionId, String regionName, double regionGNP) {
		super(regionId, regionName, regionGNP);
		// TODO Auto-generated constructor stub
		Adjustment = -3;
	}

	public UAE(String csvdata) {
		super(csvdata);
		// TODO Auto-generated constructor stub
		Adjustment = -3;
	}
	
	@Override
	public void updateGNP(int offset, int factor) {
		// TODO Auto-generated method stub
		super.updateGNP(offset, factor);
		super.setRegionGNP(super.getRegionGNP() + Adjustment);
	}

}
