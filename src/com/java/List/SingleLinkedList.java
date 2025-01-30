package com.java.List;

public class SingleLinkedList {

	private ListNode head;

	private static class ListNode {

		private int data;
		private ListNode next;

		public ListNode(int data) {
			this.data = data;
			this.next = null;
		}

	}

	private void display() {
		ListNode current = head;
		while (current != null) {
			System.out.print(current.data + ",");
			current = current.next;
		}
		System.out.print("null");
		System.out.println();
	}

	private void display(ListNode Node) {
		ListNode current = Node;
		while (current != null) {
			System.out.print(current.data + ",");
			current = current.next;
		}
		System.out.print("null");
		System.out.println();
	}

	private int length() {

		int count = 0;
		if (head == null) {
			return 0;
		}
		ListNode current = head;
		while (current != null) {
			count++;
			current = current.next;
		}
		return count;
	}

	public void insertFirst(int data) {

		ListNode newNode = new ListNode(data);

		newNode.next = head;
		head = newNode;
	}

	public void insertLast(int data) {

		ListNode newNode = new ListNode(data);
		if (head == null) {
			head = newNode;
			return;
		}
		ListNode current = head;
		while (current.next != null) {

			current = current.next;
		}
		current.next = newNode;
	}

	public void insertAtPos(int position, int data) {

		ListNode newNode = new ListNode(data);
		if (position == 1) {
			newNode.next = head;
			head = newNode;
		} else {

			ListNode previous = head;
			int count = 1;
			while (count < position - 1) {
				previous = previous.next;
				count++;
			}
			ListNode current = previous.next;
			previous.next = newNode;
			newNode.next = current;
		}
	}
//<================================================================================================>
//				Delete
//<================================================================================================>

	public ListNode deleteFirst() {
		if (head == null) {
			return null;
		}
		ListNode temp = head;
		head = head.next;
		temp.next = null;
		return temp;
	}

	public ListNode deleteLastNode() {
		if (head == null || head.next == null) {
			return head;
		}
		ListNode current = head;
		ListNode previous = null;
		while (current.next != null) {
			previous = current;
			current = current.next;
		}
		previous.next = null;
		return current;
	}

	public void deleteNodeAtPos(int position) {
		if (position == 1) {
			head = head.next;
		}
		ListNode previous = head;
		int count = 1;
		while (count < position - 1) {
			previous = previous.next;
			count++;
		}
		ListNode current = previous.next;
		previous.next = current.next;
	}

//<================================================================================================>
//	Search Methods
//<================================================================================================>

	public boolean find(int searchKey) {

		if (head == null) {
			return false;
		}
		ListNode current = head;
		while (current != null) {
			if (current.data == searchKey) {
				return true;
			}
			current = current.next;
		}
		return false;
	}

	public ListNode reverseSSL() {

		if (head == null) {
			return null;
		}
		ListNode current = head;
		ListNode next = null;
		ListNode previous = null;
		while (current != null) {
			next = current.next;
			current.next = previous;
			previous = current;
			current = next;
		}
		return previous;
	}

	public ListNode GetMiddleNodeSSL() {
		if (head == null) {
			return null;
		}
		ListNode slowPointer = head;
		ListNode fastPointer = head;
		while (fastPointer != null && fastPointer.next != null) {

			slowPointer = slowPointer.next;
			fastPointer = fastPointer.next.next;
		}
		return slowPointer;
	}

	public void removeDuplicates() {

		if (head == null) {
			return;
		}
		ListNode current = head;
		while (current != null && current.next != null) {
			if (current.data == current.next.data) {
				current.next = current.next.next;
			} else {
				current = current.next;
			}
		}
	}

	public ListNode insertSortedList(int data) {
		ListNode newNode = new ListNode(data);
		if (head == null) {
			return null;
		}
		ListNode current = head;
		ListNode tempNode = null;
		while (current != null && current.data < newNode.data) {
			tempNode = current;
			current = current.next;
		}
		newNode.next = current;
		tempNode.next = newNode;
		return head;
	}

