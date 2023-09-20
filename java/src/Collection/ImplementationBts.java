package Collection;

public class ImplementationBts {
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
     
     public ImplementationBts(int d) {
    	 root =new Node(d);
     }
     
     Node insert(Node root, int d) {
    	  if(root==null) {
    		  return new Node(d);
    	  }
    	  if(d<root.data) {
    		  root.left=insert(root.left,d);
    	  }
    	  else 
    		   root.right=insert(root.right,d);
    	  
		return root;
    	 }
     
     void inOrder(Node root) {
    	  if(root!=null) {
    	  inOrder(root.left);
    	  System.out.print(root.data+" ");
    	  inOrder(root.right);
     }
    	  }
     
     public Node search(Node root,int val) {
    	 
    	 if(root.data==val || root==null)
    		 return root;
    	 
    	 if(val<root.data) {
    		   return search(root.left,val);
    	 }
    	 else return search(root.right,val);
 
     }
     
     Node delete(Node root,int del) {
    	   if(root==null)                      
    		   return root;
    	   if(del<root.data)
    		   root.left=delete(root.left,del);
    	   else if(del>root.data) {
    		   root.right=delete(root.right,del);
    	   }
    	   else {
    		   if(root.left==null)
    			   return root.right;
    		   else if(root.right==null)
    			   return root .left;
    		   
    		    root.data=min(root.right);
    		    root.right=delete(root.right,root.data);
    			   
    	   }
		return root;
     }
     
	private int min(Node right) {
		
		int min=root.data;
		while(root.left!=null) {
			min=root.left.data;
			root=root.left;
			
		}
 		return min;
	}

	public static void main(String[] args) {
		ImplementationBts ob=new ImplementationBts(50);  
		ob.insert(ob.root,20);
		ob.insert(ob.root,70);
		ob.insert(ob.root,10);
		ob.insert(ob.root,25);
		ob.insert(ob.root,60);
		ob.insert(ob.root,90);
		ob.insert(ob.root,80);
		ob.insert(ob.root,75);
		ob.inOrder(ob.root);
		try {
		if(ob.search(ob.root,20)!=null) {
			     System.out.println("\nvalue fouund");
		}
		 
		}catch(Exception e) {
			  System.out.println("\nSry Not found");
		}
		
		ob.delete(ob.root,90);
		ob.inOrder(ob.root);
	
	}

}
