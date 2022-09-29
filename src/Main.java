

public class Main {
    public static void main(String[] args) {
        Graph graph = new Graph(6);
        graph.vertices(graph.size());

        graph.addEdge(0, 1);
        graph.addEdge(1, 2);
        graph.addEdge(3, 4);
        graph.calcPaths(graph);


    }

}