	public void deleteNodeByKey(int key) {

		ListNode current = head;
		ListNode tempNode = null;

		if (current != null && current.data == key) {
			head = current.next;
		}
		while (current != null && current.data != key) {
			tempNode = current;
			current = current.next;
		}
		if (current == null) {
			return;
		}

		tempNode.next = current.next;

	}

	public boolean containsLoop() {

		ListNode slowPntr = head;
		ListNode fastPntr = head;

		while (fastPntr != null && fastPntr.next != null) {
			fastPntr = fastPntr.next.next;
			slowPntr = slowPntr.next;
			if (fastPntr == slowPntr) {
				return true;
			}
		}

		return false;
	}

	public ListNode startNodeInSSLLoop() {

		ListNode slowPntr = head;
		ListNode fastPntr = head;

		while (fastPntr != null && fastPntr.next != null) {
			fastPntr = fastPntr.next.next;
			slowPntr = slowPntr.next;
			if (fastPntr == slowPntr) {
				return getStartingNode(slowPntr);
			}
		}
		return null;
	}

	private ListNode getStartingNode(ListNode slowPntr) {
		ListNode temp = head;
		while (temp != slowPntr) {
			temp = temp.next;
			slowPntr = slowPntr.next;
		}
		return temp;// starting node of the loop
	}

	public void removeLoopSSL() {

		ListNode slowPntr = head;
		ListNode fastPntr = head;

		while (fastPntr != null && fastPntr.next != null) {
			fastPntr = fastPntr.next.next;
			slowPntr = slowPntr.next;
			if (fastPntr == slowPntr) {
				removeLoop(slowPntr);
				return;
			}
		}
	}

	private void removeLoop(ListNode slowPntr) {

		ListNode temp = head;
		while (temp.next != slowPntr.next) {
			temp = temp.next;
			slowPntr = slowPntr.next;
		}
		slowPntr.next = null;
	}

	public ListNode mergeSSLs(ListNode a, ListNode b) {

		ListNode dummy = new ListNode(0);
		ListNode tail = dummy;

		while (a != null && b != null) {

			if (a.data < b.data) {

				tail.next = a;
				a = a.next;
			} else {
				tail.next = b;
				b = b.next;
			}
			tail = tail.next;
		}
		if (a == null) {
			tail.next = b;
		} else {
			tail.next = a;
		}
		return dummy.next;

	}

	public ListNode addSSLs(ListNode a, ListNode b) {

		ListNode dummay = new ListNode(0);
		ListNode tail = dummay;
		int carry = 0;
		while (a != null && b != null) {
			int x = (a != null) ? a.data : 0;
			int y = (b != null) ? b.data : 0;

			int sum = carry + x + y;
			carry = sum / 10;
			tail.next = new ListNode(sum % 10);
			tail = tail.next;
			if (a != null)
				a = a.next;
			if (b != null)
				b = b.next;
		}
		if (carry > 0) {
			tail.next = new ListNode(carry);
		}
		return dummay.next;
	}

