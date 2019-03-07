import java.util.ArrayList;
import java.util.Scanner;

public class ZhangCircleLinkedList {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String userString = "";
		ListNode<String> head = null, prev = null;
		ArrayList<ListNode<String>> circleHeads = null;
		System.out.println("Enter a String (Q to quit)");
		userString = sc.nextLine();
		head = new ListNode<String>(userString, null);
		prev = head;
		do {
			System.out.println("Enter a String (Q to quit)");
			userString = sc.nextLine();
			
			if(userString.equalsIgnoreCase("Q")) {
				break;
			}
			ListNode<String> newNode = new ListNode<String>(userString, null);
			prev.setNext(newNode);
			prev = newNode;
		} while(true);
		
		makeCircularLinkedList(head);
		System.out.println("Original big circle");
		printCircle(head);
		System.out.println();
		circleHeads = splitCircle(head);
		System.out.println("First small circle");
		printCircle(circleHeads.get(0));
		System.out.println();
		System.out.println("second small circle");
		printCircle(circleHeads.get(1));
		

	}
	public static ListNode<String> makeCircularLinkedList(ListNode<String> node) {
		ListNode<String> head = node;
		ListNode<String> tail = null;
		while(node != null) {
			tail = node;
			node = node.getNext();
		}
		tail.setNext(head);
		return head;
	}
	public static ArrayList<ListNode<String>> splitCircle(ListNode<String> node) {
		ListNode<String> head = node;
		ListNode<String> tail = null;
		ListNode<String> next = node.getNext();
		ListNode<String> startSecond = null;
		//calculate length of circle and find circle tail
		int length = 1;
		while(next != head) {
			tail = next;
			length++;
			next = next.getNext();
		}
		// split circles
		next = head;
		for(int i = 0; i < (length/2) - 1; i++) {
			next = next.getNext();
		}
		//make 2 new circles
		startSecond = next.getNext();
		next.setNext(head);
		tail.setNext(startSecond);
		// return starting points of 2 new circles
		ArrayList<ListNode<String>> startingPoints = new ArrayList<ListNode<String>>();
		startingPoints.add(head);
		startingPoints.add(tail);
		return startingPoints;
	}
	public static void printCircle(ListNode<String> node) {
		ListNode<String> head = node;
		ListNode<String> next = node;
		int counter = 1; 
		while(counter != 3) {
			System.out.print(next.getValue() + " ");
			next = next.getNext();
			if(next == head) {
				counter++;
				System.out.println();
			}

		}
	}
}
