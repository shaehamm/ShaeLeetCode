package com.sparklefish;

public class MaximumAverageSubarray1 {
  public static void main(String[] args) {
    findMaxAverage(new int[]{1, 12, -5, -6, 50, 3}, 4);
  }

  public static double findMaxAverage(int[] nums, int k) {

    int max = 0;
    int toCheck = 0;

    if (nums.length == 1 && k > 0) {
      return (double) nums[0] / k;
    }
    for (int i = 0; i <= nums.length - k; i++) {
      for (int j = 0; j < k; j++) {
        toCheck += nums[j + i];
      }
      //toCheck = IntStream.of(Arrays.copyOfRange(nums, i, i + k)).sum();
      if (toCheck > max || i == 0) {
        max = toCheck;
      }
      toCheck = 0;
    }
    return (double) max / k;
  }
}
