
public class ZhangArrayList implements StringList{
	private String[] array;
	public ZhangArrayList() {
		array = new String[0];
	}
	public ZhangArrayList(String[] nameArray) {
		//		int counter = 0;
		//		DoubleListNode<String> newNode = null;
		array = new String[nameArray.length];
		for(int i = 0; i < nameArray.length; i++) {
			array[i] = nameArray[i];
		}
	}
	@Override
	public void add(int index, String newItem) {
		if(index > array.length || index < 0) {
			System.out.println("Invalid index: " + index);
			return;
		}
		String[] holder = array;
		array = new String[array.length + 1];
		for(int i = 0; i < index; i++) {
			array[i] = holder[i];
		}
		array[index] = newItem;
		for(int i = index + 1; i < array.length; i++) {
			array[i] = holder[i -1];
		}

	}

	@Override
	public String get(int index) {
		if(index >= array.length || index < 0) {
			return null;
		}
		return array[index];
	}

	@Override
	public void remove(int index) {
		String[] holder = array;
		if(index >= array.length || index < 0) {
			return;
		}

		array = new String[array.length -1];

		for(int i = 0; i < index; i++) {
			array[i] = holder[i];
		}
		for(int i = index + 1; i < array.length + 1; i++) {
			array[i - 1] = holder[i];
		}

	}

	@Override
	public int size() {
		return array.length;
	}

	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		for(int i = 0; i < array.length; i++) {
			sb.append(array[i]);
			sb.append(" ");
		}
		return sb.toString();
	}
}
