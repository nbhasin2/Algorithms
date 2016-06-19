package BinarySearchTree;

/**
 * Created by nishant on 2016-06-18.
 */
public class App
{
    public static void main (String[] args) throws java.lang.Exception
    {
        BinaryNode root = new BinaryNode(5, null, null);
        root.leftChild = new BinaryNode(10,null, null);
        root.rightChild = new BinaryNode(15,null, null);
        root.leftChild.leftChild = new BinaryNode(20,null, null);
        root.leftChild.rightChild = new BinaryNode(25,null, null);
        root.rightChild.leftChild = new BinaryNode(30,null, null);
        root.rightChild.rightChild = new BinaryNode(35,null, null);

        System.out.println("BFS");

        BFSTraversal i  = new BFSTraversal();
        System.out.println("Output by Naive Approach : ");
        i.levelOrderNaiveApproach(root);
        System.out.println("Output by Better Approach : ");
        i.levelOrderQueue(root);

        System.out.println("\nDFS");

        DFSTraversal traversal = new DFSTraversal();
        System.out.println("preOrder");
        traversal.preOrder(root);
        System.out.println("\ninOrder");
        traversal.inOrder(root);
        System.out.println("\npostOrder");
        traversal.postOrder(root);
        System.out.println("\nHeight - "+traversal.maxDepth(root));


    }
}
