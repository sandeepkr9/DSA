package array;

public class sumClosestToZero {
    static int partition(int arr[],int low,int high){
        int pivot=arr[high];
        int i=low-1;
        for (int j=low;j<high;j++){
            if (arr[j]<=pivot){
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        int temp=arr[i+1];
        arr[i+1]=arr[high];
        arr[high]=temp;
        return i+1;
    }
    static void sort(int arr[],int low, int high){
        if (low<high){
            int pi=partition(arr,low,high);
            sort(arr,low,pi-1);
            sort(arr,pi+1,high);
        }
    }
    static void closestToZero(int arr[], int n){
        int sum, min=99999;
        int left=0,right=n-1;
        int min_l=1,min_r=n-1;
        if (n<2){
            System.out.println("Invalid Input");
            return;
        }
        sort(arr,left,right);
        while (left<right){
            sum=arr[left]+arr[right];
            if (Math.abs(sum)<Math.abs(min)) {
                min = sum;
                min_l = left;
                min_r = right;
            }
                if (sum<0){
                    left++;
                }else
                    right--;
        }
        System.out.println("two element whose sum is minimum "+arr[min_l]+" and "+arr[min_r]);
    }

    public static void main(String[] args) {
        int arr[]={1,4,23,56,89};
        int n= arr.length;
        closestToZero(arr,n);
    }
}
