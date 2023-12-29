package array;

public class firstElement {
    static int firstRepeat(int[] arr,int n){
        for (int i=0;i<n;i++){
            for (int j=i+1; j<n; j++){
                if (arr[i]==arr[j]){
                    return i;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr={1,4,6,2,3,7,5,3,2,2};
        int n=arr.length;
        int index=firstRepeat(arr,n);
        System.out.println(arr[index]);
    }
}
