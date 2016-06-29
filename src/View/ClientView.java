package View;

import java.awt.GridLayout;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class ClientView extends JFrame{

	public ClientView (int weidthAdmin, int weidth, int height) {
		setBounds(weidthAdmin + 10, 10, weidth, height);
        setVisible(true);
		setTitle("Cliente");
		GridLayout layout = new GridLayout(1, 3);
		layout.setHgap(20);
		layout.setVgap(20);
		setLayout(layout);
		add (new CounterClientView("title 1"));
		add (new CounterClientView("title 2"));
		add (new CounterClientView("title 3"));
	}
	
}
