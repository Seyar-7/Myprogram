import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import javax.sound.sampled.*;
public class Audio {

	public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
	
		Scanner scan = new Scanner(System.in);
		
		File file = new File("Islabonita - An Jone.wav");
        AudioInputStream audiostream = AudioSystem.getAudioInputStream(file);
        Clip clip = AudioSystem.getClip();
        clip.open(audiostream);
        
        
        //clip.start();

            String res = "";
        
          while(!res.equals("Q")) {
        	System.out.println("P = play , S = stop , R = reset , Q = quit");
        	System.out.print("Enter your choice: ");
        	res = scan.next();  
        	res = res.toUpperCase();
        	
        	if(res.equalsIgnoreCase("p")) {
        		clip.start();
        	}
        	else if(res.equalsIgnoreCase("S")) {
        		clip.stop();
        	}
        	else if(res.equalsIgnoreCase("R")) {
        	   clip.setMicrosecondPosition(0);
        	}
        	else if(res.equalsIgnoreCase("Q")) {
        		clip.close();
        	}
        	else {
        		System.out.println("Not a valid respones");
        	}
        	
        }
          System.out.println("Byeeeeee!");
	}
}
