package Model;

public class Counter {

	private String title;
	private int counter;

	public Counter () {
		setTitle("");
		setCounter(0);
	}
	
	public Counter (String title) {
		setTitle(title);
		setCounter(0);
	}
	
	public Counter (String title, int counter) {
		setTitle(title);
		setCounter(counter);
	}

	public void reset () {
		setCounter(0);
	}
	
	public void increase () {
		increase (1);
	}
	
	public void increase (int count) {
		if (count < 0) {
			throw new NumberFormatException("The value must be greater than 0");
		}
		else {
			setCounter(getCounter() + count);
		}
	}
	
	public void decrease () {
		decrease(1);
	}
	
	public void decrease (int count) {
		if (count < 0) {
			throw new NumberFormatException("The value must be greater than 0");
		}
		else {
			setCounter(getCounter() - count);
			if (getCounter() < 0) {
				setCounter(0);
			}
		}
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

	private void setCounter(int counter) {
		this.counter = counter;
	}

}
