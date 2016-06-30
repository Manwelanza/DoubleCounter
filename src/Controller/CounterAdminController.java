package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JTextField;

import Model.Counter;
import Model.CounterList;

public class CounterAdminController implements ActionListener{

	private JButton plus;
	private JButton minus;
	private JTextField title;
	private JTextField counter;
	private int index;
	private ViewController controller;
	
	public CounterAdminController (ViewController controller, int index) {
		setController(controller);
		setPlus(new JButton ("+"));
		getPlus().addActionListener(this);
		setMinus(new JButton ("-"));
		getMinus().addActionListener(this);
		setTitle(new JTextField());
		getTitle().addActionListener(this);
		getTitle().setEditable(true);
		setCounter(new JTextField());
		getCounter().addActionListener(this);
		getCounter().setEditable(true);
		setIndex(index);
		
		Counter counter = CounterList.instance.getCounter(getIndex());
		getTitle().setText(counter.getTitle());
		getCounter().setText(Integer.toString(counter.getCounter()));
	}
	
	@Override
	public void actionPerformed(ActionEvent event) {
		System.out.println("aaa");
		Counter counter = CounterList.instance.getCounter(getIndex());
		if (event.getSource() == getPlus()) {
			int aux = counter.getCounter() + 1;
			getCounter().setText(Integer.toString(aux));
			getController().changeCounter(aux, getIndex());
			counter.increase();
			System.out.println("dd");
		}
		else if (event.getSource() == getMinus()) {
			int aux = counter.getCounter() - 1;
			if (aux < 0) {
				aux = 0;
			}
			getCounter().setText(Integer.toString(aux));
			getController().changeCounter(aux, getIndex());
			counter.decrease();
		}
		else if (event.getSource() == getTitle()) {
			counter.setTitle(getTitle().getText());
			getController().changeTitle (getTitle().getText(), getIndex());
		}
		else if (event.getSource() == getCounter()) {
			int aux;
			try {
				aux = Integer.parseInt(getCounter().getText());
			}
			catch (Exception exception) {
				aux = 0;
			}
			if (aux < 0) {
				aux = 0;
			}
			getController().changeCounter(aux,getIndex());
		}
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

	public ViewController getController() {
		return controller;
	}

	public void setController(ViewController controller) {
		this.controller = controller;
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

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

}
