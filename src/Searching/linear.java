package Searching;

public class linear {
    public static int iterate(int arr[], int n, int x){
        for (int i=0;i<n;i++){
            if (arr[i]==x);
            return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[]={1,6,26,9,6};
        int x=15;
        int out=iterate(arr,arr.length,x);
        if (x==-1){
            System.out.println("Element is not present");
        }else{
            System.out.println("Element is at "+out+" position");
        }
    }
}
