package com.sparklefish;

public class CanPlaceFlowers {
  public static void main(String[] args) {

    CanPlaceFlowers clazz = new CanPlaceFlowers();

    System.out.println(canPlaceFlowers(new int[]{0, 0, 0}, 2));
  }

  public static boolean canPlaceFlowers(int[] flowerbed, int n) {
    int maxFlowers = 0;
    if (flowerbed.length == 1) {
      if (flowerbed[0] == 0) {
        maxFlowers++;
      }
    } else {
      if (flowerbed[0] == 0 && flowerbed[1] == 0) {
        maxFlowers++;
        flowerbed[0] = 1;
      }

      for (int i = 1; i < flowerbed.length - 1; i++) {
        Boolean isPreviousEmpty = flowerbed[i - 1] == 0;
        Boolean isCurrentEmpty = flowerbed[i] == 0;
        Boolean isNextEmpty = flowerbed[i + 1] == 0;

        if (isPreviousEmpty && isCurrentEmpty && isNextEmpty) {
          maxFlowers++;
          flowerbed[i] = 1;
        }
      }
      if (flowerbed[flowerbed.length - 2] == 0 && flowerbed[flowerbed.length - 1] == 0) {
        maxFlowers++;
      }
    }
    return n <= maxFlowers;
    /*
    Boolean canPlantFlowers = false;
    int flowers = 0;
    int firstFlowerIndex = -2;
    for (int i = 0; i < flowerbed.length; i++) {
      if (flowerbed[i] == 1) {
        flowers++;
      }
      if (firstFlowerIndex < 0 && flowerbed[i] == 1) {
        firstFlowerIndex = i;
      }
    }
    if (firstFlowerIndex % 2 == 0 || flowerbed.length % 2 == 0) {
      canPlantFlowers = Math.ceil(flowerbed.length / (double) 2) - flowers >= n;
    } else {
      canPlantFlowers = Math.ceil(flowerbed.length / (double) 2) - flowers > n;
    }
    return canPlantFlowers;
    */
  }

}
