package edu.neu.csye6200;

public class DatabaseFactory extends AbstractDatabaseFactory {

	public static DatabaseFactory databasefactory = new DatabaseFactory();
	private Database database = null;
	@Override
	public Database getobject() {
		// TODO Auto-generated method stub
		if(database == null) {
			database = new Database();
		}
		return database;
	}

}
