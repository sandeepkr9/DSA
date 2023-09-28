package stack;

import static java.lang.System.exit;

public class stackUsingSinglyLinkedList {
    Node top;
    static class Node{
        int data;
        Node link;
    }
    stackUsingSinglyLinkedList(){
        this.top=null;
    }
    public boolean isEmpty(){
        return top==null;
    }
    public void push(int x){
        Node temp=new Node();
        if (temp==null){
            System.out.println("Stack Overflow");
            return;
        }
        temp.data=x;
        temp.link=top;
        top=temp;
    }
    public void pop(){
        if (top==null){
            System.out.println("Stack Underflow");
            return;
        }
        top=top.link;
    }
    public int peek(){
        if (!isEmpty()){
            return top.data;
        }
        else {
            System.out.println("Stack Underflow");
            return -1;
        }
    }
    public void display(){
        if (top==null){
            System.out.println("Stack Underflow");
            exit(1);
        }
        else {
            Node temp=top;
            while(temp!=null){
                System.out.println(temp.data);
                temp=temp.link;
                if (temp==null){
                    System.out.println("--");
                }
            }
        }
    }

    public static void main(String[] args) {
        stackUsingSinglyLinkedList ssl=new stackUsingSinglyLinkedList();
        ssl.push(10);
        ssl.push(20);
        ssl.push(30);
        System.out.println(ssl.peek());
        ssl.pop();
        System.out.println(ssl.peek());
        ssl.push(40);
        System.out.println(ssl.peek());
        ssl.display();
    }
}
