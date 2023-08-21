
public class August20testAbstractclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Engineer2 obj = new Engineer2("Software Engineer");
		obj.studies();
		obj.practice();
		System.out.println(obj.NameofProfession);
	}

}

abstract class Profession1 {
	String NameofProfession;

	public Profession1(String NoP) {
		this.NameofProfession = NoP;
	}

	abstract void studies();

	abstract void practice();
}

class Engineer2 extends Profession {

	public Engineer2(String NoP) {
		super(NoP);
	}

	@Override
	public void studies() {
		System.out.println("Study hard");

	}

	@Override
	public void practice() {
		System.out.println("More practice make you understand.");

	}

}