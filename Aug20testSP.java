
public class Aug20testSP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DatabaseA db = DatabaseA.getInstance();
		db.getConnected();
	}

}

class DatabaseA {
	private static DatabaseA dbobject = null;

	private DatabaseA() {

	}

	public static DatabaseA getInstance() {
		if (dbobject == null) {
			dbobject = new DatabaseA();
		}
		return dbobject;
	}

	public void getConnected() {
		System.out.println("Connected to Database");
	}
}