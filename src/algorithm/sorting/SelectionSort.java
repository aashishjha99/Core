package algorithm.sorting;

import static java.util.Collections.swap;

public class SelectionSort {

  // Function to perform selection sort on an array
  static void selectionSort(int[] arr) {
    int arrLength = arr.length - 1;

    // Traverse through the entire array
    for (int i = 0; i <= arrLength - 1; i++) {
      // Assume the current index has the minimum value
      int min = i;

      // Search for the minimum value in the unsorted portion of the array
      for (int j = i + 1; j <= arrLength; j++) {
        if (arr[j] < arr[min]) {
          min = j; // Update the index of the minimum value
        }
      }

      // Swap the current element with the minimum value found
      int temp = arr[min];
      arr[min] = arr[i];
      arr[i] = temp;
    }

    // Print the sorted array

    displayElements(arr);
  }

  private static void displayElements(int[] arr) {
    for (int n : arr) {
      System.out.println(n);
    }
  }

  public static void main(String[] args) {
    int arr[] = { 13, 46, 24, 52, 20, 9 };

    // elemeents before sorting
    displayElements(arr);
    System.out.println();
    // Call the selectionSort function to sort the array
    SelectionSort.selectionSort(arr);


  }

}
