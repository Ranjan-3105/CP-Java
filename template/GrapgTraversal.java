import java.util.*;

public class GraphTraversal {

    static void bfs(int start, List<List<Integer>> adj, int n) {
        boolean[] visited = new boolean[n];
        Queue<Integer> q = new LinkedList<>();

        q.add(start);
        visited[start] = true;

        while (!q.isEmpty()) {
            int node = q.poll();

            for (int neighbor : adj.get(node)) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    q.add(neighbor);
                }
            }
        }
    }

    static void dfs(int node, List<List<Integer>> adj, boolean[] visited) {
        visited[node] = true;

        for (int neighbor : adj.get(node)) {
            if (!visited[neighbor])
                dfs(neighbor, adj, visited);
        }
    }
}