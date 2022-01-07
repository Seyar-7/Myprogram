import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class JLable_practice_2{
	
	
	JLable_practice_2() throws UnsupportedAudioFileException, IOException, LineUnavailableException{
		
		Scanner scan = new Scanner(System.in);
		File file = new File("Islabonita - An Jone.wav");
		AudioInputStream audiostream = AudioSystem.getAudioInputStream(file);
		Clip clip = AudioSystem.getClip();
		clip.open(audiostream);
		clip.start();
		scan.next();
		
	}
	
}
