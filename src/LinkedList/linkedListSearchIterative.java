package LinkedList;

public class linkedListSearchIterative {
    Node head;
    static class Node{
        int data;
        Node next;
        Node(int d){
            data=d;
            next=null;
        }
    }

    public void push(int data){
        Node node=new Node(data);
        node.next=head;
        head=node;
    }

    public boolean search(Node head,int x){
        Node cur=head;
        while (cur!=null){
            if (cur.data==x){
                return true;
            }
            cur=cur.next;
        }
        return false;
    }

    public static void main(String[] args) {
        linkedListSearchIterative lsi=new linkedListSearchIterative();
        int x=21;
        lsi.push(10);
        lsi.push(20);
        lsi.push(30);
        lsi.push(40);
        if (lsi.search(lsi.head,40)){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }
}
