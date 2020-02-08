package edu.neu.csye6200;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class GlobalGNPModel extends AbstractGlobalGNPModel {
	private List<AbstractRegion> regions;
	
	public GlobalGNPModel() {
		super();
		// TODO Auto-generated constructor stub
		regions = new ArrayList<>();
	}

	@Override
	public void add(AbstractRegion r) {
		// TODO Auto-generated method stub
		regions.add(r);
	}

	@Override
	public void sort(Comparator<AbstractRegion> c) {
		// TODO Auto-generated method stub
		regions.sort(c);
	}

	@Override
	public void updateGNP(int offset, int factor) {
		// TODO Auto-generated method stub
		for(AbstractRegion region : regions) {
			region.updateGNP(offset, factor);
		}
	}

	@Override
	public void showGNP() {
		// TODO Auto-generated method stub
		int i = 0;
		for(AbstractRegion region : regions) {
			if(i == regions.size() - 1) System.out.print(region.getRegionGNP());
			else System.out.print(region.getRegionGNP() + ", ");
			i ++;
		}
		System.out.println();
	}

	@Override
	public void graphGNP() {
		// TODO Auto-generated method stub
		for(AbstractRegion region : regions) {
			AbstractGraphValue gv = new GraphValue();
			System.out.println(region.getRegionGNP() + " " + gv.MagnitudeString(region.getRegionGNP()));
		}
	}
	
	@Override
	public String toString() {
		regions.sort(new Comparator<AbstractRegion>() {

			@Override
			public int compare(AbstractRegion o1, AbstractRegion o2) {
				// TODO Auto-generated method stub
				if(o1.getRegionGNP() > o2.getRegionGNP()) return 1;
				else if(o1.getRegionGNP() < o2.getRegionGNP()) return -1;
				else return 0;
			}
			
		});
		return "\tGlobalGNPModel [regions=" + regions + "]";
	}

	public static void demo() {
		System.out.println("\n\t" + GlobalGNPModel.class.getName() + ".demo()...");
		
		// 10 POINTS: GlobalGNPModel must implement toString() 
		//   WHERE: toString() returns model state (all regions SORTED BY GNP metric) as a String
		
		GlobalGNPModel obj = new GlobalGNPModel();

//		* 1. France, Adjustment 2
//		 * 2. UAE, Adjustment -3
//		 * 3. USA, Adjustment -1
//		 * 4. Bahamas, Adjustment -2
//		 * 5. Canada, Adjustment -1
//		*  "3,France,40"
//		 *  "5,UAE,50"
//		 *  "4,USA,30"
//		 *  "1,Bahamas,10"
//		 *  "2,Canada,20"
		// Add 5 Regions to Model
		obj.add(new France("3,France,40"));
		obj.add(new UAE("5,UAE,50"));
		obj.add(new USA("4,USA,30"));
		obj.add(new Bahamas("1,Bahamas,10"));
		obj.add(new Canada("2,Canada,20"));
		
		System.out.println();
		

//		10 POINTS:
		// show ONLY the average annual GNP metric for each region
		obj.showGNP();	// show ONLY each value, e.g. 4.0, 2.0, 3.0
		obj.graphGNP();	// graph and show ONLY the Magnitude of each value, e.g. 3.0	***
		System.out.println("\n\t Original Values");
		System.out.println(obj);	// output model state, SORTED BY GNP metric

//		10 POINTS:
		// sort  ASCENDING  average annual GNP metric for each region
		System.out.println("\nsort  ASCENDING  average annual GNP metric for each region:");
		obj.sort(new Comparator<AbstractRegion>() {

			@Override
			public int compare(AbstractRegion o1, AbstractRegion o2) {
				// TODO Auto-generated method stub
				if(o1.getRegionGNP() > o2.getRegionGNP()) return 1;
				else if(o1.getRegionGNP() < o2.getRegionGNP()) return -1;
				else return 0;
			}
			
		});
		obj.graphGNP();	// graph and show ONLY the Magnitude of each value, e.g. 3.0	***
		// sort  DESCENDING  average annual GNP metric for each region
		System.out.println("\nsort  DESCENDING  average annual GNP metric for each region:");
		obj.sort(new Comparator<AbstractRegion>() {

			@Override
			public int compare(AbstractRegion o1, AbstractRegion o2) {
				// TODO Auto-generated method stub
				if(o1.getRegionGNP() > o2.getRegionGNP()) return -1;
				else if(o1.getRegionGNP() < o2.getRegionGNP()) return 1;
				else return 0;
			}
			
		});
		obj.graphGNP();	// graph and show ONLY the Magnitude of each value, e.g. 3.0	***
		System.out.println("\n\t SORTED Values");
		System.out.println(obj);	// output model state, SORTED BY GNP metric
		
//		10 POINTS:
		// TRIPLE   the average annual GNP metric for each region
		System.out.println("\nTRIPLE   the average annual GNP metric for each region:");
		obj.updateGNP(0, 3);
		// sort  ASCENDING  average annual GNP metric for each region
		System.out.println("\nsort  ASCENDING  average annual GNP metric for each region:");
		obj.sort(new Comparator<AbstractRegion>() {

			@Override
			public int compare(AbstractRegion o1, AbstractRegion o2) {
				// TODO Auto-generated method stub
				if(o1.getRegionGNP() > o2.getRegionGNP()) return 1;
				else if(o1.getRegionGNP() < o2.getRegionGNP()) return -1;
				else return 0;
			}
			
		});
		obj.graphGNP();	// graph and show ONLY the Magnitude of each value, e.g. 3.0	***
		// sort  DESCENDING  average annual GNP metric for each region
		System.out.println("\nsort  DESCENDING  average annual GNP metric for each region:");
		obj.sort(new Comparator<AbstractRegion>() {

			@Override
			public int compare(AbstractRegion o1, AbstractRegion o2) {
				// TODO Auto-generated method stub
				if(o1.getRegionGNP() > o2.getRegionGNP()) return -1;
				else if(o1.getRegionGNP() < o2.getRegionGNP()) return 1;
				else return 0;
			}
			
		});
		obj.graphGNP();	// graph and show ONLY the Magnitude of each value, e.g. 3.0	***
		System.out.println("\n\t SORTED TRIPLE Values");
		System.out.println(obj);	// output model state, SORTED BY GNP metric
		
//		10 POINTS:
		// ADD 100 to   the average annual GNP metric for each region
		System.out.println("\nADD 100 to   the average annual GNP metric for each region:");
		obj.updateGNP(100, 1);
		// sort  ASCENDING  average annual GNP metric for each region
		System.out.println("\nsort  ASCENDING  average annual GNP metric for each region:");
		obj.sort(new Comparator<AbstractRegion>() {

			@Override
			public int compare(AbstractRegion o1, AbstractRegion o2) {
				// TODO Auto-generated method stub
				if(o1.getRegionGNP() > o2.getRegionGNP()) return 1;
				else if(o1.getRegionGNP() < o2.getRegionGNP()) return -1;
				else return 0;
			}
			
		});
		obj.graphGNP();	// graph and show ONLY the Magnitude of each value, e.g. 3.0	***
		// sort  DESCENDING  average annual GNP metric for each region
		System.out.println("\nsort  DESCENDING  average annual GNP metric for each region:");
		obj.sort(new Comparator<AbstractRegion>() {

			@Override
			public int compare(AbstractRegion o1, AbstractRegion o2) {
				// TODO Auto-generated method stub
				if(o1.getRegionGNP() > o2.getRegionGNP()) return -1;
				else if(o1.getRegionGNP() < o2.getRegionGNP()) return 1;
				else return 0;
			}
			
		});
		obj.graphGNP();	// graph and show ONLY the Magnitude of each value, e.g. 3.0	***
		System.out.println("\n\t SORTED PLUS 100 Values");
		System.out.println(obj);	// output model state, SORTED BY GNP metric

		System.out.println("\n\t" + GlobalGNPModel.class.getName() + ".demo()... done!");
   }

}
