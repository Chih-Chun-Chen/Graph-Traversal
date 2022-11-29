import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Node implements Comparable<Node>{

    public String name;
    public List<Node> neighbors;

    public Node(String n) {
        name = n;
        neighbors = new ArrayList<>();
    }

    /**
     * To add Node's neighbors to its list
     * @param other
     */
    public void addNeighbor(Node other) {
        neighbors.add(other);
    }

    /**
     * To print out Node's neighbor
     */
    public void printNeighbors() {
        Collections.sort(neighbors);
        String result = "";
        for (int i = 0; i < neighbors.size(); i++) {
            result += neighbors.get(i).name;
        }
        System.out.println(name + ": " + result);
    }

    /**
     * Override compareTo method
     * @param other the object to be compared.
     * @return int
     */
    @Override
    public int compareTo(Node other) {
        return name.compareTo(other.name);
    }
}
