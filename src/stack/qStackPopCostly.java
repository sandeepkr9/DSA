package stack;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class qStackPopCostly {
    Queue<Integer> q1=new LinkedList<>();
    Queue<Integer> q2=new LinkedList<>();

    void push(int x){
        q1.add(x);
    }

    void pop(){
        if (q1.isEmpty()){
            return;
        }
        while (q1.size()!=1){
            q2.add(q1.peek());
            q1.remove();
        }
        q1.remove();
        Queue<Integer> q=q1;
        q1=q2;
        q2=q;
    }

    int peek(){
        if (q1.isEmpty()){
            return -1;
        }
        while (q1.size()!=1){
            q2.add(q1.peek());
            q1.remove();
        }
        int temp=q1.peek();
        q1.remove();
        q2.add(temp);
        Queue<Integer> q=q1;
        q1=q2;
        q2=q;
        return temp;
    }

    int size(){
        return q1.size();
    }

    public static void main(String[] args) {
        qStackPopCostly qs=new qStackPopCostly();
        qs.push(10);
        qs.push(20);
        qs.push(30);
        System.out.println(qs.peek());
        System.out.println(qs.size());
        qs.pop();
        System.out.println(qs.peek());
        System.out.println(qs.size());
    }
}
