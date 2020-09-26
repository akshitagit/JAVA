/*Find middle element of the linked list.*/
/* TC: O(N) && SC: O(1) */

import java.util.*;

class FindMiddle{
	class Node{
		int data;
		Node next;

		public Node(int data){
			this.data = data;
			this.next = null;
		}
	}
	public Node add(Node head, int data){
		Node newNode = new Node(data);
		if(head == null){
			head = newNode;
			return head;
		}
		else{
			Node current = head;
			while(current.next != null){
				current = current.next;
			}
			current.next = newNode;
			return head;
		}
	}
	public void display(Node head){
		if(head == null){
			System.out.println("List is empty");
		}
		else{
			Node current = head;
			while(current != null){
				System.out.print("->" + current.data);
				current = current.next;
			}
		}
	}
	public int find(Node head){  //Tortoise and hare approach or Two pointer approach.
		Node forward = head;
		Node backward = head;
		if(head == null){
			System.out.println("List is empty");
		}
		else{
			while(forward != null && forward.next != null){
				forward = forward.next.next;
				backward = backward.next;
			}
		}
		return backward.data;
	}
	public static Node head = null;
	public static void main(String[] args) {
		FindMiddle l1 = new FindMiddle();

		head = l1.add(head,1);
		head = l1.add(head,2);
		head = l1.add(head,3);
		head = l1.add(head,4);
		head = l1.add(head,5);
		head = l1.add(head,6);
		head = l1.add(head,7);
		head = l1.add(head,8);
		head = l1.add(head,9);
		
		l1.display(head);

		System.out.println("");
		int middle = l1.find(head);
		System.out.println("Middle element of the Linked List is: "+middle);

	}
}