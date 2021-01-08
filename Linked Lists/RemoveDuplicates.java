/* Remove Duplicates from a singly LinkedList
Tc-->O(N^2)  Sc-->O(1)
*/

class RemoveDuplicates{
   
    class innernode
	{
		int data;
		innernode next;
	}
	static innernode head;
	
	public void insert(int data)
	{
		innernode node =new innernode();
		node.data=data;
		node.next=null;
		if(head==null)
		{
			head=node;
		}
		else 
		{
			innernode n=head;
			while(n.next!=null)
			{
				n=n.next;
			}
			n.next=node;
		}
		
    }
    public void display(innernode head)
	{
		innernode run=head;
		while(run.next!=null)
		{
			System.out.print(run.data+" ");
			run=run.next;
		}
		System.out.println(run.data);
    } 
    void removeDuplicates() { 
        innernode h1 = null, h2 = null, duplicate = null; 
        h1 = head; 
  
        while (h1 != null && h1.next != null) { 
            h2 = h1; 
  
           
            while (h2.next != null) { 
  
               
                if (h1.data == h2.next.data) { 
  
                 
                    duplicate = h2.next; 
                    h2.next = h2.next.next; 
                    
                } else  { 
                    h2 = h2.next; 
                } 
            } 
            h1 = h1.next; 
        } 
    }

    
    public static void main(String[] args){
        RemoveDuplicates rd=new RemoveDuplicates();
        rd.insert(1);
        rd.insert(1);
        rd.insert(2);
        rd.insert(9);
        rd.insert(10);
        rd.insert(3);
        rd.insert(5);
        rd.insert(5);
        rd.display(head);
        rd.removeDuplicates();
        rd.display(head);
    }

}

    
   