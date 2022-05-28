package visualizer;

import javax.swing.*;

public class UndirectedEdgeCreator {
    private static Vertex fstNode = null;

    private UndirectedEdgeCreator() {
    }

    static void createUndirectedEdge(Vertex vertex) {
        if (fstNode == null) {
            fstNode = vertex;
        } else if (fstNode != vertex) {
            var undirectedEdges = vertex.getMainFrame().getGraph().getEdges();
            if (!isDuplicateEdge(undirectedEdges, vertex)) {
                int weight = getWeight(vertex.getMainFrame().getGraph());
                vertex.getMainFrame().getGraph()
                        .addNewEdge(new UndirectedEdge(fstNode, vertex, weight));
                vertex.getMainFrame().getGraph()
                        .addNewEdge(new UndirectedEdge(vertex, fstNode, weight));
                vertex.connectVertex(fstNode);
                fstNode = null;
            }
        }
    }

    private static int getWeight(UndirectedGraph graph) {
        String input = JOptionPane.showInputDialog(graph, "Enter the Vertex Id (should be 1 char", "Vertex", JOptionPane.QUESTION_MESSAGE);
        if (isValidWeight(input)) {
            return Integer.parseInt(input);
        }
        return getWeight(graph);
    }


    private static boolean isValidWeight(String input) {
        try {
            Integer.parseInt(input);
            return true;
        } catch (IllegalArgumentException e) {
            return false;
        }
    }

    private static boolean isDuplicateEdge(java.util.Set<UndirectedEdge> edges, Vertex sndNode) {
        return edges.stream()
                .anyMatch(edge -> edge.getNodes()[0] == fstNode && edge.getNodes()[1] == sndNode);
    }

    public static void reset() {
        fstNode = null;
    }
}
