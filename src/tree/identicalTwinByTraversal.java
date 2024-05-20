package tree;

import java.util.ArrayList;

public class identicalTwinByTraversal {
    static class Node{
        int key;
        Node left, right;
        Node (int data){
            key=data;
            left=right=null;
        }
    }
    // check if tree is identical
    Node root1, root2;
    static boolean identical(Node root1, Node root2){
        ArrayList<Integer> res1=new ArrayList<>();
        ArrayList<Integer> res2=new ArrayList<>();

        //inorder traversal
        inorder(root1,res1);
        inorder(root2,res2);
        if (!res1.equals(res2))
            return false;

        //clear previous results for arraylist
        res1.clear();
        res2.clear();

        //preorder traversal
        preorder(root1,res1);
        preorder(root2,res2);
        if (!res1.equals(res2))
            return false;

        //clear previous results
        res1.clear();
        res2.clear();

        //postorder traversal
        postorder(root1,res1);
        postorder(root2,res2);
        if (!res1.equals(res2))
            return false;

        return true;
    }
    //inorder traversal
    static void inorder(Node root, ArrayList<Integer> sol){
        if (root==null)
            return;
        inorder(root.left, sol);
        sol.add(root.key);
        inorder(root.right, sol);
    }
    //preorder traversal
    static void preorder(Node root, ArrayList<Integer> sol){
        if (root==null)
            return;
        sol.add(root.key);
        preorder(root.left,sol);
        preorder(root.right,sol);
    }
    //postorder traversal
    static void postorder(Node root, ArrayList<Integer> sol){
        if (root==null)
            return;
        postorder(root.left, sol);
        postorder(root.right, sol);
        sol.add(root.key);
    }

    public static void main(String[] args) {
        identicalTwinByTraversal tree=new identicalTwinByTraversal();
        tree.root1=new Node(10);
        tree.root1.left=new Node(20);
        tree.root1.right=new Node(30);
        tree.root1.left.left=new Node(40);
        tree.root1.left.right=new Node(50);
        tree.root1.right.left=new Node(60);
        tree.root1.right.right=new Node(70);

        tree.root2=new Node(10);
        tree.root2.left=new Node(20);
        tree.root2.right=new Node(30);
        tree.root2.left.left=new Node(40);
        tree.root2.left.right=new Node(50);
        tree.root2.right.right=new Node(70);
        tree.root2.right.left=new Node(60);


        if (identical(tree.root1, tree.root2))
            System.out.println("Identical Twin");
        else
            System.out.println("Non Identical Twins");
    }
}
