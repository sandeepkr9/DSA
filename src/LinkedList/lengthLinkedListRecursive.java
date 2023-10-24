package LinkedList;

public class lengthLinkedListRecursive {
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

    static int getCountRec(Node node){
        if (node==null)
            return 0;
        return 1+getCountRec(node.next);
    }

    static int getCount(){
        return getCountRec(head);
    }

    public static void main(String[] args) {
        lengthLinkedListRecursive llr=new lengthLinkedListRecursive();
        llr.push(10);
        llr.push(20);
        llr.push(30);
        llr.push(40);
        System.out.println(llr.getCount());
    }
}
