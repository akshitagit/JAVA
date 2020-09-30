/*Java program to create, detect and find loop in SLL.
Pre-requiste: Check Floyd Cycle Detection Algorithm :)*/

import java.util.*;

class DetectLoop{
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
	public Node createLoop(Node head){
		Node end = head;
		Node loopPosition = head;

		int count = 3;      //Creating the loop from 3 node;
		while(end.next != null){
			end = end.next;
		}
		while(--count != 0){
			loopPosition = loopPosition.next;
		}
		end.next = loopPosition;
		return head;
	}
	public Node detect(Node head){  // Check whether loop is there or not.
		Node hare = head;           // hare which always move ahead of tortoise.
		Node tortoise = head;
		while(hare != null && tortoise != null && tortoise.next != null){
			hare = hare.next.next;
			tortoise = tortoise.next;
			if(hare == tortoise){  // if loop is there, they will surely meet at one place.
				System.out.println("There is a loop");			
				return hare;
			}

		}
		return null;
	}
	public int startLoopPlace(Node loop, Node head){ //According to Floyd Cycle detection algo, Distance between start and loop position is equal to meet and loop position.
		Node current = head;
		while(current != loop){  
			current = current.next;
			loop = loop.next;
		}
		return loop.data;
	}
	public static Node head = null;
	public static void main(String[] args) {
			DetectLoop l1 = new DetectLoop();

			head = l1.add(head,1);
			head = l1.add(head,2);
			head = l1.add(head,3);
			head = l1.add(head,4);
			head = l1.add(head,5);
			head = l1.add(head,6);

			l1.display(head);

			head = l1.createLoop(head);
			//l1.display(head);    //Uncomment the code to get the loop :>

			Node loop = l1.detect(head);
			int loopData = l1.startLoopPlace(loop,head);
			System.out.println("Loop starts from node data:" + loopData);
		}	
}