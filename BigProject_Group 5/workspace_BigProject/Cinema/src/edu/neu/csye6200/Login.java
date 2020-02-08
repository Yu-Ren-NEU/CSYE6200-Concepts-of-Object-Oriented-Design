package edu.neu.csye6200;

public class Login {
	public static int JudgeUsernamePassword(String username, String password) {
		// When flag is 1, no username; flag is 2, password is not correct; flag is 3, correct;
		int flag = 0;
		String result = DatabaseFactory.databasefactory.getobject().Select_UserInfo(username);
		if(result == null) {
			flag = 1;
			return flag;
		}
		String[] fields = result.split("/");
		String passWord = fields[6];
		if(password.compareTo(passWord) != 0) {
			flag = 2;
			return flag;
		}
		Operation.userinfo = result;
		flag = 3;
		return flag;
	}
	
	// Is there such a username.
	public static boolean IfhasUsername(String username){
		String result = DatabaseFactory.databasefactory.getobject().Select_UserInfo(username);
		if(result == null) return false;
		else return true;
	}
	
	// Insert new user's information to database.
	public static boolean InsertUserinfo(String username, String password){
		if(DatabaseFactory.databasefactory.getobject().InsertUserinfo(username, password)) return true;
		else return false;
	}
}
