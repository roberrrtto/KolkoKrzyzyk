package toe.tac.tic;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.File;

class MusicClass {

	void playMusic(String musicLocation) {

		try {
			File musicPath = new File(musicLocation);
			if (musicPath.exists()) {
				AudioInputStream audioInput = AudioSystem.getAudioInputStream(musicPath);
				Clip clip = AudioSystem.getClip();

				clip.open(audioInput);
				clip.start();
				clip.loop(Clip.LOOP_CONTINUOUSLY);

			} else
				System.out.println("THERE IS NO MUSIC");
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
