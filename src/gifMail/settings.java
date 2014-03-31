package gifMail;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class settings extends JFrame {

	public settings(){
		 Graphics g = settings.getGraphics();
		    g.setFont(g.getFont().deriveFont(30f));
		    g.drawString("Hello World!", 100, 100);
		    g.dispose();
	}
}
