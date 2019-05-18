public class Task2 {
    public static void main(String...args){
        Node node = new Node(null);
        node.val = 6;
        Node node1 = new Node(node);
        node1.val = 5;
        Node node2 = new Node(node1);
        node2.val = 4;
        Node node3 = new Node(node2);
        node3.val = 3;
        Node node4 = new Node(node3);
        node4.val = 2;
        Node node5 = new Node(node4);
        node5.val = 1;
        node.next = node3;

        System.out.println(Finder.getCycleStart(node5));
    }
}

class Finder {
    public static Node getCycleStart(Node start) {
        if (start == null || start.next == null)
            return null;
        Node walker = start.next;
        Node runner = start.next.next;
        while (walker != runner && runner != null && walker != null){
            walker = walker.next;
            runner = runner.next;
            if (runner != null)
                runner = runner.next;
        }
        if (walker == null || runner == null)
            return null;
        Node again = start;
        while (again != walker){
            again = again.next;
            walker = walker.next;
        }
        return walker;
    }
}
