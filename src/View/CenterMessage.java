package View;

import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class CenterMessage extends JPanel {
	private String message;

	public CenterMessage () {
		setMessage(" ");
		setOpaque(false);
	}
	
	public CenterMessage (String message) {
		setMessage(message);
		setOpaque(false);
	}
	
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		Font font = new Font("Courier", Font.BOLD, 32);
		g.setFont(font);

		FontMetrics fm = g.getFontMetrics();      
		int stringWidth = fm.stringWidth(getMessage()); 
		int stringAscent = fm.getAscent();
		
		int fontSize = font.getSize();
		int fontAscend = (fontSize * (getHeight()))/ stringAscent;
		int fontWidth = (fontSize * (getWidth())) / stringWidth;
		if (fontAscend > fontWidth) {
			font = new Font("Courier", Font.BOLD, fontWidth);
		}
		else {
			font = new Font("Courier", Font.BOLD, fontAscend);
		}

		g.setFont(font);
		fm = g.getFontMetrics();
		stringWidth = fm.stringWidth(getMessage());
		stringAscent = fm.getAscent();

		int xCoordinate = (getWidth() - stringWidth) / 2; 
		int yCoordinate = ((getHeight() - 10) + stringAscent) / 2;
		g.drawString(getMessage(), xCoordinate, yCoordinate);
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
		repaint();
	}

}
