package array;

public class arrayFloorByBinarySearch {
    static int floorSearch(int arr[], int x, int high, int low){
        if (low>high)
            return -1;
        if (x>arr[high])
            return high;
        int mid=(low+high)/2;
        if (arr[mid]==x)
            return mid;
        if (mid>0 && arr[mid-1]<=x && x<arr[mid])
            return mid-1;
        if (x<arr[mid])
            return floorSearch(arr,x,mid-1,low);
        else
            return floorSearch(arr,x,high,mid+1);
    }

    public static void main(String[] args) {
        int arr[]={1,2,4,6,13,27,56};
        int n=arr.length;
        int x=7;
        int index=floorSearch(arr,x,n-1,0);
        if (index==-1)
            System.out.println("Floor of "+x+" is not available");
        else
            System.out.println("Floor of "+x+" is at "+arr[index]+" position");

    }
}
