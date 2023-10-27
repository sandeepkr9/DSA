package array;

public class maxMin {
    static int getMin(int arr[], int m){
        int res=arr[0];
        for (int i=0; i<m; i++){
            res=Math.min(res,arr[i]);
        }
        return res;
    }

    static int getMax(int arr[], int m){
        int res=arr[0];
        for (int i=0; i<m; i++)
            res=Math.max(res,arr[i]);
        return res;
    }

    public static void main(String[] args) {
        int arr[]={12,23,34,14,24};
        int m= arr.length;
        System.out.println(getMin(arr,m));
        System.out.println(getMax(arr,m));
    }
}
