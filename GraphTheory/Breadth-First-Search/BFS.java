package GraphTheory;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class BreadthFirstSearch {

	public void bfs(int[][] adjmatrix, int n) {

		// visited flag for each nodes, set to 0 (not visited) by default.
		int visited[] = new int[n];
		for (int i = 0; i < visited.length; i++) {
			visited[i] = 0;
		}

		// BFS uses stack to maintain its search pattern.
		Queue<Integer> queue = new LinkedList<Integer>();

		// Add the first element(source node mentioned otherwise) to the stack.
		queue.add(0);

		// Update the first node as visited.
		visited[0] = 1;

		// Pop the first node and print it.
		// Node holds the value of last popped node, for checking its adjacent node.
		int node = (int) queue.remove();
		System.out.println(node);

		while (true) {
			
			// Check from the previously popped node, to find out which is the node adjacent to it,
			// It should not be visited previously, add all the adjacent nodes to "node".
			// Update all new nodes as visited.
			for (int i = 0; i < n; i++) {
				if (adjmatrix[node][i] == 1 && visited[i] != 1) {
					visited[i] = 1;
					queue.add(i);
				}
			}
			
			// Continue this infinite loop until the stack is empty.
			if (queue.isEmpty()) {
				break;
			
			// Once when no more neighburing nodes are present, this block is executed pop the last value only.
			// Again next for loop block will be executed.	
			} else {
				node = (int) queue.remove();
				System.out.println(node);
			}
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number of nodes");
		int n = sc.nextInt(); // Number of nodes
		
		/* n = 4
		 * 
		 * 0 1 1 0
		 * 0 0 1 0
		 * 1 0 0 1
		 * 0 0 0 1
		 * 
<<<<<<< HEAD
		 * Output = 0 1 2 3
=======
		 * Output = 0 1 2 3 
>>>>>>> daff0ee6c58d035544d0dddb6ffd92808e5886ae
		 * 
		 */
		
		System.out.println("Enter the adjacency matrix");
		int adjMatrix[][] = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				adjMatrix[i][j] = sc.nextInt();
			}
		}

		BreadthFirstSearch obj = new BreadthFirstSearch();
		obj.bfs(adjMatrix, n);

	}
}
