package random;

public class LinkedListSingular {
	Node head;
	private int size;

	LinkedListSingular() {
		this.size = 0;
	}

	// [NOTE] constructor will be called at the time of object creation
	class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			this.next = null;
			size++;
		}
	}

	public void addFirst(int data) {
		Node node = new Node(data);
		if (head == null) {
			head = node;
			return;
		}

		node.next = head;
		head = node;

	}

	public void addLast(int data) {
		Node node = new Node(data);
		if (head == null) {
			head = node;
			return;
		}

		Node currNode = head;
		while (currNode.next != null) {
			currNode = currNode.next;
		}
		currNode.next = node;
	}

	public void show() {
		if (head == null) {
			System.out.println("list is empty");
			return;
		}

		Node node = head;
		while (node != null) {
			System.out.print(node.data + "------->");
			node = node.next;
		}
		System.out.println("NULL");

	}

	public void deleteFirst() {
		if (head == null) {
			System.out.println("list is empty");
			return;
		}
		size--;
		head = head.next;
	}

	public void deleteLast() {
		if (head == null) {
			System.out.println("list is empty");
			return;
		}
		size--;
		// if there is only node it mean it will be first one also
		if (head.next == null) {
			head = null;
			return;
		}

		Node secondLast = head;
		Node lastNode = head.next;
		while (lastNode.next != null) {
			lastNode = lastNode.next;
			secondLast = secondLast.next;
		}
		secondLast.next = null;
	}

	public int getSize() {
		return size;
	}
	
	public void reverseIterative() {
	   if(head==null || head.next==null) {
		   return;
	   }
	   
	   Node prevNode=head;
	   Node currNode=head.next;
	   while(currNode!=null) {
		   Node nextNode=currNode.next;
		   currNode.next=prevNode;
		   
		   //Update---traverse towards right side
		   prevNode=currNode;
		   currNode=nextNode;
		  
	   }
	   head.next=null;
	   head=prevNode;  //Here we cannot write like this -- head= prevNode.next; because prevNode.next will represent second last Data 
	}
	
	
	public Node reverseRecursive(Node head) {
		
		if(head==null || head.next==null) {
			return head;
		}
		
		Node newHead = reverseRecursive(head.next);
		head.next.next=head;
		head.next=null;
		return newHead;
	}
	
	public boolean hasCycle(Node head) {
		Node slow=head;
		Node fast =head;
		
		while(head!=null&&fast.next!=null) {
			slow=slow.next;
			fast=fast.next.next;
			
			if(slow==fast) {
				return true;
			}
		}
		
		return false;	
	}
	
	public void deleteLoop(Node head) {
		Node slow=head;
		Node fast =head;
		
		while(head!=null&&fast.next!=null) {
			slow=slow.next;
			fast=fast.next.next;
			
			if(slow==fast) {
				
				slow=head;
				while(slow.next!=fast.next) {
					slow=slow.next;
					fast=fast.next;
				}
				fast.next=null;
				return;
			}
	}}
	
	public static void main(String[] args) {
		LinkedListSingular list = new LinkedListSingular();
		list.addFirst(1);
		list.addFirst(2);
		list.show();
		System.out.println("size is --"+list.getSize());

		list.addLast(3);
		list.addLast(4);
		list.addLast(5);
		list.show();
		System.out.println("size is --"+list.getSize());

		list.deleteFirst();
		list.show();
		System.out.println("size is --"+list.getSize());

		list.deleteLast();
		list.show();
		System.out.println("size is --"+list.getSize());
		
//		list.reverseIterative();
//		list.show();
		
		  list.head = list.reverseRecursive(list.head);
		list.show();  
		
		boolean hasCycle = list.hasCycle(list.head);
		System.out.println(hasCycle);
	}
}
