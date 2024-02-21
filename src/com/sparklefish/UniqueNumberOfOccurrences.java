package com.sparklefish;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UniqueNumberOfOccurrences {

  public static void main(String[] args) {
    uniqueOccurrences(new int[]{1, 2, 2, 1, 1, 3});
  }

  public static boolean uniqueOccurrences(int[] arr) {
    Map<Integer, Integer> occurrances = new HashMap<Integer, Integer>();
    Set<Integer> onlyOccurrances = new HashSet<Integer>();
    for (int i = 0; i < arr.length; i++) {
      if (occurrances.containsKey(arr[i])) {
        occurrances.put(arr[i], occurrances.get(arr[i]) + 1);
      } else {
        occurrances.put(arr[i], 1);
      }
    }

    for (Integer key : occurrances.keySet()) {
      onlyOccurrances.add(occurrances.get(key));
    }
    return occurrances.size() == onlyOccurrances.size();
  }
}
