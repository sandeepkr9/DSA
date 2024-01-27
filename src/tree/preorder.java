package tree;

public class preorder {
    static class Node{
        int key;
        Node left,right;
         public Node(int data){
             key=data;
             left=right=null;
         }
    }
    Node root;
    preorder(){
        root=null;
    }
    void printPreorder(Node node){
        if (node==null)
            return;
        System.out.print(node.key+" ");
        printPreorder(node.left);
        printPreorder(node.right);
    }

    public static void main(String[] args) {
        preorder tree=new preorder();
        tree.root=new Node(5);
        tree.root.left=new Node(4);
        tree.root.right=new Node(3);
        tree.root.left.left=new Node(2);
        tree.root.left.right=new Node(1);
        tree.root.right.left=new Node(7);
        tree.root.right.right=new Node(6);
        tree.printPreorder(tree.root);
    }
}
