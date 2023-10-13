package stack;

import java.util.Stack;

public class reverseStack {
    int size;
    int top;
    char[] a;

    reverseStack(int s){
        top=-1;
        size=s;
        a=new char[size];
    }

    boolean isEmpty(){
        return top<0;
    }

    boolean push(char s){
        if (top>=size){
            System.out.println("Stack Overflow");
            return false;
        }
        else {
            a[++top]=s;
            return true;
        }
    }

    int pop(){
        if (top<=-1){
            System.out.println("Stack Underflow");
            return 0;
        }
        else{
            char x=a[top--];
            return x;
        }
    }

    public static void reverse(StringBuffer sb){
        int n=sb.length();
        Stack stack=new Stack();
        for (int i=0; i<n; i++){
            stack.push(sb.charAt(i));
        }
        for (int i=0; i<n; i++){
            char ch= (char) stack.pop();
            sb.setCharAt(i,ch);
        }
    }

    public static void main(String[] args) {
        StringBuffer stringBuffer=new StringBuffer("Sandeep");
        reverse(stringBuffer);
        System.out.println(stringBuffer);
    }
}
