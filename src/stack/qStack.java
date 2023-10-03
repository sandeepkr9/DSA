package stack;

import java.util.LinkedList;
import java.util.Queue;

public class qStack {
    Queue<Integer> q=new LinkedList<>();

    void push(int x){
        int s=q.size();
        q.add(x);
        for (int i=0;i<=s;i++){
            q.add(q.remove());
        }
    }

    void pop(){
        if (q.isEmpty()){
            return;
        }
        q.remove();
    }

    int size(){
        return q.size();
    }

    int peek(){
        if (q.isEmpty()){
            return -1;
        }
        return q.peek();
    }

    public static void main(String[] args) {
        qStack s=new qStack();
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println(s.peek());
        System.out.println(s.size());
        s.pop();
        System.out.println(s.peek());
        System.out.println(s.size());
    }
}
