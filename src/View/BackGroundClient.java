package View;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.JLabel;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class BackGroundClient extends JPanel{

	private Image image;
	
	public BackGroundClient () {
		setImage(new javax.swing.ImageIcon(getClass().getResource("/View/Images/logoTLP.png")).getImage());
		//setImage (createImage(800, 600));
		//setBackground(Color.RED);
		add (new JLabel (new javax.swing.ImageIcon(getClass().getResource("/View/Images/logoTLP.png"))));
	}

	@Override
	public void paintComponent (Graphics g){
			g.drawImage(getImage(), 0, 0, 200, 200, null);
			super.paintComponent(g);
	}
	
	public Image getImage() {
		return image;
	}

	public void setImage(Image image) {
		this.image = image;
	}
	
}
