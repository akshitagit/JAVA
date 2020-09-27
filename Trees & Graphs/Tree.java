final class Node<T> {
    T data;
    Node<T> left=null;
    Node<T> right=null;

    public Node(T param){
        this.data = param;
    }

    public void preorder() {
        System.out.print(this.data+" ");
        if(this.left!=null)
            this.left.preorder();
        if(this.right!=null)
            this.right.preorder();
    }

    public void inorder(){
        if(this.left!=null)
            this.left.inorder();
        System.out.print(this.data+" ");
        if(this.right!=null)
            this.right.inorder();
    }

    public void postorder(){
        if(this.left!=null)
            this.left.postorder();
        if(this.right!=null)
            this.right.postorder();
        System.out.print(this.data+" ");
    }

    public boolean dfs(T content){
        boolean lres = false;
        boolean rres = false;
        if(this.data == content)
            return true;
        if(this.left!=null)
            lres = this.left.dfs(content);
        if(this.right!=null)
            rres = this.right.dfs(content);
        return lres||rres;
    }
}

class Tree {
    public static void main(String[] args) {
        Node<Integer> a = new Node<Integer>(5);
        a.left= new Node<Integer>(3);
        a.right= new Node<Integer>(7);
        a.left.left= new Node<Integer>(2);
        a.left.right= new Node<Integer>(4);
        a.right.left= new Node<Integer>(6);
        a.right.right= new Node<Integer>(8);
        a.preorder();
        System.out.println();
        a.inorder();
        System.out.println();
        a.postorder();
        System.out.println();
        System.out.println(a.dfs(5));
        System.out.println(a.dfs(8));
        System.out.println(a.dfs(1));
    }
}