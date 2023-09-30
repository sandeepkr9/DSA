package stack;

class twoStacks {
    int arr[];
    int size;
    int top1,top2;

    twoStacks(int n){
        size=n;
        arr=new int[n];
        top1=n/2+1;
        top2=n/2;
    }

    void push1(int x){
        if (top1>0){
            top1--;
            arr[top1]=x;
        }else {
            System.out.println("Stack Overflow");
            return;
        }
    }

    void push2(int x){
        if (top2<size-1){
            top2++;
            arr[top2]=x;
        }else {
            System.out.println("Stack Overflow");
            return;
        }
    }

    int pop1(){
        if (top1<=size/2){
            int x=arr[top1];
            top1++;
            return x;
        }
        else {
            System.out.println("Stack Underflow");
            System.exit(1);
        }
        return 0;
    }

    int pop2(){
        if (top2>=size/2+1){
            int x=arr[top2];
            top2--;
            return x;
        }
        else {
            System.out.println("Stack Underflow");
            System.exit(1);
        }
        return 0;
    }
}
class Main{
    public static void main(String[] args) {
        twoStacks ts=new twoStacks(6);
        ts.push1(10);
        ts.push2(20);
        ts.push1(30);
        ts.push2(40);
        ts.push1(50);
        ts.push2(60);
        System.out.println("popped element: "+ts.pop2());
        ts.push2(70);
        System.out.println("popped element: "+ts.pop1());
    }
}
