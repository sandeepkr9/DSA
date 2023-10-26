package LinkedList;

public class linkedListMiddleNoOfNode {
    Node head;
    static class Node{
        int data;
        Node next;
        Node(int d){
            this.data=d;
            this.next=null;
        }
    }

     public void push(int data){
        Node node=new Node(data);
        node.next=head;
        head=node;
    }

    public void printNode(){
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.data+";");
            temp=temp.next;
        }
        System.out.println("Null");
    }

    public int getLen(){
        int length=0;
        Node temp=head;
        while(temp!=null){
            length++;
            temp=temp.next;
        }
        return length;
    }

    public void printMiddle(){
        if (head != null){
            int length=getLen();
            Node temp=head;
            int middleLength=length/2;
            while(middleLength!=0){
                temp=temp.next;
                middleLength--;
            }
            System.out.println(temp.data);
        }
    }

    public static void main(String[] args) {
        linkedListMiddleNoOfNode lmn=new linkedListMiddleNoOfNode();
        for (int i=5;i>=1;i--){
//            lmn.push(10);
//            lmn.push(20);
//            lmn.push(30);
//            lmn.push(40);
            lmn.push(i);
            lmn.printNode();
            lmn.printMiddle();
        }
    }
}
