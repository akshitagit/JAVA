class Tree 
{
    class Passing{
        int index;
    }
    
    //Function to serialize a tree and return a list containing nodes of tree.
	public void serialize(Node root, ArrayList<Integer> A) 
	{
	    //base case if node is null.
	    if(root==null){
	        A.add(-1);
	        return;
	    }   
	    
	    //storing the data at node in list.
	    A.add(root.data);
	    
	    //calling function recursively for left and right subtrees.
	    serialize(root.left, A);
	    serialize(root.right, A);
	}
	
	//Function to construct the tree.
	public Node kewl(ArrayList<Integer> A, Passing ps) 
	{
	    //base case if there are no more elements in list.
        if (ps.index == A.size() || A.get(ps.index) == -1) 
        {
            ps.index += 1;
            return null;
        }
        //creating new node for storing current element.
        Node root = new Node(A.get(ps.index));
        ps.index += 1;
        
        //calling function recursively for left and right subtrees.
        root.left = kewl(A, ps);
        root.right = kewl(A, ps);
        return root;
    }
    
    //Function to deserialize a list and construct the tree.
    public Node deSerialize(ArrayList<Integer> A)
    {
        Passing ps=new Passing();
        ps.index=0;
        //returning the tree.
        return kewl(A, ps);
    }
}
