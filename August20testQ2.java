
public class August20testQ2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Addition a = new Addition();
		a.Add(2);
		a.Add(5, 1);
		a.Add(3, 4, 3);
	}

}

class Addition {
	public void Add(int x) {
		System.out.println(x);
	}

	public void Add(int x, int y) {
		System.out.println(x + y);
	}

	public void Add(int x, int y, int z) {
		System.out.println(x + y + z);
	}
}