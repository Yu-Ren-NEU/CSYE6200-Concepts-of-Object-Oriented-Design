package edu.neu.csye6200;

import java.util.ArrayList;
import java.util.List;

public class Cart extends AbstractCart {

	private List<AbstractItem> items = null;

	public Cart() {
		super();
		super.setTotalDollars(0);
		items = new ArrayList<>();
		// TODO Auto-generated constructor stub
	}

	public Cart(int id, double totalDollars, String name, String description) {
		super();
		super.setId(id);
		super.setTotalDollars(0);
		super.setName(name);
		super.setDescription(description);
		items = new ArrayList<>();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void add(AbstractItem t) {
		// TODO Auto-generated method stub
		this.items.add(t);
		super.setTotalDollars(super.getTotalDollars() + t.getPrice());
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		this.items.clear();
		super.setTotalDollars(0);
	}

	@Override
	public void remove(String taskName) {
		// TODO Auto-generated method stub
		int index = 0;
		for(AbstractItem t : items) {
			if(t.getName().compareTo(taskName) == 0) break;
			index++;
		}
		super.setTotalDollars(super.getTotalDollars() - items.get(index).getPrice());
		items.remove(index);
	}

	@Override
	public void remove(AbstractItem task) {
		// TODO Auto-generated method stub
		items.remove(task);
		super.setTotalDollars(super.getTotalDollars() - task.getPrice());
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		for(AbstractItem t : items) {
			System.out.println(t);
		}

	}

	@Override
	public String toString() {
		return "Cart [items=" + items + ", getId()=" + getId() + ", getName()=" + getName() + ", getDescription()="
				+ getDescription() + ", getTotalDollars()=" + getTotalDollars() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	

}
