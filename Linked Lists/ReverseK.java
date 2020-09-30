/*Reverse SLL of given size k using recursion.
TC:O(N) && SC:O(1). if not considering stack memory*/

import java.util.*;

class ReverseK{
	class Node{
		int data;
		Node next;

		public Node(int data){
			this.data = data;
			this.next = null;
		}
	}
	public static Node head = null;
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
		Node current = head;

		if(head == null){
			System.out.println("List is empty");
		}
		else{
			while(current != null ){
				System.out.print("->"+current.data);
				current = current.next;
			}
		}
	}
	public Node reverse(Node head, int k){
		Node current = head;
		Node prev = null;
		Node next = null;
		int count = 0;
		while(count != k && current != null){
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
			count++;
		}
		if(next != null){
			head.next = reverse(next,k);  //At each recursive call head of group points to reverse of next group
		}
		return prev;
	}
	public static void main(String[] args) {
		ReverseK l1 = new ReverseK();

		head = l1.add(head,1);
		head = l1.add(head,2);
		head = l1.add(head,3);
		head = l1.add(head,4);
		head = l1.add(head,5);
		head = l1.add(head,6);

		l1.display(head);

		head = l1.reverse(head,2);  //2 is my k size
		System.out.println("");
		System.out.println("After reversing by k size");
		l1.display(head);
	}
}