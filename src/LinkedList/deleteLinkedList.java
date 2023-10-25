package LinkedList;

public class deleteLinkedList {
    static class Node{
        int data;
        Node next;
    }

    static Node push(Node head, int d){
        Node node=new Node();
        node.data=d;
        node.next=head;
        head=node;
        return head;
    }

    static Node delete(Node head,int pos){
        Node temp=head;
        Node prev=head;
        for (int i=0;i<pos;i++){
            if (i==0 && pos==1){
                head=head.next;
            }else {
                if (i==pos-1 && temp != null)
                    prev.next=temp.next;
                else {
                    prev=temp;
                    if (prev==null)
                        break;
                    temp=temp.next;
                }
            }
        }
        return head;
    }

    static void printList(Node head){
        while (head !=null){
            if (head.next==null){
                System.out.println("["+head.data+"] ["+head+"] ->"+"(null)");
            }else{
                System.out.println("["+head.data+"] ["+head+"] ->"+head.next);
            }
            head=head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node li=new Node();
        li.next=null;
        li=push(li,10);
        li=push(li,20);
        li=push(li,30);
        li=push(li,40);
        printList(li);
        li=delete(li,2);
        printList(li);
    }
}
