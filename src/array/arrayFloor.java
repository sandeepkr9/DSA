package array;

public class arrayFloor {
    static int floorSearch(int arr[], int n, int x){
        if (x >= arr[n-1])
            return n-1;
        if (x < arr[0])
            return -1;
        for (int i=1; i<n; i++) {
            if (arr[i] > x)
                return i - 1;
        }
        return -1;

    }

    public static void main(String[] args) {
        int arr[]={1,23,54,55,6,17};
        int n=arr.length;
        int x=7;
        int index=floorSearch(arr,n-1,x);
        if (index==-1)
            System.out.println("floor of "+x+" is not available");
        else
            System.out.println("floor of "+x+" is at "+arr[index]+" position");
    }
}
