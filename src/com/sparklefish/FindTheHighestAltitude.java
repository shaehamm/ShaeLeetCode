package com.sparklefish;

public class FindTheHighestAltitude {

  public static int largestAltitude(int[] gain) {
    int highestAltitude = 0;
    int currentAltitude = 0;
    for (int i = 0; i < gain.length; i++) {
      currentAltitude += gain[i];
      if (currentAltitude > highestAltitude) {
        highestAltitude = currentAltitude;
      }
    }
    return highestAltitude;
  }
}
