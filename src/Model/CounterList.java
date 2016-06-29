package Model;

import java.util.ArrayList;

public class CounterList {

	private ArrayList <Counter> list;

	public CounterList () {
		setList(new ArrayList<Counter> ());
	}

	public void remove (int index) {
		if (index + 1 > size() || index + 1 <= 0) {
			throw new NumberFormatException("The value must be greater than 0 and less than the size");
		}
		
		getList().remove(index);
	}

	public void remove (Counter counter) {
		getList().remove(counter);
	}

	public void setCounter (Counter counter) {
		getList().add(counter);
	}

	public Counter getCounter (int index) {
		if (index + 1 > size() || index + 1 <= 0) {
			throw new NumberFormatException("The value must be greater than 0 and less than the size");
		}

		return getList().get(index);
	}

	public ArrayList<Counter> getList() {
		return list;
	}

	public void setList(ArrayList<Counter> list) {
		this.list = list;
	}

	public int size() {
		return getList().size();
	}

}
