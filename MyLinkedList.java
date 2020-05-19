package com.pack.datastruture;

public class MyLinkedList {
	Node head;

	static class Node {
		int data;
		Node next;

		// Constructor create new Node && next is default initialized to null
		Node(int d) {
			data = d;
			next = null;
		}
	}

	// method to insert new node
	public static MyLinkedList insert(MyLinkedList list, int data) {
		// create new node with given data;
		Node newNode = new Node(data);
		newNode.next = null;
		// Check Linked list empty make that node as head node
		if (list.head == null) {
			list.head = newNode;
		} else {
			Node last = list.head;
			while (last.next != null) {
				last = last.next;
			}

			last.next = newNode;
		}

		return list;
	}

	public static MyLinkedList deleteAtPosition(MyLinkedList list, int index) {
		Node currentNode = list.head, prev = null;

		// case 1: index is zero then head node will be deleted.
		if (index == 0 && currentNode != null) {
			list.head = currentNode.next;
			// display msg
			System.out.println(index + " position node will deleted");
			return list;
		}
		// case 2: index is greater than 0

		int counter = 0;

		while (currentNode.next != null) {
			if (counter == index) {
				prev.next = currentNode.next;
				System.out.println(index + " position node will deleted");
				break;
			}
			else
			{
				prev = currentNode;
				currentNode = currentNode.next;
				counter ++;
		     }
	     }
		 //case 3: index is greater than the list size
		 if(currentNode == null)
		 {
			 System.out.println(index + " position element not found");
		 }
		
		 return list;
		 
	}
		

	public static void printList(MyLinkedList list) {
		Node currentNode = list.head;

		System.out.println("LinkedList: ");

		while (currentNode != null) {
			System.out.println(currentNode.data + " point next:" + currentNode.next);
			currentNode = currentNode.next;
		}
	}

	// Driver code
	public static void main(String[] args) {
		/* Start with the empty list. */
		MyLinkedList list = new MyLinkedList();

		//
		// ******INSERTION******
		//

		// Insert the values
		list = insert(list, 1);
		list = insert(list, 2);
		list = insert(list, 3);
		list = insert(list, 4);
		list = insert(list, 5);
		list = insert(list, 6);
		list = insert(list, 7);
		list = insert(list, 8);

		// Print the LinkedList
		printList(list);
		
		list.deleteAtPosition(list, 1);
		
		printList(list);
	}

}
