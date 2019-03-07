
public class StudentNameLinkedList implements StringList{
	private DoubleListNode<String> head;
	private DoubleListNode<String> tail;
	public StudentNameLinkedList() {
		head = null;
	}
	public StudentNameLinkedList(String[] nameArray) {
		//		int counter = 0;
		//		DoubleListNode<String> newNode = null;
		for(String name:nameArray) {
			if(head == null) {
				head = tail = new DoubleListNode<String>(name,null,null);
				//				counter = 1;
			} else {
				tail = new DoubleListNode<String>(name,tail,null);
			}
		}
	}
	@Override
	public void add(int index, String newItem) {
		DoubleListNode<String> node = head;
		if(index > size() || index < 0) {
			System.out.println("Invalid index: " + index);
			return;
		}

		if(index == size()) {	
			//put at end of list
			DoubleListNode<String> newNode = new DoubleListNode<String>(newItem, tail, null);
			if(index != 0) {
				tail.setNext(newNode);
				tail = newNode;
			} else {
				//add to empty list
				head = tail = newNode;
			}
			return;
		}

		for(int i = 0; i < index; i++) {
			node = node.getNext();
		}
		DoubleListNode<String> newNode = new DoubleListNode<String>(newItem, node.getPrevious(), node);
		if(node.getPrevious() != null) {
			// insert in the middle
			node.getPrevious().setNext(newNode);
			node.setPrevious(newNode);
		} else {
			//insert at head
			head = newNode;
			node.setPrevious(newNode);
		}
	}

	@Override
	public String get(int index) {
		DoubleListNode<String> holder = head;
		if(index >= size() || index < 0) {
			return null;
		}
		for(int i = 0; i < index; i++) {
			holder = holder.getNext();
		}
		return holder.getValue();
	}

	@Override
	public void remove(int index) {
		DoubleListNode<String> holder = head;
		if(index >= size() || index < 0) {
			return;
		}
		if(size() == 1) {
			//remove when there's one node
			head = tail = null;
			return;
		}
		for(int i = 0; i < index; i++) {
			holder = holder.getNext();
		}
		if(holder == tail) {
			// if node is the tail
			holder.getPrevious().setNext(null);
			tail = holder.getPrevious();
			return;
		}
		if(holder == head) {
			//if node the head
			holder.setPrevious(null);
			head = holder.getNext();
			return;
		}
		if(size() != 1) {
			//remove node in the middle
			holder.getPrevious().setNext(holder.getNext());
			holder.getNext().setPrevious(holder.getPrevious());
		}

	}

	@Override
	public int size() {
		DoubleListNode<String> holder = head;
		int counter = 0; 
		while(holder != null) {
			counter++;
			holder = holder.getNext();
		}
		return counter;
	}
	
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		DoubleListNode<String> holder = head;
		while(holder != null) {
			sb.append(holder.getValue());
			sb.append(" ");
			holder = holder.getNext();
		}
		return sb.toString();
	}
}
