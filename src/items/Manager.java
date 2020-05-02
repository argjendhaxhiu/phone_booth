package items;
import java.io.File;
import java.net.URL;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;


public class Manager 
{
	public Manager() {
		// TODO Auto-generated constructor stub
	}
	
	
	public static void play(URL url)
	{
		
	    try
	    {
	        Clip clip = AudioSystem.getClip();
	        clip.open(AudioSystem.getAudioInputStream(url));
	        clip.loop(2);
	    }
	    catch (Exception exc)
	    {
	        exc.printStackTrace(System.out);
	    }
	}
	
	public static void playOneShot(URL url)
	{
		
	    try
	    {
	        Clip clip = AudioSystem.getClip();
	        //clip.open(AudioSystem.getAudioInputStream(new File(url)));
	        clip.open(AudioSystem.getAudioInputStream(url));
	        clip.start();
	    }
	    catch (Exception exc)
	    {
	        exc.printStackTrace(System.out);
	    }
	}
	
	public static boolean checkIsNumber(String toCheck) {
		try {
				Double.parseDouble(toCheck);
				return true;
			} catch (NumberFormatException numForEx) {
				return false;
			} 
		}
	
	
	
}
