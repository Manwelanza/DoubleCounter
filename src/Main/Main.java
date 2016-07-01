package Main;

import javax.swing.UIManager;

import Controller.ViewController;
import Model.CounterList;

public class Main {

	public static void main(String[] args) {
		
		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		CounterList.createInstance();
		@SuppressWarnings("unused")
		ViewController  viewController = new ViewController();
	}

}


