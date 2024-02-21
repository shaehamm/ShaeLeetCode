package com.sparklefish;

import java.util.ArrayList;
import java.util.List;

public class KidsWithGreatestNumberOfCandies {

  public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

    List<Boolean> isGreatestNumber = new ArrayList<Boolean>();

    int maxNumber = 0;
    for (int i = 0; i < candies.length; i++) {
      if (candies[i] > maxNumber) {
        maxNumber = candies[i];
      }
    }
    //I want to be able to do same expression to all without looping through
    for (int i = 0; i < candies.length; i++) {
      isGreatestNumber.add(candies[i] + extraCandies >= maxNumber);
    }

    return isGreatestNumber;
  }

}
