public class Node {
    int data;
    Node next; // self-referential

    // empty constructor for empty Node
    public Node() {}

    // constructor for initializing a node
    public Node(int d) {
        this.data = d;
    }

    public String toString() {
        return this.data + "";
    }
}
