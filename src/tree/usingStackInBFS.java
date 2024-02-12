package tree;

import java.util.Stack;

public class usingStackInBFS {
    static class Node{
        int key;
        Node left,right;
        Node(int data){
            key=data;
            left=right=null;
        }
    }

    Node root;

    void printSpiral(Node node){
        if (node==null){
            return;
        }
        Stack<Node> stack1=new Stack<>();
        Stack<Node> stack2=new Stack<>();
        stack1.push(root);
        while (!stack1.isEmpty() || !stack2.isEmpty()){
            while (!stack1.empty()){
                Node temp=stack1.peek();
                stack1.pop();
                System.out.print(temp.key+" ");
                if (temp.right!=null)
                    stack2.push(temp.right);
                if (temp.left!=null)
                    stack2.push(temp.left);
            }
            while (!stack2.empty()){
                Node temp=stack2.peek();
                stack2.pop();
                System.out.print(temp.key+" ");

                if (temp.left!=null)
                    stack1.push(temp.left);
                if (temp.right!=null)
                    stack1.push(temp.right);
            }
        }
    }

    public static void main(String[] args) {
        usingStackInBFS stackInBFS=new usingStackInBFS();
        stackInBFS.root=new Node(1);
        stackInBFS.root.left=new Node(2);
        stackInBFS.root.right=new Node(3);
        stackInBFS.root.left.left=new Node(4);
        stackInBFS.root.left.right=new Node(5);
        stackInBFS.root.right.left=new Node(6);
        stackInBFS.root.right.right=new Node(7);
        stackInBFS.printSpiral(stackInBFS.root);
    }
}
