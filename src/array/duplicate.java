package array;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class duplicate {
    //brute force technique
    static void findDuplicate(int arr[], int len) {
        HashSet<Integer> set = new HashSet<>();
        LinkedHashSet<Integer> al = new LinkedHashSet<>();

        for (int i = 0; i < len - 1; i++) {
            for (int j = i + 1; j < len; j++) {
                if (arr[i] == arr[j]) {
                    set.add(arr[i]);
                }
            }
        }

        for (int num : arr) {
            if (set.contains(num)) {
                al.add(num);
            }
        }

        if (!al.isEmpty()) {
            System.out.println("Duplicate elements: " + al);
        } else {
            System.out.println("No duplicates are present");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 12, 11, 40, 5, 6, 5, 11, 12, 11 };
        int len = arr.length;
        findDuplicate(arr, len);
    }
}
