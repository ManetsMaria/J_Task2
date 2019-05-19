public class Node {
    public Node next;
    public Node(Node next) {this.next = next;}

    // make easy to detect current node
    public int val;

    @Override
    public String toString() {
        return String.valueOf(val);
    }
}
