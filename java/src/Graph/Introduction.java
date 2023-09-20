package Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Introduction {
	
  static class Graph{
		ArrayList<ArrayList<Integer>> adjlist=new ArrayList<>();
		
		public Graph(int v){
			for (int i = 0; i < v; i++) {
				  adjlist.add(new ArrayList<Integer>());
			}
			
		}
		
		public void addEdge(int u,int v) {
               adjlist.get(u).add(v);
               adjlist.get(v).add(u);
		}
 
		public void print() {
 			for (int i = 0; i <adjlist.size(); i++) {
				System.out.println("Adj list of vertex== "+i);
				for (int j = 0; j < adjlist.get(i).size(); j++) {
					System.out.print("  "+adjlist.get(i).get(j));
				}
				System.out.println();
			}
		}
		
		
		public void BFS(int v) {
			int V=adjlist.size();
			boolean visit[]=new boolean[V];
			visit[v]=true;
			
			Queue q=new LinkedList();
			q.add(v);
			
			while(q.size()!=0) {
				int vert=(int) q.remove();
				System.out.print(vert+"  ");
				for (int i = 0; i < adjlist.get(vert).size(); i++) {
					  int av=adjlist.get(vert).get(i);
					  if(!visit[av]) {
						  q.add(av);
						  visit[av]=true;
					  }
				}
				
			}
			
		}
		
		public void DFS(int v) {
			int V=adjlist.size();
			boolean visit[]=new boolean[V];
			twoDFS(v,visit);
		}

		private void twoDFS(int v, boolean[] visit) {
			 visit[v]=true;
			 System.out.print(v+"  ");
			 for (int i = 0; i <adjlist.get(v).size(); i++) {
				 int av=adjlist.get(v).get(i);
				 if(!visit[av])
					 twoDFS(av, visit);
			}
					 
			
		}
	}

	public static void main(String[] args) {
          
		Graph g=new Graph(5);
		g.addEdge(0,1);
		g.addEdge(2,3);
		g.addEdge(1,2);
		g.addEdge(3,4);
		g.addEdge(0,4);
		g.addEdge(1,4);
		g.print();
		System.out.println("Birth first search");
		g.BFS(0);
		System.out.println("\nDepth first  serach");
		g.DFS(0);
		
	}

}
