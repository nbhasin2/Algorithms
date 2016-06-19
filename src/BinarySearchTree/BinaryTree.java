package BinarySearchTree;

/**
 * Created by nishant on 2016-06-18.
 */
public class BinaryTree {

    BinaryNode root = null;


    // Start the tree with initial root value
    public BinaryTree(int value)
    {
        this.root =  new BinaryNode(value, null, null);
    }

    public Boolean add(int value)
    {
        if (root == null) {
            root = new BinaryNode(value, null, null);
            return true;
        } else {
            return insertNode(root, new BinaryNode(value, null, null)) != null ? true : false;
        }
    }

    private BinaryNode insertNode(BinaryNode currentParent, BinaryNode newNode) {

        if (currentParent == null) {
            return newNode;
        } else if (newNode.value > currentParent.value) {
            currentParent.rightChild = insertNode(currentParent.rightChild, newNode);
        } else if (newNode.value < currentParent.value) {
            currentParent.leftChild = insertNode(currentParent.leftChild, newNode);
        }

        return currentParent;
    }

    // Search

    public Boolean search(int value)
    {
        return search(this.root, value) != null ? true : false;
    }

    public BinaryNode search(BinaryNode root, int value)
    {
        if(root == null)
        {
            return null;
        }
        else
        {
            if(root.value == value)
            {
                return root;
            }
            else if(root.value > value)
            {
                return search(root.leftChild, value);
            }
            else if(root.value < value)
            {
                return search(root.rightChild, value);
            }
        }

        return null;
    }

}
