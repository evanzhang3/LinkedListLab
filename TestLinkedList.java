

// The "TestLinkedList" class
import java.util.Scanner;

public class TestLinkedList
{
	public static Scanner sc = new Scanner(System.in);

	public static void main (String[] args)
	{

		//
		// Part (a) 
		//

		// This program creates linked list of 4 user supplied strings
		// and then prints out the names in the linked list

		// First need a reference to the start of the linked list
		System.out.println("Enter a string: ");
		String s = sc.next();
		ListNode<String>first = new ListNode<String>(s, null);
		ListNode<String>prev = first;

		// prompt the user for four strings
		for (int i=0; i<3; i++)
		{
			System.out.println("Enter a string: ");
			s = sc.next();
			ListNode<String>node = new ListNode<String>(s, null);
			prev.setNext(node);
			prev = node;

		}

		// Print out linked list
		printStringLinkedList (first);


		//
		// Part (b) 
		//

		// Same as above, but create a linked list of 4 user supplied integers

		// First need a reference to the start of the linked list
		System.out.println("Enter an integer: ");
		int ii = sc.nextInt();
		ListNode<Integer>firstI = new ListNode<Integer>(ii, null);
		ListNode<Integer>prevI = firstI;

		// prompt the user for four strings
		for (int i=0; i<3; i++)
		{
			System.out.println("Enter an integer: ");
			int jj = sc.nextInt();
			ListNode<Integer>nodeI = new ListNode<Integer>(jj, null);
			prevI.setNext(nodeI);
			prevI = nodeI;

		}

		printIntLinkedList(firstI);


		//
		// Part (c) 
		//

		// Create a linked list of two Accounts 
		// For each, print out the name and balance of each on a separate line



	} // main method


	// Why do we need to declare this method as static?
	public static void printStringLinkedList (ListNode<String> start)
	{
		while(start != null)
		{
			System.out.println(start.getValue());
			start = start.getNext();
		}
	} // printLinkedList


	public static void printIntLinkedList (ListNode<Integer> start)
	{
		while(start != null)
		{
			System.out.println(start.getValue());
			start = start.getNext();
		}
	} // printLinkedList



} // printLinkedList















