import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import javax.sound.sampled.*;
public class Audio_pratctice {

	public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
		
		
		Scanner scan = new Scanner(System.in);
		File file = new File("Islabonita - An Jone.wav");
		AudioInputStream audiostream = AudioSystem.getAudioInputStream(file);
		Clip clip = AudioSystem.getClip();
		clip.open(audiostream);
	
		//scan.next();

		String respones = " ";
		while(!respones.equalsIgnoreCase("Q")) {
			System.out.println("S = start , C = close , R = reset , Q = quit");
			System.out.print("its on your choice: ");
			respones = scan.next();
			
			if(respones.equalsIgnoreCase("S")) {
				clip.start();
			}
			else if(respones.equalsIgnoreCase("Q")) {
				clip.close();
			}
			else if(respones.equalsIgnoreCase("R")) {
				clip.setMicrosecondPosition(0);
			}
			else if(respones.equalsIgnoreCase("C")) {
				clip.stop();
			}
			else{
				System.out.println("Error");
			}
		}
		System.out.println("Byeeeeeee!");
	}

}
