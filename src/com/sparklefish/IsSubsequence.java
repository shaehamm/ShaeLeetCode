package com.sparklefish;

public class IsSubsequence {

  public static void main(String[] args) {
    isSubsequence("aaaaaa", "bbaaaa");
  }

  public static boolean isSubsequence(String s, String t) {

    int indexCheck = 0;
    int previousIndex = 0;
    for (int i = 0; i < s.length(); i++) {
      indexCheck = t.substring(previousIndex).indexOf(s.charAt(i));
      if (indexCheck > -1) {
        previousIndex = indexCheck + previousIndex + 1;
      } else {
        return false;
      }
    }
    return true;
    /*
    StringBuilder tBuilder = new StringBuilder(t);
    for (int i = 0; i < tBuilder.length(); i++) {
      if (s.indexOf(tBuilder.charAt(i)) < 0) {
        tBuilder.deleteCharAt(i);
        i--;
      }
    }
    return s.equals(tBuilder.toString());

     */
    /*
    Boolean toReturn = true;
    for (int i = 0; i < s.length(); i++) {
      if (t.indexOf(s.charAt(i)) < 0) {
        toReturn = false;
      }
    }
    return toReturn;
    */
  }
}
