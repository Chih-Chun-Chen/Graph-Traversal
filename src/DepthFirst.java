import java.util.ArrayList;
import java.util.List;

public class DepthFirst {
    List<Node> list;

    DepthFirst(Node firstNode) {
        list = new ArrayList<>();
        list.add(firstNode);
    }

    /**
     * Depth-First method
     * @param a
     */
    public void doDepthFirst(Node a) {
        for (Node neib : a.neighbors) {
            if (!list.contains(neib)) {
                list.add(neib);
                doDepthFirst(neib);
            }
        }
    }

    /**
     * To print out Depth-First elements
     */
    public void printList() {
        String result = "";
        for (Node each : list) {
            result += each.name;
        }
        System.out.println("Depth-First Search:");
        System.out.println(result);
    }
}
