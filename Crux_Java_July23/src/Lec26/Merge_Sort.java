package Lec26;

// Merge sort implementation using Divide and Conquer
// In this, we aren't directly changing the given array, but creating a new array and feeding the responses into it
public class Merge_Sort {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[] arr = { 7, 5, 1, 4, 3 };  // Input array to be sorted
        int[] ans = Sort(arr, 0, arr.length - 1);  // Call the Sort function
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");  // Print the sorted array
        }

    }

    public static int[] Sort(int[] arr, int si, int ei) {
        if (si == ei) {
            int[] bs = new int[1];  // Base case: single element array
            bs[0] = arr[si];
            return bs;
        }
        int mid = (si + ei) / 2;  // Find the middle index
        int[] fa = Sort(arr, si, mid);  // Recursively sort the first half
        int[] sa = Sort(arr, mid + 1, ei);  // Recursively sort the second half
        return Merge(fa, sa);  // Merge the sorted halves
    }

    public static int[] Merge(int[] arr1, int[] arr2) {
        int n = arr1.length;
        int m = arr2.length;
        int[] ans = new int[n + m];  // Array to hold the merged result
        int i = 0, j = 0, k = 0;
        while (i < n && j < m) {
            if (arr1[i] < arr2[j]) {
                ans[k] = arr1[i];  // Take element from first array
                i++;
                k++;
            } else {
                ans[k] = arr2[j];  // Take element from second array
                j++;
                k++;
            }
        }
        while (i < n) {
            ans[k] = arr1[i];  // Copy remaining elements from first array
            i++;
            k++;
        }
        while (j < m) {
            ans[k] = arr2[j];  // Copy remaining elements from second array
            j++;
            k++;
        }
        return ans;  // Return the merged array

    }

}
