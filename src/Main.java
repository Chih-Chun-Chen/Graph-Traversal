import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private List<Node> nodes;
    private Node starter;

    public Main() {
        nodes = new ArrayList<>();
        Scanner s = new Scanner(System.in);
        String nodeNames = s.nextLine();
        String[] names = nodeNames.split(" ");
        for (var name : names) {
            Node n = new Node(name);
            nodes.add(n);
        }
        String starterName = s.nextLine();
        starter = findNodeByName(starterName);
        while (true) {
            String a = s.next();
            if (a.equals("***")) {
                break;
            }
            Node n1 = findNodeByName(a);
            String b = s.next();
            Node n2 = findNodeByName(b);
            n1.addNeighbor(n2);
            n2.addNeighbor(n1);
        }
        for (Node n : nodes) {
            n.printNeighbors();
        }
    }

    private Node findNodeByName(String name) {
        for (Node n : nodes) {
            if (name.equals(n.name)) {
                return n;
            }
        }
        return null;
    }

    public static void main(String[] args) {

        //Print out all of node's neighbors
        Main main = new Main();

        System.out.println();

        //Print out Depth-First
        DepthFirst depthFirst = new DepthFirst(main.starter);
        depthFirst.doDepthFirst(main.starter);
        depthFirst.printOut();

        System.out.println();

        //Print out Breadth-First
        BreadthFirst breadthFirst = new BreadthFirst();
        breadthFirst.doBreadthFirst(main.starter);
        breadthFirst.printOut();

    }
}
