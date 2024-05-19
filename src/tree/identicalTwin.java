package tree;

public class identicalTwin {
    static class Node{
        int key;
        Node left,right;
        Node(int data){
            key=data;
            left=right=null;
        }
    }

    Node rootA,rootB;
    static boolean identical(Node a, Node b){
        if (a==null && b==null)
            return true;
        if (a!=null && b!=null){
            return (a.key==b.key && identical(a.left,b.left) && identical(a.right,b.right));
        }
        return false;
    }

    public static void main(String[] args) {
        identicalTwin tree=new identicalTwin();
        tree.rootA=new Node(10);
        tree.rootA.left=new Node(20);
        tree.rootA.right=new Node(30);
        tree.rootA.right.right=new Node(40);
        tree.rootA.right.left=new Node(50);
        tree.rootA.left.left=new Node(60);
        tree.rootA.left.right=new Node(70);

        tree.rootB=new Node(10);
        tree.rootB.left=new Node(20);
        tree.rootB.right=new Node(30);
        tree.rootB.right.right=new Node(40);
        tree.rootB.right.left=new Node(50);
        tree.rootB.left.left=new Node(60);
        tree.rootB.left.right=new Node(70);

        System.out.println(identical(tree.rootA, tree.rootB));
    }
}
