/*Merge Sort Linked List.*/

import java.util.*;

class MergeSortSLL{
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
	public Node sort(Node left, Node right){
		if(left == null){
			return right;
		}
		if(right == null){
			return left;
		}
		Node result = null;
		if(left.data <= right.data){
			result = left;
			left.next = sort(left.next,right);
		}
		else{
			result = right;
			right.next = sort(left,right.next);
		}

		return result;
	}
	public Node mergeSort(Node head){        //Divide into sub list
		if(head == null || head.next == null){
			return head;
		}
		Node fast = head; //end
		Node slow = head; //middle
		Node temp = null; //before middle
		while(fast != null && fast.next != null){
			temp = slow;
			fast = fast.next.next;
			slow = slow.next;
		}

		temp.next = null;

		Node left = mergeSort(head);
		Node right = mergeSort(slow);

		Node sortedList = sort(left,right);
		return sortedList;
	}
	public static Node head = null;
	public static void main(String[] args) {
		MergeSortSLL l1 = new MergeSortSLL();

		head = l1.add(head,5);
		head = l1.add(head,1);
		head = l1.add(head,6);
		head = l1.add(head,4);
		head = l1.add(head,3);
		head = l1.add(head,2);

		l1.display(head);

		head = l1.mergeSort(head);
		System.out.println("");
		l1.display(head);
	}
}