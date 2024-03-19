package random;

class Node {
	int data;
	Node next;

	Node(int data) {
		this.data = data;
		this.next = null;
	}
}

class LinkedList {
	Node head;

	// Function to reverse the linked list
	public void reverse() {
		Node prev = null;
		Node current = head;
		Node next;

		while (current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		head = prev;
	}

	// Function to print the linked list
	public void print() {
		Node current = head;
		while (current != null) {
			System.out.print(current.data + " ");
			current = current.next;
		}

		System.out.println();
	}
}

public class ReverseLinkedList {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
//this way we can insert without creating insert method
		list.head = new Node(1);
		list.head.next = new Node(2);
		list.head.next.next = new Node(3);
		list.head.next.next.next = new Node(4);

//		list.insert(1);
//        list.insert(2);
//        list.insert(3);
//        list.insert(4);
//        list.insert(5);

		System.out.println("Original linked list:");
		list.print();

		list.reverse();

		System.out.println("Reversed linked list:");
		list.print();
	}
}
