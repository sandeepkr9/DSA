package tree;

import java.util.ArrayList;
import java.util.Stack;

public class InorderIterative {
    static class Node{
        int key;
        Node left,right;
        Node(int data){
            key=data;
            left=right=null;
        }
    }

    static ArrayList<Integer> inorderIterative(Node curr){
        ArrayList<Integer> inorder=new ArrayList<>();
        Stack<Node> stack=new Stack<>();
        while (true){
            if (curr!=null){
                stack.push(curr);
                curr=curr.left;
            }else {
                if (stack.isEmpty())
                    break;
                curr=stack.peek();
                inorder.add(curr.key);
                stack.pop();
                curr=curr.right;
            }
        }
        return inorder;
    }

    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.right=new Node(6);
        root.right.left=new Node(7);
        ArrayList<Integer> inorder;
        inorder=inorderIterative(root);
        for (int i=0; i<inorder.size(); i++){
            System.out.print(inorder.get(i)+" ");
        }
    }
}