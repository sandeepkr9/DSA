package tree;

public class naiveMaxDepth {
    static class Node{
        int key;
        Node left, right;
        Node(int data){
            int key=data;
            left=right=null;
        }
    }

    Node root;
    int maxDepth(Node node){
        if (node == null)
            return 0;
        else {
            int leftDep=maxDepth(node.left);
            int rightDep=maxDepth(node.right);

            if (leftDep>rightDep)
                return leftDep+1;
            else
                return rightDep+1;
        }
    }

    public static void main(String[] args) {
        naiveMaxDepth tree=new naiveMaxDepth();
        tree.root=new Node(10);
        tree.root.left=new Node(20);
        tree.root.right=new Node(30);
        tree.root.right.left=new Node(40);
        tree.root.right.right=new Node(50);
        tree.root.left.left=new Node(60);
        tree.root.left.right=new Node(70);
        System.out.println(tree.maxDepth(tree.root));
    }
}
