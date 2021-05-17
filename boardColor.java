import java.awt.*;
import BreezyGUI.*;

public class boardColor extends GBFrame{
	private Image background, red, orange, green, cyan, blue, purple, gray;
	private String color = "";
	
	public void paint (Graphics g) {
		Image red, orange, green, cyan, blue, purple, gray;
		
		Font font = new Font("Arial", Font.PLAIN, 70);
		g.setFont(font);
		g.drawString("Which color would you like? ", 30, 90);
		
		red = new Image("red.png");
		orange = new Image("orange.jpeg");
		green = new Image("green.png");
		cyan = new Image("cyan.jpeg");
		blue = new Image("blue.png");
		purple = new Image("purple.jpeg");
		gray = new Image("gray.png");
		
		red.draw(g, 100, 100, 100, 100);
		orange.draw(g, 210, 100, 100, 100);
		green.draw(g, 320, 100, 100, 100);
		cyan.draw(g, 100, 210, 100, 100);
		blue.draw(g, 210, 210, 100, 100);
		purple.draw(g, 320, 210, 100, 100);
		gray.draw(g, 100, 320, 100, 100);
		
	}
		
	public void mouseClicked(int x, int y) {
		
		if (x >= 100 && x <= 200 && y >= 100 && y <= 200)
		{	
			super.dispose();
			Frame frm = new TheGUIPart("red"); 
			frm.setSize (500, 600); //Set the application's window width and height in pixels
			frm.setVisible (true); //Make the window visible to the user
		}
		if (x >= 210 && x <= 310 && y >= 100 && y <= 200)
		{	
			super.dispose();
			Frame frm = new TheGUIPart("orange"); 
			frm.setSize (500, 600); //Set the application's window width and height in pixels
			frm.setVisible (true); //Make the window visible to the user
		}
		if (x >= 320 && x <= 420 && y >= 100 && y <= 200)
		{	
			super.dispose();
			Frame frm = new TheGUIPart("green"); 
			frm.setSize (500, 600); //Set the application's window width and height in pixels
			frm.setVisible (true); //Make the window visible to the user
		}
		if (x >= 100 && x <= 200 && y >= 210 && y <= 310)
		{	
			super.dispose();
			Frame frm = new TheGUIPart("cyan"); 
			frm.setSize (500, 600); //Set the application's window width and height in pixels
			frm.setVisible (true); //Make the window visible to the user
		}
		if (x >= 210 && x <= 310 && y >= 210 && y <= 310)
		{	
			super.dispose();
			Frame frm = new TheGUIPart("blue"); 
			frm.setSize (500, 600); //Set the application's window width and height in pixels
			frm.setVisible (true); //Make the window visible to the user
		}
		if (x >= 320 && x <= 420 && y >= 210 && y <= 310)
		{	
			super.dispose();
			Frame frm = new TheGUIPart("purple"); 
			frm.setSize (500, 600); //Set the application's window width and height in pixels
			frm.setVisible (true); //Make the window visible to the user
		}
		if (x >= 100 && x <= 200 && y >= 320 && y <= 420)
		{	
			super.dispose();
			Frame frm = new TheGUIPart("gray"); 
			frm.setSize (500, 600); //Set the application's window width and height in pixels
			frm.setVisible (true); //Make the window visible to the user
		}
	}	
		
		/*
		 * import java.awt.*;
import BreezyGUI.*;

public class TheGUIPart extends GBFrame {
	private int[][] board;
	private int size;
	private boolean isWhiteTurn;

	TheGUIPart() {
		size = 3;
		board = new int[size][size];
		for (int row = 0; row < size; row++) {
			for (int col = 0; col < size; col++) {
				board[row][col] = 0;
			}
		}
		isWhiteTurn = true;
	}

	public void paint(Graphics g) {
		int x, y;
		g.setColor(Color.blue);
		Image Valorant, Battlefield1;
		Valorant = new Image("Valorant.png");
		Battlefield1 = new Image("Battlefield1.jpeg");
		for (int row = 0; row < size; row++) {
			for (int col = 0; col < size; col++) {
				x = col * 100 + 100;
				y = row * 100 + 100;
				g.drawRect(x, y, 100, 100);
				if (board[row][col] == 1) {
					Valorant.draw(g, x + 20, y + 20, 60, 60);
				} else if (board[row][col] == -1) {
					Battlefield1.draw(g, x + 20, y + 20, 60, 60);
				}
			}
		}
	}
	
		 */
}
