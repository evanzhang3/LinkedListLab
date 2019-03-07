import java.util.*;

public class ZhangDoubleLinkedListTester {

	public static void main(String[] args) {
		int userInput = 0;
		Scanner sc = new Scanner(System.in);
//		DoubleListNode<String> head = null;
//		DoubleListNode<String> tail = null;
		ZhangArrayList ll = new ZhangArrayList();
		do {
			if(userInput != 6) {
				System.out.println("Choose an action");
				System.out.println("Add a String (Option 1)");
				System.out.println("Get a String (Option 2)");
				System.out.println("Remove a String (Option 3)");
				System.out.println("Find length of List (option 4)");
				System.out.println("Print Out the List (Option 5)");
				System.out.println("Quit (option 6)");
				System.out.println("Enter the option Number");
				userInput = sc.nextInt();
				sc.nextLine();
				if(userInput == 1) {
					System.out.println("What String do you want to add");
					String userString = sc.nextLine();
					System.out.println("Where do you want to add it");
					int userLocation = sc.nextInt();
					sc.nextLine();
					ll.add(userLocation, userString);
				} else if(userInput == 2) {
					System.out.println("What is the locaiton of this string");
					int userLocation = sc.nextInt();
					sc.nextLine();
					System.out.println("The String at " + userLocation + " is " + ll.get(userLocation));
				} else if( userInput == 3) {
					System.out.println("What is the index of the String you want to remove");
					int userLocation = sc.nextInt();
					sc.nextLine();
					ll.remove(userLocation);
				} else if(userInput == 4) {
					System.out.println("The length of the list is " + ll.size());
				} else if(userInput == 5) {
					System.out.println(ll.toString());
					System.out.println();
				} else if(userInput == 6) {
					System.out.println("Program Quit");
				} else {
					System.out.println("Enter a valid option");
				}
			}
		} while(userInput != 6);
		System.out.println("End of Program");
	}

}
