package array;

public class firstRepeat {
    static int firstRepeat(int[] arr,int n){
        for (int i=0;i<n-1;i++){
            if (arr[i]==arr[i+1]){
                return arr[i];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr={1,4,2,4,5,7,3,1,1};
        int n=arr.length;
        int res=firstRepeat(arr,n);
        System.out.println(res);
    }
}
