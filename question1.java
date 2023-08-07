import java.util.*;

public class question1 {
    public static int recurr(int arr[], int idx, int key) {
        // BASE CASE
        if (idx == arr.length) {
            return -1;
        }
        // WORKING
        if (arr[idx] == key) {
            return idx;
        }
        return recurr(arr, idx + 1, key); // Use idx + 1 to pass the incremented value
    }

    public static void main(String args[]) {
        int arr[] = {3, 2, 4, 5, 6, 2, 7, 2, 2};
        int key = 2;
        int result = recurr(arr, 0, key);

        // Printing all occurrences of the key
        while (result != -1) {
            System.out.print(result + " ");
            result = recurr(arr, result + 1, key);
        }
    }
}
