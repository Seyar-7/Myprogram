import java.io.FileWriter;
import java.io.IOException;

public class filewriter {
   public static void main(String[] args) {
	   
	   try {
		FileWriter writer = new FileWriter("poem.txt");
		writer.write("roses are red \nViolets are blue\nBooty booty booty booty\nRockin everywhere!");
		writer.append("\n(poem writen by seyar)");
		writer.close();
		
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
   }
}
