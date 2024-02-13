package tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class revLevOrderTravUsingDeque {
    static class Node{
        int key;
        Node left,right;
        Node (int data){
            key=data;
            left=right=null;
        }
    }
    Node root;

    void printLevelOrderTraversal(Node node){
        Stack<Node> stack=new Stack<>();
        Queue<Node> queue=new LinkedList<>();
        queue.add(node);
        while (!queue.isEmpty()){
            node =queue.poll();
            stack.push(node);

            if (node.right!=null)
                queue.add(node.right);
            if (node.left!=null)
                queue.add(node.left);
        }
        while (!stack.empty()){
            System.out.print(stack.pop().key+" ");
        }
    }

    public static void main(String[] args) {
        revLevOrderTravUsingDeque rlo=new revLevOrderTravUsingDeque();
        rlo.root=new Node(1);
        rlo.root.left=new Node(2);
        rlo.root.right=new Node(3);
        rlo.root.left.left=new Node(4);
        rlo.root.left.right=new Node(5);
        rlo.root.right.left=new Node(6);
        rlo.root.right.right=new Node(7);
        rlo.printLevelOrderTraversal(rlo.root);
    }
}
