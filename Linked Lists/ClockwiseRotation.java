
class ClockwiseRotation
{
//node of linked_list
static class Node
{
	int data;
	Node next;
}

//insert data into list
static Node push(Node head_ref, int new_data)
{
	Node new_node = new Node();
	new_node.data = new_data;
	new_node.next = (head_ref);
	(head_ref) = new_node;
	return head_ref;
}

//print the linked_list
static void printList(Node node)
{
	while (node != null)
	{
		System.out.print(node.data + " -> ");
		node = node.next;
	}
	System.out.println( "null");
}


static Node clockwise_rotate(Node head, int k)
{
	if (head == null)
		return head;

	Node tmp = head;
	int len = 1;
	while (tmp.next != null)
	{
		tmp = tmp.next;
		len++;
	}

	if (k > len)
		k = k % len;

	k = len - k;
	if (k == 0 || k == len)
		return head;

	Node current = head;
	int cnt = 1;
	while (cnt < k && current != null)
	{
		current = current.next;
		cnt++;
	}

	if (current == null)
		return head;
	Node kthnode = current;
	tmp.next = head;
	head = kthnode.next;
	kthnode.next = null;
	return head;

}

public static void main(String args[])
{
	Node head = null;
	head = push(head, 5);
	head = push(head, 4);
	head = push(head, 3);
	head = push(head, 2);
	head = push(head, 1);
  printList(head);
	int k = 2;
  System.out.println("k="+k);
	Node updated_head = clockwise_rotate(head, k);
  System.out.println("rotated list");
	printList(updated_head);
}
}
