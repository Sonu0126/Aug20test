
public class Aug20test2ClasswithInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SonA1 obj = new SonA1("Sanjay", "Subedi", "Sakshyam");
		System.out.println(obj.Ffirstname);
		System.out.println(obj.lastname);
		System.out.println(obj.Sfirstname);
		obj.displayFfullname();
		obj.displaySfullname();

		DaughterA1 obj1 = new DaughterA1("Sanjay", "Subedi", "Shweta");
		System.out.println(obj1.Ffirstname);
		System.out.println(obj1.lastname);
		System.out.println(obj1.Dfirstname);
		obj1.displayFfullname();
		obj1.displayDfullname();
	}

}

class FatherA1 {
	String Ffirstname;
	String lastname;

	public FatherA1(String fn, String ln) {
		this.Ffirstname = fn;
		this.lastname = ln;
	}

	public void displayFfullname() {
		System.out.println(this.Ffirstname + " " + this.lastname);
	}
}

class SonA1 extends FatherA1 {
	String Sfirstname;

	public SonA1(String fn, String ln, String sfn) {
		super(fn, ln);
		this.Sfirstname = sfn;
	}

	public void displaySfullname() {
		System.out.println(this.Sfirstname + " " + this.lastname);
	}

}

class DaughterA1 extends FatherA1 {
	String Dfirstname;

	public DaughterA1(String fn, String ln, String Dfn) {
		super(fn, ln);
		this.Dfirstname = Dfn;
	}

	public void displayDfullname() {
		System.out.println(this.Dfirstname + " " + this.lastname);
	}

}
