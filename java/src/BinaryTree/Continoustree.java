package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Continoustree {
	Node root;
	class Node{
		Node next;
		int data;
		Node left,right;
		Node(int data){
			this.data=data;
			left=right=null;
		}
	}
	
	Continoustree(int data){
		root=new Node(data);
	}
	
	void insert(int data) {
		  inserts(root,data);
	}

	private Node inserts(Node root, int data) {
		
		if(root==null)
			 return new Node(data);
		
		if(root.data<data)
			    root.right=inserts(root.right,data);
		else root.left=inserts(root.left,data);
		 
		return root;
	}
	
	boolean isContinuous(Node root) {
		//System.out.println(root.data);
		 if(root==null)
			 return true;
		 
		 if(root.left==null && root.right==null)
			 return true;
		 
		 if(root.left==null) {
			 int  sum=Math.abs(root.data-root.right.data);
			 
			 return(sum==1 && isContinuous(root.right));
		 }
		 
		 if(root.right==null) {
			 int  sum=Math.abs(root.data-root.left.data);
			 
			 return(sum==1 && isContinuous(root.left));
		 }
		 
		    int left=Math.abs(root.data-root.left.data);
		    int right=Math.abs(root.data-root.right.data);
		    boolean lef=isContinuous(root.left);
		    boolean rig=isContinuous(root.right);
	          
		    return (left==1 && right==1  && lef && rig);
		
	}
	
	int maxElement(Node root) {
		int max=root.data;
		while(root.right!=null) {
			max=root.right.data;
			root=root.right;
		}
		
		return max;
		
	}
	 
	boolean isfullBinaryTree(Node root) {
		
		if(root==null) {
			return true;
		}
		
		if(root.left==null && root.right==null)
			return true;
		
		 if(root.left==null && root.right!=null)
				 return false;
		  if(root.left!=null && root.right==null)
			 return false;
		
		boolean res=(isfullBinaryTree(root.left)) && (isfullBinaryTree(root.right));
					 
			 	 
		return res;
		  
		 
	}
	
	  int countNodes(Node root) {
		   
		  if(root ==null)
			  return 0;
		  
		  int left=countNodes(root.left);
		  int right=countNodes(root.right);
		  
		  
		  return 1+left+right;
	  }
	  
	   
	boolean isBST(Node root) {
		  Node prevNode=null;
		  if (root != null) {
				if (!isBST(root.left))
					return false;
				if (prevNode != null && prevNode.data >= root.data) 
					return false;
				 
				prevNode = root;
				return isBST(root.right);
			}
			return true;
		}
	  
	    void BFS(Node root) {
	    	Queue q = new LinkedList<Node>();
			if (root == null)
				return;
			q.add(root);
			while (!q.isEmpty()) {
				Node n = (Node) q.remove();
				System.out.print( n.data+" ");
				if (n.left != null)
					q.add(n.left);
				if (n.right != null)
					q.add(n.right);
			}
	    }
	    
	    void DFS(Node root) {
	    	Stack s=new Stack();
	    	s.push(root);
	    	while(!s.isEmpty()) {
	    		Node x=(Node) s.pop();
	    		System.out.print(x.data+" ");
	    		if(x.right!=null)
	    			 s.push(x.right);
	    		if(x.left!=null)
	    			s.push(x.left);
	    	}
	    	
	    }
	    
	    boolean checkBalanced(Node root) {
	    	
	    	 int rghcount=1;
	    	 while(root.right!=null) {
	    		 rghcount++;
	    		 root=root.right; 
	    	 }
	    	 int  lefcount=1;
	    	 while(root.left!=null) {
	    		 lefcount++;
	    		 root=root.left; 
	    	 }
	    	 
	    	 if(lefcount!=rghcount) return false;
	    	 
	    	 return true;
	    	
	    }
	  
	void inOrder(Node root) {
		if(root!=null) {
			
			inOrder(root.left);
			System.out.print(root.data+"  ");
			inOrder(root.right);
			
		}
	}

	public static void main(String[] args) {
		Continoustree ob=new Continoustree(10);
		ob.insert(2);
		ob.insert(30);
		ob.insert(5);
		ob.insert(15);
		ob.insert(17);
	//	ob.insert(35);
		
	 
		 ob.inOrder(ob.root);
		 
//		if(ob.isContinuous(ob.root)) 
//			System.out.println("yes");
//	 	else System.out.println("No");
		
	    // System.out.println("Maximum node in tree=="+ob.maxElement(ob.root));
	    
	    // System.out.println("Tree is full tree=="+ob.isfullBinaryTree(ob.root));
	     
	    // System.out.println("How many Nodes in tree=="+ob.countNodes(ob.root));
	     
	    //  System.out.println("Tree is BST or Not=="+ob.isBST(ob.root));
		
		System.out.println("\nBirth First Serach");
		ob.BFS(ob.root);
		
		System.out.println("\nDepth First search");
		ob.DFS(ob.root);
		
		System.out.println("\nTree is Balanced=="+ob.checkBalanced(ob.root));
		 
	
		 

	}

}
