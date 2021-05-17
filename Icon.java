import java.awt.*;
import BreezyGUI.*;

public class Icon extends GBFrame {
	public void iconPick (Graphics g) {
		Font font = new Font("Arial", Font.PLAIN, 70);
		g.setFont(font);
		g.drawString("Which Icon would you like? ", 30, 150);
	}
}
