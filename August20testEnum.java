enum Sport {
	Badmintion, Tennis, Basketball;
}

class PlayS {
	Sport selection;

	public PlayS(Sport selection) {
		this.selection = selection;
	}

	public void confirmationOfselection() {
		switch (selection) {
		case Badmintion:
			System.out.println("Congratulation for being selected on  Badmintion team.");
			break;
		case Tennis:
			System.out.println("Congratulation for being selected on Tennis team.");
			break;
		case Basketball:
			System.out.println("Congratulation for being selected on Basketball team.");
			break;
		}
	}
}

public class August20testEnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PlayS b = new PlayS(Sport.Badmintion);
		b.confirmationOfselection();
	}

}
