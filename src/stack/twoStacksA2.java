package stack;

public class twoStacksA2 {
    //this is Two Stack problem with Starting from endpoint Approach
    int size;
    int top1,top2;
    int arr[];

    twoStacksA2(int x){
        arr=new int[x];
        size=x;
        top1=-1;
        top2=size;
    }

    void push1(int n){
        if (top1<top2-1){
            top1++;
            arr[top1]=n;
        }else{
            System.out.println("Stack Overflow");
            System.exit(1);
        }
    }

    void push2(int n){
        if (top1<top2-1){
            top2--;
            arr[top1]=n;
        }
        else{
            System.out.println("Stack Overflow");
            System.exit(1);
        }
    }

    int pop1(){
        if (top1>=0){
            int n=arr[top1];
            top1--;
            return n;
        }else{
            System.out.println("Stack Underflow");
            System.exit(1);
        }
        return 0;
    }

    int pop2(){
        if (top2<size-1){
            int n=arr[top2];
            top2++;
            return n;
        }else{
            System.out.println("Stack Underflow");
            System.exit(1);
        }
        return 0;
    }

    public static void main(String[] args) {
        twoStacksA2 ts2=new twoStacksA2(6);
        ts2.push1(10);
        ts2.push2(20);
        ts2.push1(30);
        ts2.push2(40);
        ts2.push1(50);
        ts2.push2(60);
        System.out.println(ts2.pop1());
        ts2.push2(70);
        System.out.println(ts2.pop2());
    }
}
