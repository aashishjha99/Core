package leetcode;

import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Map;
import java.util.PriorityQueue;

public class SlidingWindowsMax {

  // Method to find the maximum values in sliding windows of size 'k'

  static int[] maxSlidingWindow(int[] nums, int k) {

    int end = 0;
    int start = 0;

    // Create a max heap (PriorityQueue) to store pairs of (num, index)
    // Sort by num in descending order (largest num at the top)
    PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>((a, b) -> b.getKey() - a.getKey());

    int arrLength = nums.length;
    
    int[] res = new int[arrLength - k + 1]; // Array to store results

    int index = 0; // Index to track the position in the 'res' array

    while (end < arrLength) {

      pq.add(new AbstractMap.SimpleEntry<>(nums[end], end)); // Create a Map.Entry object

      if (end - start + 1 < k) {
        end++; // Expand the window until its size reaches 'k'
      } else if (end - start + 1 == k) {
        // Window size has reached 'k', so process the maximum element in the window

        // Remove elements from the max heap that are no longer in the current window
        while (pq.peek() != null && pq.peek().getValue() < start) {
          pq.poll();
        }

        // The maximum element in the current window is at the top of the max heap
        assert pq.peek() != null;
        res[index++] = pq.peek().getKey();

        // Move the window by incrementing both start and end pointers
        start++;
        end++;
      }
    }

    return res; // Return the array containing maximum values for each window
  }

  public static void main(String[] args) {

    // Input: nums = [1,3,-1,-3,5,3,6,7], k = 3

    // [ 1,-1 ] , k = 1

    int[] inputArray = new int[] { 1, 3, -1, -3, 5, 3, 6, 7 };

    int[] res = maxSlidingWindow(inputArray, 3);

    // Print the result array
    Arrays.stream(res).forEach(System.out::println);

  }
}
