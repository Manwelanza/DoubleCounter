package Main;

import Controller.ViewController;
import Model.CounterList;
import View.MainView;

public class Main {

	public static void main(String[] args) {
		
		CounterList.createInstance();
		ViewController  viewController = new ViewController();
	}

}
