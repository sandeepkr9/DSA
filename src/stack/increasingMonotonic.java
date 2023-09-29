package stack;

import java.util.Arrays;
import java.util.Stack;

public class increasingMonotonic {
    static void stack(int arr[], int N){
        Stack<Integer> s=new Stack<>();
        for(int i=0; i<N; i++){
            while(s.size()>0 && s.peek()>arr[i]){
                s.pop();
            }
            s.push(arr[i]);
        }
        int N2=s.size();
        int ans[]=new int[N2];
        Arrays.fill(ans,0);
        int j=N2-1;

        while(!s.isEmpty()){
            ans[j]=s.peek();
            s.pop();
            j--;
        }

        System.out.println("The Array is:");
        for (int i=0; i<N; i++){
            System.out.println(arr[i]);
        }
        System.out.println();

        System.out.println("The Monotonic Increasing Array is:");
        for (int i=0; i<N2; i++){
            System.out.println(ans[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[]={5,3,7,2,6,1};
        int N= arr.length;
        stack(arr,N);
    }
}