	public static void main(String[] args) {

//		SingleLinkedList sll = new SingleLinkedList();
//
//		ListNode l1 = new ListNode(10);
//		ListNode l2 = new ListNode(2);
//		ListNode l3 = new ListNode(5);
//		ListNode l4 = new ListNode(8);
//		sll.head = l1;
//		sll.head.next = l2;
//		l2.next = l3;
//		l3.next = l4;
//		// Display inserted nodes
//		sll.display();
//		// Length of SLL
//		System.out.println("Length :" + sll.length());
//		// Insert a Element at beginning of SLL
//		sll.insertFirst(21);
//		sll.display();
//		System.out.println("Length :" + sll.length());
//		// Insert a Element at End of SLL
//		sll.insertLast(30);
//		sll.display();
//		System.out.println("Length :" + sll.length());
//
//		// Insert a Element at Position of SLL
//		sll.insertAtPos(4, 99);
//		sll.display();
//		System.out.println("Length :" + sll.length());
//		// Delete FirstNode
//		/*
//		 * ListNode firstNode = sll.deleteFirst(); sll.display();
//		 * System.out.println("Delete first Node :" + firstNode.data);
//		 */
//
//		// Delete LastNode
//		/*
//		 * ListNode lastNode = sll.deleteLastNode(); sll.display();
//		 * System.out.println("Delete first Node :" + lastNode.data);
//		 */
//
//		// Delete Node at given position
//		/*
//		 * sll.deleteNodeAtPos(3); sll.display();
//		 * System.out.println("Delete first Node :" + sll.length());
//		 */
//		// Search an Element in SSL
//		/* System.out.println("Is Search Key Available : " + sll.find(30)); */
//		// Reverse the given SSL and Print the Elements
//		/*
//		 * ListNode revList = sll.reverseSSL(); sll.display(revList);
//		 */
//
//		// Get the middle node in the given SSL
//		ListNode node = sll.GetMiddleNodeSSL();
//		sll.display();
//		System.out.println("Middle Node : " + node.data);
//
//		// Remove Duplicate node in sorted SSL
//		sll.insertLast(30);
//		sll.display();
//		System.out.println("Length : " + sll.length());
//		sll.removeDuplicates();
//		sll.display();
//		System.out.println("Lenght : " + sll.length());
//		/**
//		 * SSL Must contains the sorted data then only expected results proper
//		 */
//		ListNode sortedHeadList = sll.insertSortedList(22);
//		sll.display(sortedHeadList);
//		// Delete Node based on the key
//		sll.deleteNodeByKey(22);
//		sll.display(sortedHeadList);

		// Data setup for the SSL Loops

//		SingleLinkedList sll = new SingleLinkedList();
//
//		ListNode l1 = new ListNode(1);
//		ListNode l2 = new ListNode(2);
//		ListNode l3 = new ListNode(3);
//		ListNode l4 = new ListNode(4);
//		ListNode l5 = new ListNode(5);
//		ListNode l6 = new ListNode(6);
//
//		sll.head = l1;
//		l1.next = l2;
//		l2.next = l3;
//		l3.next = l4;
//		l4.next = l5;
//		l5.next = l6;
//		// l6.next = l3;// Loop
//		// Display inserted nodes
//		// sll.display();
//		System.out.println("SSL Contains Loop : " + sll.containsLoop());
//		ListNode startLoopNode = sll.startNodeInSSLLoop();
//		System.out.println("Starting Node in the SSL Loop : " + startLoopNode.data);
//		sll.removeLoopSSL();
//		sll.display();

//		SingleLinkedList sll = new SingleLinkedList();
//		ListNode l1 = new ListNode(1);
//		ListNode l2 = new ListNode(2);
//		ListNode l3 = new ListNode(3);
//		ListNode l4 = new ListNode(4);
//		ListNode l5 = new ListNode(5);
//		ListNode l6 = new ListNode(6);
//		ListNode l7 = new ListNode(7);
//		ListNode l8 = new ListNode(8);
//
//		l1.next = l3;
//		l3.next = l5;
//
//		l2.next = l4;
//		l4.next = l6;
//		l6.next = l7;
//		l7.next = l8;
//
//		ListNode mergeList = sll.mergeSSLs(l1, l2);
//		sll.display(mergeList);
		
		SingleLinkedList sll = new SingleLinkedList();
		ListNode l1 = new ListNode(3);
		ListNode l2 = new ListNode(4);
		ListNode l3 = new ListNode(3);
		
		
		ListNode l4 = new ListNode(5);
		ListNode l5 = new ListNode(6);
		ListNode l6 = new ListNode(4);
		//ListNode l7 = new ListNode(7);
		//ListNode l8 = new ListNode(8);

		l1.next = l2;
		l2.next = l3;

		l4.next = l5;
		l5.next = l6;
		//l6.next = l7;
		//l7.next = l8;

		ListNode mergeList = sll.addSSLs(l1, l4);
		sll.display(mergeList);


	}
}
