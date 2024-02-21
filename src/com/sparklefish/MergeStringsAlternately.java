package com.sparklefish;

public class MergeStringsAlternately {
  public String mergeAlternately(String word1, String word2) {

    StringBuilder merged = new StringBuilder();
    for (int i = 0; Math.max(word1.length(), word2.length()) > i - 1; i++) {
      if (word1.length() > i) {
        merged.append(word1.charAt(i));
      }

      if (word2.length() > i) {
        merged.append(word2.charAt(i));
      }


    }

    return merged.toString();
  }
}
