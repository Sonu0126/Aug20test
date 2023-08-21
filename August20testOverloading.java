
public class August20testOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Addition1 ad = new Addition1();
		ad.Add1(3);
		ad.Add1(4, 5);
		ad.Add1(6, 2, 9);
	}

}

class Addition1 {
	public void Add1(int x) {
		System.out.println(x);
	}

	public void Add1(int x, int y) {
		System.out.println(x + y);
	}

	public void Add1(int x, int y, int z) {
		System.out.println(x + y + z);
	}
}