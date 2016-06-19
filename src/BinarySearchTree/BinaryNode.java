package BinarySearchTree;

import java.util.ArrayList;

/**
 * Created by nishant on 2016-06-18.
 */

class BinaryNode
{
    int value;
    BinaryNode leftChild;
    BinaryNode rightChild;
    int n;

    // Constructor
    public BinaryNode(int value, BinaryNode leftChild, BinaryNode rightChild) {
        this.value = value;
        this.leftChild = leftChild;
        this.rightChild = rightChild;
    }

    public Boolean insertValue(int value)
    {
        // Creating new binary node to be inserted
        BinaryNode node = new BinaryNode(value, null, null);

        // Left
        if(this.value > value)
        {
            this.leftChild = node;
            return true;
        }

        // Right
        else if(this.value > value)
        {
            this.rightChild = node;
            return true;
        }
        else
        {
            return false;
        }
    }
}
