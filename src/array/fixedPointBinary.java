package array;

public class fixedPointBinary {
    static int binarySearch(int arr[], int low, int high){
        if (high>=low){
            int mid=low+(high-low)/2;
            if (mid==arr[mid]){
                return mid;
            }
            int res=-1;
            if (mid+1<=arr[high]){
                res=binarySearch(arr,(mid+1),high);
            }
            if (res!=-1){
                return res;
            }
            if (mid-1>arr[low]){
                return binarySearch(arr, low, mid-1);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[]={-10,-20,0,4,98,42,49};
        int n=arr.length;
        System.out.println(binarySearch(arr,0,n-1));
    }
}
