package Collection;

public class BinarySearchtree {
	Node root;
	class Node{
		int data;
		Node left,right;
		  Node(int data){
			this.data=data;
			left=null;
			right=null;
					
		}
	}
	
	BinarySearchtree(int data){
		root=new Node(data);
	}
	
	public void insert(int data) {
		  insertBin(root,data);
	}

	 Node insertBin(Node root, int data) {
		 
		    if(root==null) {
		    	 return new Node(data);
		    }
		    if(data<root.data) {
		    	root.left=insertBin(root.left,data);
		    }
		    else 
		    {
		    	root.right=insertBin(root.right, data);
		    }
			return root;
	}
	 
	 void inorder(Node root) {
		   if(root!=null) {
			   inorder(root.left);
			   System.out.print(root.data+" ");
			   inorder(root.right);
		   }
	 }
	 
	 public Node search(Node root,int ser) {
		 if(root.data==ser || root==null)
			 return root;  
		 if(ser<root.data) {
			 return search(root.left,ser); 
		 }
		 return search(root.right,ser);
		     
		 
	 }
	 
	 public Node delete(Node root, int del) {
		// System.out.println("root=="+root.data);
		 if(root == null )  
			 return root;
		 
		 if(del<root.data)
			 root.left=delete(root.left,del);
		 else if(del>root.data)
			 root.right=delete(root.right,del);
		 else {
			 if(root.left==null) {
				 return root.right;
			 }
			 else if(root.right==null) 
				 return root.left;
			  
			 root.data=min(root.right);
			 root.right=delete(root.right,root.data);
			 
		 }
		 return root;
	 }

	private int min(Node root) {
		 int min=root.data;
		 while(root.left!=null) {
			 min=root.left.data;
			 root=root.left;
		 }
 		return min;
	}

	public static void main(String[] args) {
		BinarySearchtree ob=new BinarySearchtree(50);
		ob.insert(20);
		ob.insert(70);
		ob.insert(10);
		ob.insert(25);
		ob.insert(60);
		ob.insert(90);
		ob.insert(80);
		ob.insert(75);
		ob.inorder(ob.root);
		/*
		 * try { if(ob.search(ob.root,90)!=null) {
		 * System.out.println("\nyes valiue fount"); } } catch(NullPointerException e) {
		 * System.out.println("\nSry not found"); }
		 */
		  
		ob.delete(ob.root,70);
		System.out.println();
		ob.inorder(ob.root);
	}

}
