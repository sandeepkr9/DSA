package tree;

import java.util.LinkedList;
import java.util.Queue;

public class BFSusingQueue {
    static class Node{
        int key;
        Node left,right;
        Node (int data){
            key=data;
            left=right=null;
        }
    }

    Node root;

    void printLevelOrder(){
        Queue<Node> queue=new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            Node temp= queue.poll();
            System.out.print(temp.key+" ");

            if (temp.left!=null)
                queue.add(temp.left);

            if (temp.right!=null)
                queue.add(temp.right);
        }
    }

    public static void main(String[] args) {
        BFSusingQueue tree=new BFSusingQueue();
        tree.root=new Node(1);
        tree.root.left=new Node(2);
        tree.root.right=new Node(3);
        tree.root.left.right=new Node(4);
        tree.root.left.left=new Node(7);
        tree.root.right.left=new Node(5);
        tree.root.right.right=new Node(6);
        tree.printLevelOrder();
    }
}
