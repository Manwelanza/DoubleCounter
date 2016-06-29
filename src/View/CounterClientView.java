package View;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;

@SuppressWarnings("serial")
public class CounterClientView extends JPanel{
	
	private JLabel titleLabel;
	private JLabel counterLabel;
	
	public CounterClientView () {
		initPanel("", 0);
	}
	
	public CounterClientView (String title) {
		initPanel(title, 0);
	}
	
	public CounterClientView (String title, int counter) {
		initPanel(title, counter);
	}
	
	private void initPanel (String title, int counter) {
		setLayout(new BorderLayout(2, 3));
		
		setTitleLabel(new JLabel (title));
		getTitleLabel().setHorizontalAlignment(JLabel.CENTER);
		getTitleLabel().setVerticalAlignment(JLabel.CENTER);
		getTitleLabel().setBorder(new LineBorder(Color.BLUE, 3, true));
		
		setCounterLabel(new JLabel(Integer.toString(counter)));
		getCounterLabel().setHorizontalAlignment(JLabel.CENTER);
		getCounterLabel().setVerticalAlignment(JLabel.CENTER);
		getCounterLabel().setBorder(new LineBorder(Color.BLACK, 2, true));
		
		add(getTitleLabel(), BorderLayout.NORTH);
		add (getCounterLabel(), BorderLayout.CENTER);
		setVisible(true);
	}

	public String getTitle() {
		return getTitleLabel().getText();
	}

	public void setTitle(String title) {
		getTitleLabel().setText(title);
	}

	public int getCounter() {
		return Integer.parseInt(getCounterLabel().getText());
	}

	public void setCounter(int counter) {
		getCounterLabel().setText(Integer.toString(counter));
	}

	public JLabel getTitleLabel() {
		return titleLabel;
	}

	public void setTitleLabel(JLabel titleLabel) {
		this.titleLabel = titleLabel;
	}

	public JLabel getCounterLabel() {
		return counterLabel;
	}

	public void setCounterLabel(JLabel counterLabel) {
		this.counterLabel = counterLabel;
	}

	
}