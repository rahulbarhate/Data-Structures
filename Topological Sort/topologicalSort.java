import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

class Graph
{
	private int vertices;
	private LinkedList<Integer> adj[];
	
	Graph(int v)
	{
		vertices = v;
		adj = new LinkedList[vertices];
		for(int i=0; i<vertices; i++)
			adj[i] = new LinkedList();
	}
	
	void addEdge(int v, int w)
	{
		adj[v].add(w);
	}
	
	void topologicalSortUtil(int v, boolean visited[], Stack<Integer> stack)
	{
		visited[v] = true;
		Integer i;
		
		Iterator<Integer> it = adj[v].iterator();
		while(it.hasNext())
		{
			i = it.next();
			if(!visited[i])
				topologicalSortUtil(i, visited, stack);
		}
		
		stack.push(new Integer(v));
	}
	
	void topologicalSort()
	{
		Stack<Integer> stack = new Stack<Integer>();
		
		boolean visited[] = new boolean[vertices];
		for(int i=0; i<vertices; i++)
		{
			visited[i] = false;
		}
		
		for(int i=0; i<vertices; i++)
		{
			if(visited[i] == false)
			{
				topologicalSortUtil(i, visited, stack);
			}
		}
		
		while(stack.empty() == false)
		{
			System.out.println(stack.pop() + " ");
		}
	}

	public static void main(String[] args)
	{
		Graph g = new Graph(6);
		g.addEdge(5, 2);
		g.addEdge(5, 0);
		g.addEdge(4, 0);
		g.addEdge(4, 1);
		g.addEdge(2, 3);
		g.addEdge(3, 1);
		System.out.println("Following is the topological sort of the graph: ");
		g.topologicalSort();
	}

}
