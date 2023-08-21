
public class August20overriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Creating an object
		NB obj = new NB("Nepal", "ktm");
		obj.Save();
		obj.Loan();
		obj.displayMessage();
		obj.displayGreetings();
	}

}

class Worldbank1 {
	String country;

	public Worldbank1(String ctr) {
		this.country = ctr;
	}

	public void Save() {
		System.out.println("Save here");
	}

	public void Loan() {
		System.out.println("Get Loan");
	}

	public void displayGreetings() {
		System.out.println("Hello! Welcome to WorldBank.");
	}
}

class NB extends Worldbank1 {
	String branch;

	public NB(String ctr, String brn) {
		super(ctr);
		this.branch = brn;
	}

	// overriding
	public void Save() {
		System.out.println("This is Save.");
	}

	public void Loan() {
		System.out.println("This is  Loan");
	}

	public void displayMessage() {
		System.out.println("Welcom to NB");
	}

}
