package tree;

import java.util.Stack;

public class inorderStack {
    static class Node{
        int key;
        Node left,right;
        Node(int data){
            key=data;
            left=right=null;
        }
    }

    Node root;

    void inorder(){
        if (root==null)
            return;
        Stack<Node> s=new Stack<>();
        Node curr=root;
        while (curr!=null || s.size()>0){
            while (curr!=null){
                s.push(curr);
                curr=curr.left;
            }
            curr=s.pop();
            System.out.print(curr.key+" ");
            curr=curr.right;
        }
    }

    public static void main(String[] args) {
        inorderStack is=new inorderStack();
        is.root=new Node(9);
        is.root.left=new Node(8);
        is.root.right=new Node(7);
        is.root.left.left=new Node(6);
        is.root.left.right=new Node(5);
        is.root.right.right=new Node(4);
        is.root.right.left=new Node(3);
        is.inorder();
    }
}
