package tree;

import java.util.LinkedList;
import java.util.Queue;

public class identicalTwinByLOT {
    static class Node{
        int key;
        Node left,right;
        Node(int data){
            key=data;
            left=right=null;
        }
    }

    static boolean identical(Node root1, Node root2){
        if (root1==null && root2==null)
            return true;
        if (root1==null || root2==null)
            return false;
        Queue<Node> queue1=new LinkedList<>();
        Queue<Node> queue2=new LinkedList<>();
        queue1.add(root1);
        queue2.add(root2);

        while (!queue1.isEmpty() && !queue2.isEmpty()){
            Node curr1=queue1.poll();
            Node curr2=queue2.poll();
            if (curr1.key!= curr2.key)
                return false;
            if (curr1.left!=null && curr2.left==null || curr1.left==null && curr2.left!=null)
                return false;
            if (curr1.right!=null && curr2.right==null || curr1.right==null && curr2.right!=null)
                return false;
            if (curr1.left!=null && curr2.left!=null){
                queue1.add(curr1.left);
                queue2.add(curr2.left);
            }
            if (curr1.right!=null && curr2.right!=null){
                queue1.add(curr1.right);
                queue2.add(curr2.right);
            }
        }
        return true;
    }

    public static void main(String[] args) {
//        identicalTwinByLOT tree=new identicalTwinByLOT();
        Node root1=new Node(10);
        root1.left=new Node(20);
        root1.right=new Node(30);
        root1.left.left=new Node(40);
        root1.left.right=new Node(50);
        root1.right.left=new Node(60);
        root1.right.right=new Node(70);

        Node root2=new Node(10);
        root2.left=new Node(20);
        root2.right=new Node(30);
        root2.left.left=new Node(40);
        root2.left.right=new Node(50);
        root2.right.left=new Node(60);
        root2.right.right=new Node(70);

        if (identical(root1,root2))
            System.out.println("Identical Tree");
        else
            System.out.println("Non Identical Tree");
    }
}
