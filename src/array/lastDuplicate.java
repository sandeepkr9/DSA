package array;

public class lastDuplicate {
    static void lastIndex(int arr[], int n){
        if (arr==null||n<=0){
            return;
        }
        for (int i=n-1; i>0; i--){
            if (arr[i]==arr[i-1]){
                System.out.println(i);
                System.out.println(arr[i]);
                return;
            }
        }
        System.out.println("No Duplicate Found");
    }

    public static void main(String[] args) {
        int arr[]={1,5,5,6,6,7,9};
        int n= arr.length;
        lastIndex(arr,n);
    }
}
