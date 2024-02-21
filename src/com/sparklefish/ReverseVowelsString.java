package com.sparklefish;

public class ReverseVowelsString {
  public String reverseVowels(String s) {
    StringBuilder toReturn = new StringBuilder(s);
    StringBuilder vowels = new StringBuilder();
    for (int i = s.length() - 1; i >= 0; i--) {
      if (Character.toLowerCase(s.charAt(i)) == 'a' || Character.toLowerCase(s.charAt(i)) == 'e' ||
        Character.toLowerCase(s.charAt(i)) == 'i' || Character.toLowerCase(s.charAt(i)) == 'o' ||
        Character.toLowerCase(s.charAt(i)) == 'u') {
        vowels.append(s.charAt(i));
      }
    }
    for (int i = 0; i < s.length(); i++) {
      if (Character.toLowerCase(s.charAt(i)) == 'a' || Character.toLowerCase(s.charAt(i)) == 'e' ||
        Character.toLowerCase(s.charAt(i)) == 'i' || Character.toLowerCase(s.charAt(i)) == 'o' ||
        Character.toLowerCase(s.charAt(i)) == 'u') {
        toReturn.setCharAt(i, vowels.charAt(0));
        vowels.deleteCharAt(0);
      }
    }
    return toReturn.toString();
  }

}
