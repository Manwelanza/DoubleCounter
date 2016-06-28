package Main;

import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame ();
		frame.setBounds(10,10,300,200);
        frame.setVisible(true);
		frame.setTitle("Controlador");
		
		JFrame frame2 = new JFrame ();
		frame2.setBounds(310,10,300,200);
        frame2.setVisible(true);
		frame2.setTitle("Cliente");
	}

}
