package BinarySearchTree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by nishant on 2016-06-19.
 */
public class DFSTraversal {

    public void preOrder(BinaryNode root)
    {
        if(root != null)
        {
            System.out.print(root.value + " ");
            preOrder(root.leftChild);
            preOrder(root.rightChild);
        }
    }

    public void inOrder(BinaryNode root)
    {
        if(root != null)
        {
            inOrder(root.leftChild);
            System.out.print(root.value + " ");
            inOrder(root.rightChild);
        }
    }
    public void postOrder(BinaryNode root)
    {
        if(root != null)
        {
            postOrder(root.leftChild);
            postOrder(root.rightChild);
            System.out.print(root.value + " ");
        }
    }

    int maxDepth(BinaryNode node) {
        if (node == null) {
            return 0;
        } else {

            /* compute the depth of each subtree */
            int lDepth = maxDepth(node.leftChild);
            int rDepth = maxDepth(node.rightChild);

            /* use the larger one */
            if (lDepth > rDepth) {
                return (lDepth + 1);
            } else {
                return (rDepth + 1);
            }
        }
    }

}
