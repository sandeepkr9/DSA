package LinkedList;

public class reversedLinkedList {
    Node head;
    static class Node{
        int data;
        Node next;
        Node(int d){
            data=d;
            next=null;
        }
    }

    Node reverse(Node node){
        Node prev=null;
        Node next=null;
        Node curr=node;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        node = prev;
        return node;
    }

    void printList(Node node){
        while (node!=null){
            System.out.println(node.data);
            node=node.next;
        }
    }

    public static void main(String[] args) {
        reversedLinkedList rl=new reversedLinkedList();
        rl.head=new Node(20);
        rl.head.next=new Node(67);
        rl.head.next.next=new Node(39);
        rl.head.next.next.next=new Node(13);
        rl.printList(rl.head);
        System.out.println();
        rl.head=rl.reverse(rl.head);
        rl.printList(rl.head);
    }
}
