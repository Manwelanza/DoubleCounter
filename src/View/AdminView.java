package View;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class AdminView extends JFrame{

	private static final int COLUMNS = 3;
	
	private JButton addButton;
	
	public AdminView (int weidth, int height) {
		setBounds(10,10,weidth, height);
		setTitle("Administrador");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public void resetAdmin () {
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
	
	public void addButton () {
		initLayout (getContentPane().getComponentCount() + 1);
		add (getAddButton());
	}
	
	public void loadCounters (CounterAdminView counter) {
		initLayout (getContentPane().getComponentCount() + 1);
		System.out.println(getContentPane().getComponentCount());
		add (counter); 
		setVisible(true);
	}
	
	public JButton getAddButton() {
		return addButton;
	}

	public void setAddButton(JButton addButton) {
		this.addButton = addButton;
	}
	
}
