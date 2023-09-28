package stack;

import java.util.Stack;

public class basicStackUsingArray {
    static final int MAX=100;
    int top;
    int arr[]=new int[MAX];
    boolean isEmpty(){
        return (top<0);
    }
    basicStackUsingArray(){
        top=-1;
    }
    boolean push(int x){
        if (top>=(MAX-1)){
            System.out.println("Stack Overflow");
            return false;
        }else {
            arr[++top]=x;
            System.out.println(x);
            return true;
        }
    }
    int pop(){
        if (top>=0){
            int x=arr[top--];
            return x;
        }else {
            System.out.println("Stack Underflow");
            return -1;
        }
    }
    int peek(){
        if (top<0){
            System.out.println("Stack Underflow");
            return -1;
        }else{
            int x=arr[top];
            System.out.println(x);
            return x;
        }
    }
    void print(){
        for (int i=top;i>-1;i--){
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        basicStackUsingArray sa=new basicStackUsingArray();
        sa.push(10);
        sa.push(20);
        sa.push(30);
        sa.peek();
        System.out.println(sa.pop());
        sa.push(40);
        sa.peek();
        sa.print();
    }
}
