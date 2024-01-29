package com.sparklefish;

public class TwoSum {

  public int[] twoSum(int[] nums, int target) {

    int[] solution = new int[0];

    for (int i = 0; i < nums.length - 1; i++) {
      for (int j = i + 1; j < nums.length; j++) {
        if (nums[i] + nums[j] == target) {
          solution = new int[]{i, j};
          break;
        }
      }
    }

    return solution;
  }
}