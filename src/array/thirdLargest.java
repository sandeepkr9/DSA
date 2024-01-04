package array;

public class thirdLargest {
    static void thirdLargest(int[] arr,int size){
        if (size<3){
            System.out.println("Invalid Input");
            return;
        }
        int first=arr[0];
        for (int i=0;i<size;i++){
            if (arr[i]>first){
                first=arr[i];
            }
        }
        int second= Integer.MIN_VALUE;
        for (int i=1;i<size;i++){
            if (arr[i]>second && arr[i]<first){
                second=arr[i];
            }
        }
        int third=Integer.MIN_VALUE;
        for (int i=1;i<size;i++){
            if (arr[i]>third && arr[i]<second)
                third=arr[i];
        }
        System.out.println("Third largest element is "+third);
    }

    public static void main(String[] args) {
        int[] arr={1,3,6,1,5,9,4,12};
        int n= arr.length;
        thirdLargest(arr,n);
    }
}
