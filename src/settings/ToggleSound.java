package settings;

import java.io.*;
import java.net.MalformedURLException;
import java.applet.*;

public class ToggleSound {
	
	AudioClip fx;
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
}
