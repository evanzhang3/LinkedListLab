import java.util.*;
public class ZhangListListLab {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		ListNode<String> head = null, prev = null;
		String userInput = "";
		for(int i = 1; i < 4; i++) {
			do{
				System.out.println("Problem " + i);
				System.out.println("Enter a string (q to quit)");
				String userString = sc.nextLine();
				if(!userString.equalsIgnoreCase("q")) {
					head = new ListNode<String>(userString,null);
					prev = head;
				}
				do {
					if(!userString.equalsIgnoreCase("q")) {
						System.out.println("Enter a string (q to quit)");
						userString = sc.nextLine();
						if(!userString.equalsIgnoreCase("q")) {
							ListNode<String> newNode = new ListNode<String>(userString, null);
							prev.setNext(newNode);
							prev = newNode;
						}
					}
				} while(!userString.equalsIgnoreCase("q"));
				if(i == 1) {
					printStringLinkList(addToStartAndEnd(head));
				} else if (i == 2) {
					cloneJack(head);
					printStringLinkList(head);
				} else {
					printStringLinkList(killBill(head));
				}
				System.out.println("Do you want to test again (y for yes, n for no)");
				userInput = sc.nextLine();
			} while(!userInput.equalsIgnoreCase("n"));
		}
		System.out.println("End of Program");
	}

	public static ListNode<String> addToStartAndEnd(ListNode<String> head) {
		ListNode<String> start = head;
		ListNode<String> startNode = new ListNode<String>("Start",head);
		if(start == null) {
			ListNode<String> endNode = new ListNode<String>("End", null);
			startNode.setNext(endNode);
			return startNode;
		}
		while(start != null) {
			if(start.getNext() == null) {
				ListNode<String> endNode = new ListNode<String>("End", null);
				start.setNext(endNode);
				break;
			}
			start = start.getNext();
		}
		return startNode;

	}

	public static void cloneJack(ListNode<String> start) {
		ListNode<String> head = start;
		while(head != null) {
			if(head.getValue().equalsIgnoreCase("Jack")) {
				ListNode<String> newNode = new ListNode<String>("Jack", head.getNext());
				head.setNext(newNode);
				head = newNode.getNext();
			} else {
				head = head.getNext();
			}
		}
	}

	public static ListNode<String> killBill(ListNode<String> start) {
		ListNode<String> head = start;
		ListNode<String> prev = start;
		ListNode<String> newHead = null;
		while(head != null) {
			if(head.getValue().equalsIgnoreCase("Bill")) {
				prev.setNext(head.getNext());
			} else if(newHead == null) {
				newHead = head;
			}
			prev = head;
			head = head.getNext();
		}
		return newHead;
	}

	public static void printStringLinkList(ListNode<String> head) {
		ListNode<String> temp = head;
		while(temp != null) {
			System.out.print(temp.getValue() + " ");
			temp = temp.getNext();
		}
		System.out.println();
		System.out.println("End of Print");
		System.out.println();
	}
}	
