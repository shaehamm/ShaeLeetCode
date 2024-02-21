package com.sparklefish;


public class MoveZeros {

  public static void main(String[] args) {

    moveZeroes(new int[]{0, 0, 1});
  }

  public static void moveZeroes(int[] nums) {

    int zeroCounter = 0;
    for (int i = 0; i < nums.length - zeroCounter; ) {
      if (nums[i] == 0) {
        zeroCounter++;
        for (int j = i; j < nums.length - 1; j++) {
          nums[j] = nums[j + 1];
          if (j == nums.length - zeroCounter - 1) {
            nums[j + 1] = 0;
          }
        }
      } else {
        i++;
      }
    }
    //nums = Arrays.stream(nums).filter(x -> x != 0).toArray();

  }

}
