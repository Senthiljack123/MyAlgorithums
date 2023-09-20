package Collection;

public class Binarytree {
	  Node root;
	class Node{
		int data;
		Node left,right;
		Node(int d){
			data=d;
			left=null;
			right=null;
		}
	}
	public Binarytree(int d){
		root=new Node(d);
	}
	
	 public void insertLeft(Node r,int d) {
		  Node  t=new Node(d);
		  r.left=t;
	 }
    
	 public void insertRight(Node r,int d) {
		  Node  t=new Node(d);
		  r.right=t;
	 }
	 
	 public static void preOrder(Node root) {
		 if(root!=null) {
			 System.out.print(root.data+" ");
			 preOrder(root.left);
			 preOrder(root.right);
		 }
		 
	 }
	 
	 public static void inOrder(Node root) {
		 if(root!=null) {
			
			 inOrder(root.left);
			 System.out.print(root.data+" ");
			 inOrder(root.right);
		 }
		 
	 }
	 
	 public static void postOrder(Node root) {
		 if(root!=null) {
			
			 postOrder(root.left);
			 postOrder(root.right);
			 System.out.print(root.data+" ");
		 }
		 
	 }
	public static void main(String[] args) {
		Binarytree ob=new Binarytree(10);
		ob.insertLeft(ob.root, 5);
		ob.insertRight(ob.root, 15);
		ob.insertLeft(ob.root.left, 3);
		ob.insertRight(ob.root.left, 8);
		ob.insertLeft(ob.root.right, 12);
		
		Binarytree.preOrder(ob.root);
		System.out.println();
		Binarytree.inOrder(ob.root);
		System.out.println();
		Binarytree.postOrder(ob.root);
         
	}

}
