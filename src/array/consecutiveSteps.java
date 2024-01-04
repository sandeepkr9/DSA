package array;

public class consecutiveSteps {
    static int consecutive(int[] arr,int len){
        int count=0;
        int max=0;
        for (int i=1;i<len;i++){
            if (arr[i]>arr[i-1])
                count++;
            else{
                max=Math.max(max,count);
                count=0;
            }
        }
        return Math.max(max,count);
    }

    public static void main(String[] args) {
        int[] arr={1,4,7,3,0,9,12,34};
        int n= arr.length;
        System.out.println(consecutive(arr,n));
    }
}
