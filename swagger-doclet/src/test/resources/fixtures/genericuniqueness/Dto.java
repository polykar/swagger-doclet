package fixtures.genericuniqueness;

import java.util.ArrayList;
import java.util.List;

public class Dtot<T> {

	private List<T> items;

	public List<T> getItems() {
		if (items == null) {
			items = new ArrayList<T>();
		}
		return items;
	}

	public void setItems(List<T> items) {
		this.items = items;
	}
	
}
