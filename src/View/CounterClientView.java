package View;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JPanel;
import javax.swing.border.LineBorder;

@SuppressWarnings("serial")
public class CounterClientView extends JPanel{
	
	private CenterMessage centerTitle;
	private CenterMessage centerCounter;
	
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
	   /*setLayout(new BorderLayout(2, 3));
		
		initTitleLabel(title);
		initCounterLabel(counter);
		
		add(getTitleLabel(), BorderLayout.NORTH);
		add (getCounterLabel(), BorderLayout.CENTER);*/
		setOpaque(false);
		setLayout(new GridLayout(2, 1));
		initCenterTitle(title);
		initCenterCounter(counter);
		
		JPanel panel = new JPanel ();
		panel.setOpaque(false);
		panel.setLayout(new BorderLayout(2, 10));
		panel.add(new CenterMessage (), BorderLayout.NORTH);
		panel.add(getCenterTitle(), BorderLayout.CENTER);
		panel.add(new CenterMessage (), BorderLayout.SOUTH);
		add (panel);
		add (getCenterCounter());
		setVisible(true);
	}
	

	private void initCenterTitle (String title) {
		setCenterTitle(new CenterMessage(title));
		getCenterTitle().setBorder(new LineBorder(Color.BLUE, 2, true));
	}
	
	private void initCenterCounter (int counter) {
		setCenterCounter(new CenterMessage(Integer.toString(counter)));
		getCenterCounter().setBorder(new LineBorder(Color.BLACK, 2, true));
	}
	
	public void changeCounter (int number) {
		getCenterCounter().setMessage(Integer.toString(number));
		setVisible(true);
	}
	
	public void changeTitle (String title) {
		getCenterTitle().setMessage(title);
		setVisible(true);
	}
	
	public String getTitle() {
		return getCenterTitle().getMessage();
	}

	public void setTitle(String title) {
		changeTitle(title);
	}

	public CenterMessage getCenterTitle() {
		return centerTitle;
	}

	public void setCenterTitle(CenterMessage centerTitle) {
		this.centerTitle = centerTitle;
	}

	public CenterMessage getCenterCounter() {
		return centerCounter;
	}

	public void setCenterCounter(CenterMessage centerCounter) {
		this.centerCounter = centerCounter;
	}

	
}
