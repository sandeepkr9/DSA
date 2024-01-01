package array;

public class lostElement {
    static void lost(int[] arr1,int[] arr2,int n1,int n2){
        if (n1!=n2-1 && n2!=n1-1){
            System.out.println("Invalid input");
            return;
        }
        int res=0;
        for (int i=0;i<n2;i++)
            res=res^arr1[i];
        for (int i=0;i<n1;i++)
            res=res^arr2[i];
        System.out.println(res);
    }

    public static void main(String[] args) {
        lostElement le=new lostElement();
        int[] arr1={1,3,5,7,9};
        int[] arr2={1,3,5,9};
        int n1=arr2.length;
        int n2=arr1.length;
        le.lost(arr1,arr2,n1,n2);
    }
}
