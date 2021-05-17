import java.awt.*;
import BreezyGUI.*;

public class Winner2 extends GBFrame {
	public void paint(Graphics g) {
		Font font = new Font("Arial", Font.PLAIN, 100);
		g.setFont(font);
		g.drawString("The winner is ", 30, 150);
		
		Image Valorant;
		Valorant = new Image("Valorant.png");
		Valorant.draw(g, 700, 40, 250, 250);
		
		Image playAgain;
		playAgain = new Image("playAgain.jpeg");
		playAgain.draw(g, 150, 185, 400, 75);
		
	}
	public void mouseClicked(int x, int y) {
		
		if (x >= 150 && x <= 550 && y >= 185 && y <= 260)
		{	
			super.dispose();
			Frame frm = new boardColor(); 
			frm.setSize (1500, 750); //Set the application's window width and height in pixels
			frm.setVisible (true); //Make the window visible to the user
		}
		
	}
}