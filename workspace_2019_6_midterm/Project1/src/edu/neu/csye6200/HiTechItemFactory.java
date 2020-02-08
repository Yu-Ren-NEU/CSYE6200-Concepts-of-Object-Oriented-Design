package edu.neu.csye6200;

public class HiTechItemFactory extends AbstractItemFactory {

	AbstractItem item = null;
	
	public HiTechItemFactory() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public AbstractItem getObject() {
		// TODO Auto-generated method stub
		if(item == null) {
			item = new HiTechItem();
		}
		return item;
	}

	@Override
	public AbstractItem getObject(String csvData) {
		// TODO Auto-generated method stub
		String[] fields = csvData.split(",");
		int id = new Integer(fields[0]);
		double price = new Double(fields[1]);
		String name = fields[2];
		String description = fields[3];
		if(item == null) {
			item = new HiTechItem(id, price, name, description);
		}
		else {
			item.setId(id);
			item.setPrice(price);
			item.setName(name);
			item.setDescription(description);
		}
		return item;
	}

}
