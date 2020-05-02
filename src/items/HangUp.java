package items;
import java.awt.Component;
import java.awt.GridLayout;
import java.io.File;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class HangUp extends JPanel
{
	
	
	public static JLabel labela = new JLabel("Ju mund te flisni " + 0 + " sekonda");

	public HangUp(double koha) 
	{
		double k = koha;
		CallEnded l = new CallEnded();
		
		setLayout(null);
		
		setLayout(new GridLayout(2,1));
        
        add(new JLabel("Connected ..... "));
        add(labela );
        
      
	

	}
}
