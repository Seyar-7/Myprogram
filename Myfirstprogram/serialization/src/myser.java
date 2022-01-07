import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class myser {

	public static void main(String[] args) throws IOException {
	
		player play = new player();
		
		play.name = "seyar joyandah";
		play.year = 22;
		
		FileOutputStream fileout = new FileOutputStream("uear.ser");
		ObjectOutputStream out = new ObjectOutputStream(fileout);
		
		out.writeObject(play);
		
		out.close();
		fileout.close();
		
		System.out.println("File saved!!");
		
		

	}

}
