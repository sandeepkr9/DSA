package stack;

public class stackUsingLinkedList {
    Node root;
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public boolean isEmpty(){
        if (root==null){
            return true;
        }
        else{
            return false;
        }
    }
    public void push(int data){
        Node node=new Node(data);
        if (root==null){
            root=node;
        }else{
            Node temp=root;
            root=node;
            node.next=temp;
        }
        System.out.println(data);
    }
    public int pop(){
        int popped=Integer.MIN_VALUE;
        if (root==null){
            System.out.println("Stack Underflow");
        }else {
            popped= root.data;
            root=root.next;
        }
        return popped;
    }
    public int peek(){
        if (root==null){
            System.out.println("Stack Underflow");
            return Integer.MIN_VALUE;
        }else{
            return root.data;
        }
    }

    public static void main(String[] args) {
        stackUsingLinkedList sl=new stackUsingLinkedList();
        sl.push(10);
        sl.push(20);
        sl.push(30);
        System.out.println(sl.peek());
        sl.pop();
        System.out.println(sl.peek());
        sl.push(40);
        System.out.println(sl.peek());
        System.out.println(sl.isEmpty());
    }
}
