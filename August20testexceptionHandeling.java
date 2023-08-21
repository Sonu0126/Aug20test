
public class August20testexceptionHandeling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Sonika");
		try {
			int dividedbyzero = 3 / 0;
		} catch (ArithmeticException e) {
			System.out.println(3 / 0);
		}
		System.out.println("pass");
	}

}
