import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BreadthFirst {

    List<Node> list;
    Queue<Node> queue;
    String result = "";

    BreadthFirst(Node firstNode) {
        list = new ArrayList<>();
        list.add(firstNode);
        queue = new LinkedList<>();
        queue.add(firstNode);
        result += firstNode.name;
    }

    public void doBreadthFirst(Node a) {
        while (!queue.isEmpty()) {
            for (Node element : a.neighbors) {
                if (!list.contains(element)) {
                    list.add(element);
                    queue.add(element);
                    result += element.name;
                }
            }
            Node firstElement = queue.remove();
            doBreadthFirst(firstElement);
        }
    }

    public void printOut() {
        System.out.println("Breadth-First Search: ");
        System.out.println(result);
    }
}
