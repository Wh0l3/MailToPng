package gifMail;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import javax.imageio.ImageIO;

public class imageMaker {

	public imageMaker(String email) throws MalformedURLException, IOException{
		final BufferedImage image = ImageIO.read(new URL(
		"http://upload.wikimedia.org/wikipedia/en/2/24/Lenna.png"));
		
		
		Graphics g = image.getGraphics();
	    g.setFont(g.getFont().deriveFont(30f));
	    g.drawString("Hello World!", 100, 100);
	    g.dispose();
	}
}
