package stack;

import java.util.Stack;

public class stackUsingCollection {
    private static int n=6;
    static void push(Stack<Integer> s){
        for (int i=0; i<=n; i++){
            s.push(i);
        }
    }
    static void pop(Stack<Integer> s){
        System.out.println("Pop Operation:");
        for (int i=0; i<=n; i++){
            Integer x=(Integer) s.pop();
            System.out.println(x);
        }
    }
    static void peek(Stack<Integer> s){
        System.out.println("Peek Operation:");
            Integer x=(Integer) s.peek();
            System.out.println(x);

    }
    static void search(Stack<Integer> s, int x){
        System.out.println("Display Search:");
        Integer pos=(Integer) s.search(x);
        if (pos==-1){
            System.out.println("Element Not Found");
        }
        else {
            System.out.println("Element found at "+pos+"th position");
        }
    }

    public static void main(String[] args) {
        Stack<Integer> s=new Stack<Integer>();
        push(s);
        pop(s);
        push(s);
        peek(s);
        search(s, 7);
        search(s,2);
    }
}
