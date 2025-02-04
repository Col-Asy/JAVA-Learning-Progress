package Lec26;

// Quick sort implementation using Divide and Conquer
// In this, we directly modify the given array to sort it

public class Quick_Sort {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[] arr = { 5, 7, 2, 1, 8, 3, 4 };
        Sort(arr, 0, arr.length - 1);  // Sort the array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");  // Print the sorted array
        }  

    }

    public static void Sort(int[] arr, int si, int ei) {
        if (si >= ei) {
            return;  // Base case: array with one or zero elements is already sorted
        }
        int idx = Partition(arr, si, ei);  // Partition the array
        Sort(arr, si, idx - 1);  // Recursively sort the left part
        Sort(arr, idx + 1, ei);  // Recursively sort the right part

    }

    public static int Partition(int[] arr, int si, int ei) {
        // Partitioning the array around the pivot element

        int item = arr[ei];  // Choose the pivot element
        int idx = si;  // Initialize the index of smaller element
        for (int i = si; i < ei; i++) {
            if (arr[i] < item) {
                int temp = arr[i];
                arr[i] = arr[idx];
                arr[idx] = temp;  // Swap if the current element is smaller than the pivot
                idx++;
            }

        }
        int temp = arr[ei];
        arr[ei] = arr[idx];
        arr[idx] = temp;  // Swap the pivot element with the element at the index
        return idx;  // Return the index of the pivot element
    }

}
