import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BreadthFirst {

    List<Node> list;
    Queue<Node> queue;
    String result = "";

    BreadthFirst() {
        list = new ArrayList<>();
        queue = new LinkedList<>();
    }

    public void doBreadthFirst(Node a) {
        list.add(a);
        queue.add(a);
        result += a.name + " ";
        while (!queue.isEmpty()) {
            Node node = queue.peek();
            for (Node element : node.neighbors) {
                if (!list.contains(element)) {
                    list.add(element);
                    queue.add(element);
                    result += element.name + " ";
                }
            }
            queue.remove();
        }
    }

    public void printOut() {
        System.out.println("Breadth-First Search: ");
        System.out.println(result);
    }
}
