package BinarySearchTree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by nishant on 2016-06-19.
 */
public class BFSTraversal {

    public void levelOrderNaiveApproach(BinaryNode root){
        int h = height(root);
        for(int i=1;i<=h;i++){
            printLevels(root,i);
            System.out.println("");
        }
    }
    public void printLevels(BinaryNode root, int h){
        if(root==null) return;
        if(h==1) System.out.print(" " + root.value);
        else{
            printLevels(root.leftChild,h-1);
            printLevels(root.leftChild,h-1);
        }
    }
    public int height(BinaryNode root){
        if (root==null) return 0;
        return 1 + Math.max(height(root.leftChild),height(root.rightChild));
    }

    public void levelOrderQueue(BinaryNode root){
        Queue q = new LinkedList();
        int levelNodes =0;
        if(root==null) return;
        q.add(root);
        while(!q.isEmpty()){
            levelNodes = q.size();
            while(levelNodes>0){
                BinaryNode n = (BinaryNode) q.remove();
                System.out.print(" " + n.value);
                if(n.leftChild!=null) q.add(n.leftChild);
                if(n.rightChild!=null) q.add(n.rightChild);
                levelNodes--;
            }
            System.out.println("");
        }
    }
}
