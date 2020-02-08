package edu.neu.csye6200;

public class Bahamas extends Region {
	private double Adjustment;

	public Bahamas() {
		super();
		// TODO Auto-generated constructor stub
		Adjustment = -2;
	}

	public Bahamas(int regionId, String regionName, double regionGNP) {
		super(regionId, regionName, regionGNP);
		// TODO Auto-generated constructor stub
		Adjustment = -2;
	}

	public Bahamas(String csvdata) {
		super(csvdata);
		// TODO Auto-generated constructor stub
		Adjustment = -2;
	}
	
	@Override
	public void updateGNP(int offset, int factor) {
		// TODO Auto-generated method stub
		super.updateGNP(offset, factor);
		super.setRegionGNP(super.getRegionGNP() + Adjustment);
	}

}
