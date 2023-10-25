package LinkedList;

public class deleteLinkedListPos {
    private static Node head;
    static class Node{
        int data;
        Node next;
        Node(int d){
            data=d;
            next=null;
        }
    }

    static void push(int data){
        Node node=new Node(data);
        node.next=head;
        head=node;
    }

    static void delete(int pos){
        if (head==null)
            return;
        Node temp=head;
        if (pos==0){
            head=temp.next;
            return;
        }
        for (int i=0; temp != null && i < pos-1; i++){
            temp=temp.next;
        }
        if (temp==null||temp.next==null)
            return;
        Node next=temp.next.next;
        temp.next=next;
    }

    static void printList(){
        Node node=head;
        while (node!=null){
            System.out.println(node.data);
            node=node.next;
        }
    }

    public static void main(String[] args) {
        deleteLinkedListPos dlp=new deleteLinkedListPos();
        dlp.push(10);
        dlp.push(20);
        dlp.push(30);
        dlp.push(40);
        dlp.printList();
        dlp.delete(2);
        dlp.printList();
    }
}
