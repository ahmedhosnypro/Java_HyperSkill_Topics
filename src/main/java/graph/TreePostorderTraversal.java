package graph;

import java.util.*;

public class TreePostorderTraversal {
    public static List<Integer> postorder(Node root) {
        List<Integer> list = new ArrayList<>();
        if (root == null) return list;

        Deque<Node> stack1 = new LinkedList<>();
        Deque<Node> stack2 = new LinkedList<>();
        stack1.add(root);

        while (!stack1.isEmpty()) {
            Node top = stack1.pop();
            stack2.push(top);
            for (int i = 0; i < top.children.size(); i++)
                stack1.push(top.children.get(i));
        }

        while (!stack2.isEmpty())
            list.add(stack2.pop().val);

        return list;
    }
}
