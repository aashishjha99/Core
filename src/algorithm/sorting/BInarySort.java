package algorithm.sorting;

public class BInarySort {

  static void binarySort(int[] arr) {

    int arrLength = arr.length;

    for (int i = 0; i < arrLength - 1; i++) {
      for (int j = 0; j < arrLength - i - 1; j++) {
        if (arr[j] > arr[j + 1]) {
          int temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
        }
      }
    }

    displayElements(arr);
  }

  static void displayElements(int[] arr) {
    for (int n : arr) {
      System.out.println(n);
    }
  }

  public static void main(String[] args) {

    int arr[] = { 13, 46, 24, 52, 20, 9 };

    // elemeents before sorting
    displayElements(arr);
    System.out.println();
    binarySort(arr);

  }
}
