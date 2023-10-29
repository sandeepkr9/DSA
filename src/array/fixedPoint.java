package array;

public class fixedPoint {
    static int linearSearch(int arr[], int n){
        for (int i=0; i<=n-1; i++){
            if (arr[i]==i){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[]={-10,20,0,100,4,23,40};
        int n= arr.length;
        System.out.println(linearSearch(arr,n));
    }
}
