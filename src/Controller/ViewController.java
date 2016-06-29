package Controller;

import Model.Counter;
import Model.CounterList;
import View.MainView;

public class ViewController {
	private MainView mainView;
	
	public ViewController () {
		setMainView(new MainView ());
		getMainView().start();
	}
	
	public ViewController (int widthAdmin, int heightAdmin, int widthClient, int heightClient) {
		setMainView(new MainView (widthAdmin, heightAdmin, widthClient, heightClient));
		getMainView().start();
	}

	public void AddCounter (String title) {
		CounterList.instance.setCounter(new Counter (title));
		getMainView().resetClient(CounterList.instance.getList().size());
	}
	
	public MainView getMainView() {
		return mainView;
	}

	public void setMainView(MainView mainView) {
		this.mainView = mainView;
	}
}
