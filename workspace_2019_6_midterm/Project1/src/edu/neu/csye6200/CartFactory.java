package edu.neu.csye6200;

public class CartFactory extends AbstractCartFactory {

	private Cart cartObj = null;
	@Override
	public Cart getObject() {
		// TODO Auto-generated method stub
		if(cartObj == null) {
			cartObj = new MobileShopperCart();
		}
		return cartObj;
	}

	@Override
	public Cart getObject(String csvData) {
		// TODO Auto-generated method stub
		String[] fields = csvData.split(",");
		int id = new Integer(fields[0]);
		double totalDollars = new Double(fields[1]);
		String name = fields[2];
		String description = fields[3];
		if(cartObj == null) {
			cartObj = new MobileShopperCart(id, totalDollars, name, description);
		}
		else {
			cartObj.setId(id);
			cartObj.setTotalDollars(totalDollars);
			cartObj.setName(name);
			cartObj.setDescription(description);
		}
		return cartObj;
	}

}
