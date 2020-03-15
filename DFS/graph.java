import java.util.Iterator;
import java.util.LinkedList;

public class graph
{

	private int V;
	private LinkedList<Integer> adj[];
	
	
	public graph(int v)
	{
		V = v;
		adj = new LinkedList[V];
		for(int i=0; i<V; i++)
		{
			adj[i] = new LinkedList<Integer>();
		}
	}
	
	void addEdge(int v, int w)
	{
		adj[v].add(w);
	}
	
	void DFSUtil(int v, boolean visited[])
	{
		visited[v] = true;
		System.out.println(v + "");
		
		Iterator<Integer> i = adj[v].listIterator();
		while(i.hasNext())
		{
			int n = i.next();
			if(!visited[n])
			{
				DFSUtil(n, visited);
			}
		}
		
	}
	
	void DFS(int v)
	{
		boolean visited[] = new boolean[V];
		DFSUtil(v, visited);
	}

	public static void main(String[] args)
	{
		graph g = new graph(4);
		
		g.addEdge(0,1);
		g.addEdge(0,2);
		g.addEdge(1,2);
		g.addEdge(2,0);
		g.addEdge(2,3);
		g.addEdge(3,3);
		
		g.DFS(2);

	}

}
