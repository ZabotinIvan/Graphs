public class Vertex {
     private int label;
     private boolean visited;

    public Vertex(int label) {
        this.label = label;
        visited = false;
    }

    public int getLabel() {
        return this.label;
    }

    public boolean isVisited() {
        return this.visited;
    }

    public void setVisited(final boolean visited) {
        this.visited = visited;
    }
}

