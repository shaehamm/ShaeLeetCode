package com.sparklefish;

import java.util.LinkedList;
import java.util.Queue;

public class NumberOfRecentCalls {
  Queue<Integer> recentCalls = new LinkedList<Integer>();

  /*
  private Queue<Integer> requests;
      public RecentCounter() {
         this.requests = new LinkedList<>();
      }
   */
  public NumberOfRecentCalls() {
  }

  public int ping(int t) {
    recentCalls.add(t);
    while (t - 3000 > recentCalls.element()) {
      recentCalls.poll();
    }
    return recentCalls.size();
  }

}
