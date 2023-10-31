package array;

public class commonElementThreepointer {
    void commonElementThreepointer(int arr1[],int arr2[], int arr3[]){
        int i=0,j=0,k=0;
        while (i<arr1.length && j<arr2.length && k< arr3.length){
            if (arr1[i]==arr2[j] && arr2[j]==arr3[k]){
                System.out.println(arr1[i]);
                i++;
                j++;
                k++;
            }
            else if (arr1[i]<arr2[j])
                i++;
            else if (arr2[j]<arr3[k])
                j++;
            else
                k++;
        }
    }

    public static void main(String[] args) {
        commonElementThreepointer cet=new commonElementThreepointer();
        int arr1[]={12,23,34,45,56};
        int arr2[]={90,78,67,56,45};
        int arr3[]={23,34,45,56,67};
        System.out.println();
        cet.commonElementThreepointer(arr1,arr2,arr3);
    }
}
