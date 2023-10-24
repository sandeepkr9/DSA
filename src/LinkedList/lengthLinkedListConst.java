package LinkedList;

public class lengthLinkedListConst {
    static Node head;
    static class Node{
        int data;
        Node next;
        Node(int d){
            data=d;
            next=null;
        }
    }

    static void push(int x){
        Node node=new Node(x);
        node.next=head;
        head=node;
    }

    static int getCountRec(Node node, int count){
        if (node==null)
            return count;
        return getCountRec(node.next,1+count);
    }

    static int getCount(){
        return getCountRec(head, 0);
    }

    public static void main(String[] args) {
        lengthLinkedListConst llc=new lengthLinkedListConst();
        llc.push(10);
        llc.push(20);
        llc.push(30);
        llc.push(40);
        System.out.println(llc.getCount());
    }
}
