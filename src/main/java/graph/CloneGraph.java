package graph;

import java.util.HashMap;
import java.util.Map;

public class CloneGraph {
    public Node cloneGraph(Node node) {
        if (node == null) return null;
        if (node.neighbors.isEmpty()) return new Node(node.val);

        Map<Node, Node> map = new HashMap<>();

        map.put(node, new Node(node.val));
        dfs(node, map);

        return map.get(node);
    }

    private void dfs(Node node, Map<Node, Node> map) {
        for (Node neighbour : node.neighbors) {
            map.putIfAbsent(neighbour, new Node(neighbour.val));
            map.get(node).neighbors.add(map.get(neighbour));
        }
        for (Node neighbour : node.neighbors) {
            if (map.get(neighbour).neighbors.size() == 0) {
                dfs(neighbour, map);
            }
        }
    }
}
