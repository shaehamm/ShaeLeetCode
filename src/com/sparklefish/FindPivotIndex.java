package com.sparklefish;

public class FindPivotIndex {

  public static int pivotIndex(int[] nums) {

    for (int i = 0; i < nums.length; i++) {
      int leftSum = 0;
      int rightSum = 0;
      for (int j = 0; j < nums.length; j++) {
        if (j < i) {
          leftSum += nums[j];
        } else if (j > i) {
          rightSum += nums[j];
        }
      }
      if (leftSum == rightSum) {
        return i;
      }
    }
    return -1;
    /*
    int leftSum = nums[0];
    int rightSum = 0;
    int i = 0;
    int j = nums.length - 1;
    int index = 0;
    while (i < nums.length || j < nums.length) {

      if (leftSum > rightSum) {
        rightSum += nums[nums.length];
        j--;
      } else if (rightSum > leftSum) {
        leftSum += nums[i];
        i++;
      } else if (rightSum == leftSum && i < j - 1) {
        index = i + 1;
      }
    }
    return index;
    
     */
  }
}
