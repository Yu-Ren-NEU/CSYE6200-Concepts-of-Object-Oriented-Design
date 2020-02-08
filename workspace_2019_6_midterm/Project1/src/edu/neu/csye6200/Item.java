package edu.neu.csye6200;

public class Item extends AbstractItem {

	public Item() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Item(int id, double price, String name, String description) {
		super();
		super.setId(id);
		super.setPrice(price);
		super.setName(name);
		super.setDescription(description);
	}

}
