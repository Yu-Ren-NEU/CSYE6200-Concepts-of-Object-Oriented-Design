package edu.neu.csye6200;

public class UserFactory extends AbstractUserFactory {
	
	private User user = null;
	@Override
	public User getObject() {
		// TODO Auto-generated method stub
		if(user == null) {
			user = new User();
		}
		return user;
	}

	@Override
	public User getObject(String csvdata) {
		// TODO Auto-generated method stub
		String[] fields = csvdata.split("/");
		String firstname = fields[0];
		String lastname = fields[1];
		int age = new Integer(fields[2]);
		String gender = fields[3];
		int userid = new Integer(fields[4]);
		String username = fields[5];
		String password = fields[6];
		String description = fields[7];
		if(user == null) {
			user = new User(firstname, lastname, age, gender, userid, username, password, description);
		}
		return user;
	}

}
