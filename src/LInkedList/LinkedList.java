package LInkedList;



public class LinkedList {
	Node head;

	public void insert(int data) {
		Node node = new Node();
		node.data = data;
		Node next = null;

		if (head == null) {
			head = node;
		} else {

			Node n = head;
			while(n.next!=null) {
				n=n.next;
			}
			n.next=node;
		}
	}
	public void show() {
		Node nodes=head;
		while(nodes.next!=null) {
			System.out.println(nodes.data);
			nodes=nodes.next;
		}
		System.out.println(nodes.data);
		
	}
	
	

}
