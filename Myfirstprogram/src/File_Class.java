import java.io.File;

public class File_Class {
    public static void main(String[] args) {
    	
    	
    	// File = An abstract representation of file and directory pathnames.
    	
    	File file = new File("secret_file.txt");
    	
    	if(file.exists()) {
    		System.out.println("this file exists  :O");
    		System.out.println(file.getPath());
    		System.out.println(file.getAbsolutePath());
    		System.out.println(file.isFile());
    		file.delete();
    	}
    	else{
         System.out.println("the file doesn't exists :(");
    	}
    	
    	
    }
}
