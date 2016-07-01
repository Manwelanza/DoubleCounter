package View;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

@SuppressWarnings("serial")
public class CounterAdminView extends JPanel{

	private JTextField title;
	private JTextField counter;
	private JButton plus;
	private JButton minus;
	
	public CounterAdminView () {
		
	}
	
	public void init () {
		setLayout(new BorderLayout(2, 3));
		
		initTitle();
		initCounter();
		
		add(getTitle(), BorderLayout.NORTH);
		add (getCounter(), BorderLayout.CENTER);
		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout());
		panel.add(getMinus());
		panel.add(getPlus());
		add (panel, BorderLayout.SOUTH);
		setVisible(true);
	}
	
	private void initTitle () {
		getTitle().setHorizontalAlignment(JLabel.CENTER);
	}
	
	private void initCounter () {
		getCounter().setHorizontalAlignment(JLabel.CENTER);
		getCounter().setBorder(new LineBorder(Color.BLACK, 2, true));
		
		Font font = new Font ("Dialog", Font.BOLD, 144);
		getCounter().setFont(font);
	}

	public JTextField getTitle() {
		return title;
	}

	public void setTitle(JTextField title) {
		this.title = title;
	}

	public JTextField getCounter() {
		return counter;
	}

	public void setCounter(JTextField counter) {
		this.counter = counter;
	}

	public JButton getPlus() {
		return plus;
	}

	public void setPlus(JButton plus) {
		this.plus = plus;
	}

	public JButton getMinus() {
		return minus;
	}

	public void setMinus(JButton minus) {
		this.minus = minus;
	}
	
}
