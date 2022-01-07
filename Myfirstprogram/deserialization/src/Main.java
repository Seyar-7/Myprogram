
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		/*
		  Deserialization = the reverse process of converting a byte stream into an object.
		                    (Think of this as if you're loading a saved file).
		 */
		             
		/*
                                   Steps to serialize
                                   ----------------------------------------------------------------
                                   1- Declare your object (don't instantiate)
                                   2- your class should implement serializable interface
                                   3- add import java.io.serializable;
                                   4- FileIntputStream fileoOut = new FileInputStream(File.path)
		                           5- ObjectInputStream out = new ObjectInputStream(Filein);
		                           6- ObjectName = (class) in.readObject();
		                           7- in.close(); filein.close();
                                   ----------------------------------------------------------------
        
*/
		User user = null;
		
		FileInputStream input = new FileInputStream("C:\\Users\\Seyar\\eclipse-workspace\\Myfirstprogram\\serialization\\userinfo.ser");
		ObjectInputStream in = new ObjectInputStream(input);
		user = (User) in.readObject();
		in.close();
		input.close();
		
		System.out.println(user.name);
		System.out.println(user.password);
		user.Getvalue();

	}

}
