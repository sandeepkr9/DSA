package array;

import java.util.Arrays;

public class countPair {
    static int powerMultiple(int[] arr,int n,int k){
        int ans=0;
        Arrays.sort(arr);
        for (int i=0;i<n;i++){
            for (int j=0;j<i+1;j++){
                int x=0;
                while(arr[i]*Math.pow(k,x)<=arr[j]){
                    if (arr[i]*Math.pow(k,x)==arr[j]){
                        ans++;
                        break;
                    }
                    x++;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr={1,4,7,2,6,8,12};
        int n=arr.length;
        int k=3;
        System.out.println(powerMultiple(arr,n,k));
    }
}
