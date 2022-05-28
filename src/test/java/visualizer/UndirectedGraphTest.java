package visualizer;

import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.hyperskill.hstest.stage.SwingTest.getAllComponents;

class UndirectedGraphTest {
    @Test
    void testAddition() {
        MainFrame frame = new MainFrame();
        UndirectedGraph graph = new UndirectedGraph(frame, null, "test");

        Vertex a = new Vertex(frame, 100, 100, 'a');
        Vertex b = new Vertex(frame, 200, 200, 'b');
        graph.add(a);
        graph.add(b);

        graph.addNewEdge(new UndirectedEdge(a, b, 1));

        getAllComponents(graph).stream().map(Component::getName).forEach(System.out::println);
    }
}