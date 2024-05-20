package tree;

public class identicalTwinByMT {
    static class Node{
        int key;
        Node left,right;
        Node(int data){
            key=data;
            left=right=null;
        }
    }
    static boolean identical(Node root1,Node root2){
        if (root1==null && root2==null)
            return true;
        if (root1==null || root2==null)
            return false;

        while (root1!=null && root2!=null){
            if (root1.key!= root2.key)
                return false;
            if (root1.left==null){
                root1=root1.right;
            }else {
                Node pre=root1.left;
                while (pre.right!=null && pre.right!=root1)
                    pre=pre.right;
                if (pre.right==null){
                    pre.right=root1;
                    root1=root1.left;
                }else {
                    pre.right=null;
                    root1=root1.right;
                }
            }
            if (root2.left==null){
                root2=root2.right;
            }else {
                Node pre=root2.left;
                while (pre.right!=null && pre.right!=root2)
                    pre=pre.right;
                if (pre.right==null){
                    pre.right=root2;
                    root2=root2.left;
                }else {
                    pre.right=null;
                    root2=root2.right;
                }
            }
        }
        return (root1==null && root2==null);
    }

    public static void main(String[] args) {
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
            System.out.println("Identical Twins");
        else
            System.out.println("Non Identical Twins");
    }
}
