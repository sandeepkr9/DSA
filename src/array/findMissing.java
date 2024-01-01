package array;

public class findMissing {
    static int findMissing(int[] arr1,int[] arr2,int n1,int n2){
        boolean found;
        for (int i=0;i<n1;i++){
            found=false;
            for (int j=0;j<n2;j++){
                if (arr1[i]==arr2[j]){
                    found=true;
                    break;
                }
            }
            if (!found)
                return arr1[i];
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr1={1,4,7,9,5};
        int[] arr2={1,4,3,9,5};
        int n1=arr1.length;
        int n2=arr2.length;
        int missing=findMissing(arr1,arr2,n1,n2);
        if (missing==-1){
            System.out.println("Missing element not found");
        }else
            System.out.println(missing);
    }
}
