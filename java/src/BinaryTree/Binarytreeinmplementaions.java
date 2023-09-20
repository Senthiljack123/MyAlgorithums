package BinaryTree;

 

public class Binarytreeinmplementaions {
	Node root;
	class Node{
		Node left,right;
		int data;
		Node(int data){
			this.data=data;
			left=right=null;
		}
	}
 
     public Binarytreeinmplementaions(int data) {
    	 root=new Node(data);
 	}
     void insert(int data) {
    	 insertNodes(root,data);
     }
     
     Node insertNodes(Node root, int data) {
    	 
    	 if(root==null)
    		 return new Node(data);
    	 
    	 if(data<root.data) {
    		 root.left=insertNodes(root.left,data);
    		 
    	 }
    	 else {
    		 root.right=insertNodes(root.right,data);

    	 }
		return root;
     }
     
       Node search(Node root,int ser) {
    	   
    	   if(root.data==ser || root==null) {
    		   return root; 
    	   }
    	   if(ser<root.data) 
    		 return  search(root.left,ser);
    	    
    	    return search(root.right,ser);
     
       }
     
     
	 public Node delete(Node root, int del) {
		//System.out.println("root=="+root.data);
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
     
     void inOrder(Node root) {
    	   if(root!=null) {
    		 
    		   inOrder(root.left);
    		   System.out.print(root.data+" ");
    		   inOrder(root.right);
    		  
    	   }
    	  
     }


	public static void main(String[] args) {
        Binarytreeinmplementaions ob=new Binarytreeinmplementaions(50);
        ob.insert(20);
		ob.insert(70);
		ob.insert(10);
		ob.insert(25);
		ob.insert(60);
		ob.insert(90);
		ob.insert(80);
		ob.insert(75);
        ob.inOrder(ob.root);
		
		   
	      if(ob.search(ob.root,25)==null) {
		       System.out.println("\nVAlue not  fount"); }
			  
		  else
		       System.out.println("\nyes value found");
		  
			
			  ob.delete(ob.root, 70);
			  System.out.println(); 
			  ob.inOrder(ob.root);
			 
		 
       
		}
}
