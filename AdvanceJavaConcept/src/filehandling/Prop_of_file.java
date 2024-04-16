package filehandling;
 
import java.io.FileWriter;
import java.io.IOException;

public class Prop_of_file {

	public static void main(String[] args) {
		try {
			FileWriter f1 = new FileWriter("d:\\Users\\zaid\\Desktop\\JunaithAmyr\\prog.txt");
			f1.write("hii");
			f1.write("\nhello");
			f1.write("\nbye");
			f1.close();
			System.out.println("sucessfully wrote a file");
		} catch (IOException ie) {
			System.out.println("invalid path");
			ie.printStackTrace();
		}
	}

}
