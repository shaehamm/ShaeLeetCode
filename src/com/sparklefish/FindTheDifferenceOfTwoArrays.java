package com.sparklefish;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindTheDifferenceOfTwoArrays {

  public static void main(String[] args) {
    findDifference(new int[]{1, 2, 3}, new int[]{2, 4, 6});
  }

  public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {

    List<Integer> int1 = new ArrayList<>(Arrays.stream(nums1).boxed().toList());
    List<Integer> int2 = new ArrayList<>(Arrays.stream(nums2).boxed().toList());

    Set<Integer> set1 = new HashSet<Integer>(int1);//Arrays.stream(nums1).boxed().collect(Collectors.toSet());
    Set<Integer> set2 = new HashSet<Integer>(int2);//Arrays.stream(nums2).boxed().collect(Collectors.toSet());
    List<List<Integer>> toReturn = new ArrayList<List<Integer>>();


    for (int n : set1) {
      if (set2.contains(n)) {
        int1.removeAll(List.of(n));
        int2.removeAll(List.of(n));
        //set2.remove(n);
        //set1.remove(n);
      }
    }
    set1.clear();
    set2.clear();
    set1.addAll(int1);
    set2.addAll(int2);

    toReturn.add(set1.stream().toList());//set1.stream().toList());
    toReturn.add(set2.stream().toList());//set2.stream().toList());
    return toReturn;
  }
}
