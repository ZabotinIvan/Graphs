import java.util.*;

public class Graph {
    int V;
    List<Integer>[] verticesInfo;
    boolean[] mark;

    Graph(int V) {
        verticesInfo = new List[V];
        mark = new boolean[V];
        this.V = V;


    }
    void vertices (int v){
        for (int i = 0; i < v; i++)
            verticesInfo[i] = new LinkedList<>();
    }

    void addEdge(int a, int b) {
        verticesInfo[a].add(b);
        verticesInfo[b].add(a);
    }
    int size() {
        return V;
    }

    int dfs(int V) {
        mark[V] = true;
        int size = 1;
        Iterator<Integer> integers = verticesInfo[V].listIterator();
        while (integers.hasNext()){
            int vv = integers.next();
            if (!mark[vv]) {
                size += dfs(vv);
            }
        }
        return size;
    }
    void calcPaths(Graph graph){
        List<Integer> answer = new ArrayList<>();
        for (int i = 0 ; i < V ; i++){
           answer.add(i,dfs(i));
        }
         System.out.println("Сколько достижимо городов для каждого города: " + answer);
    }
}
