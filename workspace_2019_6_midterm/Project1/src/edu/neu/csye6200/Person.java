package edu.neu.csye6200;

public class Person {
	private int id;
	private int age;
	private String FirstName;
	private String LastName;
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person(int id, int age, String firstName, String lastName) {
		super();
		this.id = id;
		this.age = age;
		FirstName = firstName;
		LastName = lastName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", age=" + age + ", FirstName=" + FirstName + ", LastName=" + LastName + "]";
	}
	
}
