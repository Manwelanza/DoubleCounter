package View;

import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class ClientView extends JFrame{

	private static final int COLUMNS = 3;
	
	private Image image;
	
	public ClientView (int weidthAdmin, int weidth, int height) {
		setBounds(weidthAdmin + 10, 10, weidth, height);
		setTitle("Cliente");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public void resetClient () {
		getContentPane().removeAll();
	}
	
	private void initLayout (int count) {
		int rows = 0;
		rows = count / COLUMNS;
		if (count % COLUMNS != 0) {
			rows += 1;
		}
		GridLayout layout = new GridLayout(rows, COLUMNS);
		layout.setHgap(20);
		layout.setVgap(20);
		
		setLayout(layout);
		
	}
	
	public void loadCounters (CounterClientView counter) {
		initLayout (getContentPane().getComponentCount() + 1);
		System.out.println(getContentPane().getComponentCount());
		add (counter); 
		setVisible(true);
	}

	public Image getImage() {
		return image;
	}

	public void setImage(Image image) {
		this.image = image;
	}
}
