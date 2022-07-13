package graph;

import java.util.List;

public class RunTraversal {
    public static void main(String[] args) {
        Node node6 = new Node(6);
        Node node5 = new Node(5);
        Node node4 = new Node(4);
        Node node3 = new Node(3, List.of(node5, node6));
        Node node2 = new Node(2);
        Node root = new Node(1, List.of(node3, node2, node4));

        System.out.println(TreePostorderTraversal.postorder(root));
    }
}
