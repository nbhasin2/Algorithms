package Tree; /**
 * Created by nishant on 2016-06-18.
 */
import java.util.Iterator;

//http://www.quesucede.com/page/show/id/java-tree-implementation

public class Init {
    public static void main(String[] args) {

        Tree tree = new Tree();

        /*
         * The second parameter for the addNode method is the identifier
         * for the node's parent. In the case of the root node, either
         * null is provided or no second parameter is provided.
         */
        tree.addNode("Harry");
        tree.addNode("Jane", "Harry");
        tree.addNode("Bill", "Harry");
        tree.addNode("Joe", "Jane");
        tree.addNode("Diane", "Jane");
        tree.addNode("George", "Diane");
        tree.addNode("Mary", "Diane");
        tree.addNode("Jill", "George");
        tree.addNode("Carol", "Jill");
        tree.addNode("Grace", "Bill");
        tree.addNode("Mark", "Jane");

        tree.display("Harry");

        System.out.println("\n***** DEPTH-FIRST ITERATION *****");

        // Default traversal strategy is 'depth-first'
        Iterator<Node> depthIterator = tree.iterator("Harry");

        while (depthIterator.hasNext()) {
            Node node = depthIterator.next();
            System.out.println(node.getId());
        }

        System.out.println("\n***** BREADTH-FIRST ITERATION *****");

        Iterator<Node> breadthIterator = tree.iterator("Harry", Tree.TraversalStrategy.BFS);

        while (breadthIterator.hasNext()) {
            Node node = breadthIterator.next();
            System.out.println(node.getId());
        }
    }
}