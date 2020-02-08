package edu.neu.csye6200;

public class Shopper extends Person {
	private int shopperId;
	private double budget;
	private AbstractItemFactory itemFactory = null;
    private AbstractCartFactory cartFactory = null;
    private Cart cart = null;
	public Shopper() {
		// TODO Auto-generated constructor stub
	}

	public Shopper(String csvData) {
		super();
		String[] fields = csvData.split(",");
		int id = new Integer(fields[0]);
		int age = new Integer(fields[1]);
		String firstName = fields[2];
		String lastName = fields[3];
		int shopperId = new Integer(fields[4]);
		double budget = new Double(fields[5]);
		super.setId(id);
		super.setAge(age);
		super.setFirstName(firstName);
		super.setLastName(lastName);
		// TODO Auto-generated constructor stub
		this.shopperId = shopperId;
		this.budget = budget;
	}

	public int getShopperId() {
		return shopperId;
	}

	public void setShopperId(int shopperId) {
		this.shopperId = shopperId;
	}

	public double getBudget() {
		return budget;
	}

	public void setBudget(double budget) {
		this.budget = budget;
	}

	public AbstractItemFactory getItemFactory() {
		return itemFactory;
	}

	public void setItemFactory(AbstractItemFactory itemFactory) {
		this.itemFactory = itemFactory;
	}

	public AbstractCartFactory getCartFactory() {
		return cartFactory;
	}

	public void setCartFactory(AbstractCartFactory cartFactory) {
		this.cartFactory = cartFactory;
	}

	public Cart getCart() {
		return cart;
	}

	public void setCart(Cart cart) {
		this.cart = cart;
	}

//	@Override
//	public String toString() {
//		return "Shopper [shopperId=" + shopperId + ", budget=" + budget + ", itemFactory=" + itemFactory
//				+ ", cartFactory=" + cartFactory + "]";
//	}
	
//	public static void demo() {
//		Cart shopper_cart = new CartFactory().getObject();
//		shopper_cart.add(new HiTechItemFactory().getObject("1,150,HDTV,32 inch HD TV"));
//		shopper_cart.add(new HiTechItemFactory().getObject("2,400,4KTV,53 inch 4k UHD Smart TV"));
//		shopper_cart.add(new HiTechItemFactory().getObject("3,100,Monitor,Computer Monitor"));
//		shopper_cart.add(new HiTechItemFactory().getObject("4,1500,OLEDTV,55 inch OLED Smart TV"));
//		shopper_cart.show();
//	}
	
	public static void demo() {
	    System.out.println("\n\t" + Shopper.class.getName() + ".demo()...");
	       
	    Shopper obj = new Shopper("1,17,Dan,Peters,101,2000.0");
	    System.out.println(obj);

	    // add shopper cart Factory (CartFactory) to Shopper object
	    obj.setCartFactory(new CartFactory());
	    // use Cart Factory to add shopper Cart to Shopper object
	    obj.setCart(obj.getCartFactory().getObject());
	    // add shopper Item Factory  (HiTechItemFactory) to Shopper object
	    obj.setItemFactory(new HiTechItemFactory());
	    // use shopper Item factory to add all items to Shopper Cart
	    obj.getCart().add(obj.getItemFactory().getObject("1,150,HDTV,32 inch HD TV"));
	    obj.setItemFactory(new HiTechItemFactory());
	    obj.getCart().add(obj.getItemFactory().getObject("2,400,4KTV,53 inch 4k UHD Smart TV"));
	    obj.setItemFactory(new HiTechItemFactory());
	    obj.getCart().add(obj.getItemFactory().getObject("3,100,Monitor,Computer Monitor"));
	    obj.setItemFactory(new HiTechItemFactory());
	    obj.getCart().add(obj.getItemFactory().getObject("4,1500,OLEDTV,55 inch OLED Smart TV"));
	    // show shopper cart
	    obj.getCart().show();
	    // remove Monitor item from cart
	    obj.getCart().remove("Monitor");
	    // show shopper cart
	    obj.getCart().show();
	    // show shopper shopping results

	    double shoppingBudget = obj.budget;
	    double totalCartDollars = obj.getCart().getTotalDollars();
	    System.out.println("SHOPPING BUDGET: " + shoppingBudget);
	    System.out.println("SHOPPING CART TOTAL: " + totalCartDollars);
	    System.out.println("SHOPPING BALANCE: $" + (shoppingBudget - totalCartDollars));

	    System.out.println("\n\t" + Shopper.class.getName() + ".demo()... done!");
	}

}
