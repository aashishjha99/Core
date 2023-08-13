package algorithm;

import java.util.ArrayList;
import java.util.List;

public class Practise1 {

  static List<Integer> nextGreaterNumber(int[] arr) {
    int index = -1;

    for (int i = arr.length - 2; i >= 0; i--) {

      if (arr[i + 1] > arr[i]) {
        index = i;
        break;
      }

    }

    if (index == -1) {
      return new ArrayList<>();
    }

    for (int j = arr.length - 1; j >= 0; j--) {
      if (arr[j] > arr[index]) {
        int temp = arr[index];
        arr[index] = arr[j];
        arr[j] = temp;
        break;
      }
    }

    List<Integer> list = new ArrayList<>();
    for (int i = 0; i <= index; i++) {
      list.add(arr[i]);
    }

    for (int i = arr.length - 1; i >= index + 1; i--) {
      list.add((arr[i]));
    }
    return list;
  }

  public static void main(String[] args) {
    int[] arr = new int[] { 1,2,3,4,5 };
    System.out.println(nextGreaterNumber(arr));

  }
}
