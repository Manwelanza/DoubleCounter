package Model;

public class Counter {

	private String title;
	private int counter;

	public Counter () {
		setTitle("");
		setCounter(0);
	}
	
	public Counter (String title, int counter) {
		setTitle(title);
		setCounter(counter);
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getCounter() {
		return counter;
	}

	public void setCounter(int counter) {
		this.counter = counter;
	}

}
