import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

public class GraphExample {

    public static void addEdge(ArrayList<ArrayList<Integer>>adjList, int source, int dest) {
        adjList.get(source).add(dest);
        adjList.get(dest).add(source);
    }

    public static void printGraph(ArrayList<ArrayList<Integer>>adjList, int v) {
        for(int i=1;i<=v;i++) {
            System.out.println(i+" -> "+adjList.get(i));
        }
    }

    public static boolean bfs(ArrayList<ArrayList<Integer>>adjList, int src, int dest, int v, int[] distance) {
        Queue<Integer> queue = new ArrayDeque<>();
        boolean[] visited = new boolean[v+1];
        distance[src]=0;
        queue.add(src);
        while(!queue.isEmpty()) {
            int cur = queue.remove();
            for(int i=0; i<adjList.get(cur).size();i++) {
                int neighbour = adjList.get(cur).get(i);
                if(!visited[neighbour]) {
                    visited[neighbour] = true;
                    queue.add(neighbour);
                    distance[neighbour]=distance[cur]+1;
                }

                if(neighbour == dest) return true;
            }
        }
        return false;
    }

    public static boolean dfs(ArrayList<ArrayList<Integer>> adjList, int src, int dest, boolean[] visited, int[] distance) {
        visited[src] = true;
        for(int i=1;i<adjList.get(src).size();i++) {
            int neighbour = adjList.get(src).get(i);
            if(!visited[neighbour]) {
                visited[neighbour] = true;
                distance[neighbour] = distance[src] + 1;
                if(neighbour == dest) return true;
                return dfs(adjList,neighbour,dest,visited,distance);
            }
        }
        return false;
    }

    public static boolean cycleDetect(ArrayList<ArrayList<Integer>> adjList, int src, boolean[] visited, int parent) {
        visited[src] = true;
        for (int i = 0; i < adjList.get(src).size(); i++) {
            int neighbour = adjList.get(src).get(i);

            if (!visited[neighbour]) {
                return cycleDetect(adjList, neighbour, visited,src);
            } else if (neighbour != parent) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();
        int v = 6;
//        int e = 10;

        for(int i=0; i<=v; i++) {
            adjList.add(new ArrayList<Integer>());
        }

        // Adding sample edges
        addEdge(adjList, 1, 2);
        addEdge(adjList, 1, 3);
        addEdge(adjList, 2, 4);
        addEdge(adjList, 2, 5);
        addEdge(adjList, 5, 6);
//        addEdge(adjList, 4, 6);

//         Print the graph
//        printGraph(adjList, v);
        boolean[] visited = new boolean[v+1];
        int dest = 6;
        int[] distance = new int[v+1];
        distance[dest] = 0;
        boolean found = cycleDetect(adjList,1,visited,-1);
        System.out.println(found);
//        for (int element : distance) {
//            System.out.print(element + " ");
//        }
    }
}
