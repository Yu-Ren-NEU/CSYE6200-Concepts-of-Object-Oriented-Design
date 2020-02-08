package edu.neu.csye6200;

public class User extends Person {
	private int UserId;
	private String UserName;
	private String PassWord;
	private String Description;
	private int UserState;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(String username, String password) {
		super();
		this.UserName = username;
		this.PassWord = password;
		this.UserState = 1;
	}
	public User(String firstName, String lastName, int age, String gender, int userid, String username, String password, String description) {
		super(firstName, lastName, age, gender);
		this.UserId = userid;
		this.UserName = username;
		this.PassWord = password;
		this.Description = description;
		this.UserState = 1;
		// TODO Auto-generated constructor stub
	}
	public User(String csvdata) {
		super();
		String[] fields = csvdata.split("/");
		String firstName = fields[0];
		String lastName = fields[1];
		int age = new Integer(fields[2]);
		String gender = fields[3];
		int userid = new Integer(fields[4]);
		String username = fields[5];
		String password = fields[6];
		String description = fields[7];
		super.setFirstName(firstName);
		super.setLastName(lastName);
		super.setAge(age);
		super.setGender(gender);
		this.UserId = userid;
		this.UserName = username;
		this.PassWord = password;
		this.Description = description;
		this.UserState = 1;
		// TODO Auto-generated constructor stub
	}
	public int getUserId() {
		return UserId;
	}
	public void setUserId(int userId) {
		UserId = userId;
	}
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	public String getPassWord() {
		return PassWord;
	}
	public void setPassWord(String passWord) {
		PassWord = passWord;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public int getUserState() {
		return UserState;
	}
	public void setUserState(int userState) {
		UserState = userState;
	}
	@Override
	public String toString() {
		return "User [#" + UserId +"  " + UserName + "  " + Description + "]";
	}
	
}
