package tree;

public class usingRecursionBFS {
    static class Node{
        int key;
        Node left,right;
        Node(int data){
            key=data;
            left=right=null;
        }
    }
    Node root;

    int height(Node node){
        if (node==null)
            return 0;
        else {
            int leftHeight=height(node.left);
            int rightHeight=height(node.right);
            if (leftHeight>rightHeight){
                return leftHeight+1;
            }else
                return rightHeight+1;

        }
    }

    void printGivenLevel(Node node,int lev,boolean ltr){
        if (node == null){
            return;
        }if (lev==1){
            System.out.println(node.key);
        }else if (lev>1){
            if (ltr!=false){
                printGivenLevel(node.left,lev-1,ltr);
                printGivenLevel(node.right,lev-1,ltr);
            }else {
                printGivenLevel(node.right,lev-1,ltr);
                printGivenLevel(node.left,lev-1,ltr);
            }
        }
    }

    void printSpiral(Node node){
        int h=height(node);
        boolean ltr=false;
        for (int i=0;i<=h;i++){
            printGivenLevel(node,i,ltr);
            ltr=!ltr;
        }
    }

    public static void main(String[] args) {
        usingRecursionBFS bfs=new usingRecursionBFS();
        bfs.root=new Node(9);
        bfs.root.left=new Node(8);
        bfs.root.right=new Node(7);
        bfs.root.left.left=new Node(6);
        bfs.root.left.right=new Node(5);
        bfs.root.right.right=new Node(4);
        bfs.root.right.left=new Node(3);
        bfs.printSpiral(bfs.root);
    }
}
