package tree;

import com.sun.source.tree.BreakTree;

public class postOrder {
    static class Node{
        int key;
        Node left,right;
         Node(int data){
            key=data;
            left=right=null;
        }
    }

    Node root;
    postOrder(){
        root=null;
    }

    void printPostOrder(Node node){
        if ( node==null)
            return;
        printPostOrder(node.left);
        printPostOrder(node.right);
        System.out.print(node.key+" ");
    }

    public static void main(String[] args) {
        postOrder tree=new postOrder();
        tree.root=new Node(9);
        tree.root.left=new Node(8);
        tree.root.right=new Node(7);
        tree.root.left.left=new Node(6);
        tree.root.left.right=new Node(5);
        tree.root.right.right=new Node(4);
        tree.root.right.left=new Node(3);
        tree.printPostOrder(tree.root);
    }
}
