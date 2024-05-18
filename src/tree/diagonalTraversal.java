package tree;

import java.util.Map;
import java.util.TreeMap;
import java.util.Vector;

public class diagonalTraversal {
    static class Node{
        int key;
        Node left,right;
        Node (int data){
            key=data;
            left=right=null;
        }
    }
    Node root;

    public static void printDiagonalUtil(Node root, int d, TreeMap<Integer, Vector<Integer>> printDiagonal){
        if (root==null)
            return;
        Vector<Integer> k=printDiagonal.get(d);
        if (k==null){
            k=new Vector<>();
        }else {
            k.add(root.key);
        }
        printDiagonal.put(d,k);
        printDiagonalUtil(root.left,d+1,printDiagonal);
        printDiagonalUtil(root.right,d,printDiagonal);
    }
    public static void printDiagonal(Node root){
        TreeMap<Integer,Vector<Integer>> printDiagonal=new TreeMap<>();
        printDiagonalUtil(root,0,printDiagonal);
        for (Map.Entry<Integer,Vector<Integer>> entry:printDiagonal.entrySet()){
            System.out.println(entry.getValue());
        }
    }

    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);
        printDiagonal(root);
    }
}
