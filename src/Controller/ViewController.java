package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;

import Model.Counter;
import Model.CounterList;
import View.CounterAdminView;
import View.CounterClientView;
import View.MainView;

public class ViewController {
	private MainView mainView;
	private ArrayList <CounterClientView> counterClient;
	private ArrayList <CounterAdminController> counterAdminController;
	
	private JButton addButton;
	
	
	public ViewController () {
		setMainView(new MainView ());
		getMainView().start();
		setCounterClient(new ArrayList <CounterClientView> ());
		setCounterAdminController(new ArrayList <CounterAdminController> ());
		initAdminPanel ();
	}
	
	public ViewController (int widthAdmin, int heightAdmin, int widthClient, int heightClient) {
		setMainView(new MainView (widthAdmin, heightAdmin, widthClient, heightClient));
		getMainView().start();
		setCounterClient(new ArrayList <CounterClientView> ());
		setCounterAdminController(new ArrayList <CounterAdminController> ());
		initAdminPanel ();
	}
	
	public void initAdminPanel () {
		setAddButton(new JButton("+"));
		
		getAddButton().addActionListener (new ActionListener() {
			public void actionPerformed(ActionEvent e){
				AddCounter ("Title"); 
			} 
		});
		
		getMainView().setAddButton(getAddButton());
	}

	public void changeCounter (int number, int index) {
		getCounterClient().get(index).changeCounter (number);
	}
	
	public void changeTitle (String title, int index) {
		getCounterClient().get(index).changeTitle(title);
	}
	
	public void AddCounter (String title) {
		Counter counter = new Counter (title);
		CounterList.instance.setCounter(counter);
		
		//Client
		CounterClientView counterView = new CounterClientView (counter.getTitle(), counter.getCounter());
		getMainView().loadCounterClient(counterView);
		getCounterClient().add(counterView);
		
		//Admin
		CounterAdminController counterController = new CounterAdminController(this, CounterList.instance.getList().size() - 1);
		CounterAdminView counterAdminView = new CounterAdminView();
		counterAdminView.setPlus(counterController.getPlus());
		counterAdminView.setMinus(counterController.getMinus());
		counterAdminView.setTitle(counterController.getTitle());
		counterAdminView.setCounter(counterController.getCounter());
		counterAdminView.init();
		getCounterAdminController().add(counterController);
		getMainView().loadCounterAdmin (counterAdminView);
		
	}
	
	public MainView getMainView() {
		return mainView;
	}

	public void setMainView(MainView mainView) {
		this.mainView = mainView;
	}

	public ArrayList<CounterClientView> getCounterClient() {
		return counterClient;
	}

	public void setCounterClient(ArrayList<CounterClientView> counterClient) {
		this.counterClient = counterClient;
	}

	public ArrayList<CounterAdminController> getCounterAdminController() {
		return counterAdminController;
	}

	public void setCounterAdminController(ArrayList<CounterAdminController> counterAdminController) {
		this.counterAdminController = counterAdminController;
	}

	public JButton getAddButton() {
		return addButton;
	}

	public void setAddButton(JButton addButton) {
		this.addButton = addButton;
	}
}
