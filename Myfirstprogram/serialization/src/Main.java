
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamClass;

public class Main {

	public static void main(String[] args) throws IOException {
		
		/*
          serialization = the process of converting as object into a byte stream.
                          persists (saves the state) the object after program exist 
                          this byte stream can be saved as a file or sent over a network 
                          can be sent to a different machine
                          byte stream can be saved as a file (.ser) which is platform independent
                          (Think of this as if you're saving a file with the object's information)
		 */
		
		
		
		/*
		                        Steps to serialize
		                        ----------------------------------------------------------------
		                        1- Your object class should implement Serializable interface
		                        2- add import java.io.serializable;
		                        3- FileOutputStream fileoOut = new FileOutputStream(File.path)
		                        4- ObjectOutputStream out = new ObjectOutputStream(FileOut);
		                        5- out.writeObject(objectName();
		                        6- out.close(); fileOut.close();
		                        ----------------------------------------------------------------
		                        
		 */
		
		/*
		  Import Notes = 1- Children classes of a present class that implements serializable will do so as well
		                 2- static fields are not serialized (They belong to the class, not an individual object)
		                 3- the calss's definition ("Class file") itself is not recorded, cast it as the object typed
		                 4- fields declared as "transient" aren't serialized they're ignored
		                 5- serialVersionUID is a unique version ID.
		 */
		
		/*
		   SerialVersionUID = serialVerionUID is a unique ID that function like a version #
		                      verifies that the sender and receiver of a serialized object.
		                      have loaded classes for that object that match
		                      ensures object will be compatible between machines 
		                      Number must match, otherwise this will cause a invalidClassException
		                      A SerialVersionUID will be calculated based on class properties,members, etc.
		                      A serializable class can declare its own serialVersionUID explicitly (recommended)
		 */
		
		User user = new User();
		
		user.name = "Seyar Joyandah";
		user.password = "Seyar123";
		
		
		FileOutputStream fileout = new FileOutputStream("userinfo.ser");
		ObjectOutputStream out = new ObjectOutputStream(fileout);
		out.writeObject(user);
		out.close();
		fileout.close();
		System.out.println("Object info saved :)");
		
		long serialversionUID = ObjectStreamClass.lookup(user.getClass()).getSerialVersionUID();
		System.out.println(serialversionUID);

	}

}
