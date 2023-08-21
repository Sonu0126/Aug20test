import java.io.FileWriter;
import java.io.IOException;

public class Aug20testFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fN = "info.txt";
		try {
			FileWriter write = new FileWriter(fN);
			write.write("hi");
			write.write("\n");
			write.write("i am  home");
			write.write("\n");
			write.write("i go to school");
			write.write("\n");
			write.close();
			System.out.println("Data written successfully");

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
