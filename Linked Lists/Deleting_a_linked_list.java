class LinkedList 
{ 
    Node head; // head of the list 
  
    /* Linked List node */
    class Node 
    { 
        int data; 
        Node next; 
        Node(int d) { data = d; next = null; } 
    } 
  
    /* Function deletes the entire linked list */
    void deleteList() 
    { 
        head = null; 
    } 
  
    /* Inserts a new Node at front of the list. */
    public void push(int new_data) 
    { 
        /* 1 & 2: Allocate the Node & 
                  Put in the data*/
        Node new_node = new Node(new_data); 
  
        /* 3. Make next of new Node as head */
        new_node.next = head; 
  
        /* 4. Move the head to point to new Node */
        head = new_node; 
    } 
  
    public static void main(String [] args) 
    { 
        LinkedList llist = new LinkedList(); 
        /* Use push() to construct below list 
           1->12->1->4->1  */
  
        llist.push(1); 
        llist.push(4); 
        llist.push(1); 
        llist.push(12); 
        llist.push(1); 
  
        System.out.println("Deleting the list"); 
        llist.deleteList(); 
  
        System.out.println("Linked list deleted"); 
    } 
} 
