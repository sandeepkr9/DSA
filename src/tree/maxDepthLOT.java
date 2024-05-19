package tree;

import java.util.LinkedList;
import java.util.Queue;

public class maxDepthLOT {
    static class Node{
        int key;
        Node left, right;
        Node(int data){
            key=data;
            left=right=null;
        }
    }

    Node root;
    static int height(Node root){
    Queue<Node> queue=new LinkedList<Node>();
    queue.add(root);
    int height=0;
    while(!queue.isEmpty()) {
        int size = queue.size();
        for (int i = 0; i < size; i++) {
            Node temp = queue.poll();
            if (temp.left != null)
                queue.add(temp.left);
            if (temp.right != null)
                queue.add(temp.right);
        }
        height++;
    }
        return height;
    }


    public static void main(String[] args) {
        maxDepthLOT levOrder=new maxDepthLOT();
        levOrder.root=new Node(10);
        levOrder.root.left=new Node(20);
        levOrder.root.left.left=new Node(30);
        levOrder.root.left.right=new Node(40);
        levOrder.root.right=new Node(50);
        levOrder.root.right.right=new Node(60);
        levOrder.root.right.left=new Node(70);
        System.out.println(height(levOrder.root));
    }
}
