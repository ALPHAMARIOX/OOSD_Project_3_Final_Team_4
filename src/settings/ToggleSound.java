package settings;

import java.io.*;
import java.net.MalformedURLException;
import java.applet.*;
import java.awt.CheckboxMenuItem;

public class ToggleSound {
	
	public AudioClip fx;
	public CheckboxMenuItem chckbxmntmToggleSound = new CheckboxMenuItem();
	public ToggleSound() {
		try {
			fx = Applet.newAudioClip(new File("./audio/beep.wav").toURI().toURL());
			
		}
		catch (MalformedURLException e) {
			System.out.println(e);
		}
	}
	
	public void playSound() {
		fx.play();
	}
	
	public void useSound() {
		if (chckbxmntmToggleSound.isSelected() == true)
		{
			playSound();
		}
	}
}
