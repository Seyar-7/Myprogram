package GUI;

import java.io.File;
import java.io.IOException;

import javax.sound.sampled.*;

import java.util.Scanner;

public class Audio {
	
	Audio() throws UnsupportedAudioFileException, IOException, LineUnavailableException{
    	   Scanner scan = new Scanner(System.in);
    	   
    	   File file = new File("Islabonita - An Jone.wav");
    	   AudioInputStream audiostream = AudioSystem.getAudioInputStream(file);
    	   Clip clip = AudioSystem.getClip();
    	   clip.open(audiostream);
    	   clip.start();
    	  scan.next();
       }
	
}
