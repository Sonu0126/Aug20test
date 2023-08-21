
public class August20Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] book = new String[2][3];
		book[0][0] = "Science";
		book[0][1] = "Math";
		book[0][2] = "Computer";
		book[1][0] = "Social";
		book[1][1] = "Account";
		book[1][2] = "Nepali";
		System.out.println(book[0][0]);

//Using for each loop
		for (String[] bk : book) {
			for (String b : bk) {
				System.out.println(b);
			}
		}

	}

}
