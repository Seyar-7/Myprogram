import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class yourser {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		player play = new player();
		
		FileInputStream fileinput = new FileInputStream("C:\\Users\\Seyar\\eclipse-workspace\\Myfirstprogram\\serialization\\uear.ser");
		ObjectInputStream in = new ObjectInputStream(fileinput);
		
		
		play = (player) in.readObject();
		
		play.getvalue();

	}

}
