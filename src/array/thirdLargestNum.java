package array;

public class thirdLargestNum {
    static void thirdLargest(int[] arr,int size){
        if(size<3){
            System.out.println("Invalid Input");
            return;
        }
        int first=arr[0],sec=Integer.MIN_VALUE,third=Integer.MIN_VALUE;
        for (int i=0;i<size;i++){
            if (arr[i]>first){
                third=sec;
                sec=first;
                first=arr[i];
            }
            else if (arr[i]>sec){
                third=sec;
                sec=arr[i];
            }else if (arr[i]>third)
                third=arr[i];
        }
        System.out.println("The third largest element is "+third);
    }

    public static void main(String[] args) {
        int[] arr={1,3,5,2,6,8,12};
        int n= arr.length;
        thirdLargest(arr,n);
    }
}
