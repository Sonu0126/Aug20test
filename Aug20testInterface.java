interface University1 {
	public void MajorSubject();

	public void Tutionfee();
}

class College1 implements University1 {

	@Override
	public void MajorSubject() {
		System.out.println("Choose your major subject wisely.");

	}

	@Override
	public void Tutionfee() {
		System.out.println("Tutionfee depends on your score");

	}

}

public class Aug20testInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		College1 obj = new College1();
		obj.MajorSubject();
		obj.Tutionfee();
	}

}
