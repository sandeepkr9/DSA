package tree;

public class Inorder {
    static class Node{
        int data;
        Node left,right;

        public Node(int item){
            this.data=item;
            left=right=null;
        }
    }
    Node root;
    Inorder(){
        root=null;
        }
        void printInorder(Node node){
        if (node==null){
            return;
        }
        printInorder(node.left);
            System.out.println(node.data+" ");
            printInorder(node.right);
    }

    public static void main(String[] args) {
        Inorder tree=new Inorder();
        tree.root=new Node(1);
        tree.root.left=new Node(2);
        tree.root.right=new Node(3);
        tree.root.left.left=new Node(4);
        tree.root.right.right=new Node(5);

        tree.printInorder(tree.root);
    }
}
