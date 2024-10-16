package leetcode.medium;

import java.util.PriorityQueue;

public class Solution1405 {
  class Pair {
    int count;
    char character;
    Pair(int count, char character) {
      this.count = count;
      this.character = character;
    }
  }

  // tc: O(a + b + c) , sc: O(1)
  public String longestDiverseString(int a, int b, int c) {
    PriorityQueue<Pair> pq = new PriorityQueue<>((x, y) -> (y.count - x.count));
    if (a > 0) pq.add(new Pair(a, 'a'));
    if (b > 0) pq.add(new Pair(b, 'b'));
    if (c > 0) pq.add(new Pair(c, 'c'));
    StringBuilder ans = new StringBuilder();
    while (!pq.isEmpty()) {
      Pair p = pq.poll();
      int count = p.count;
      char character = p.character;
      if (ans.length() >= 2 && ans.charAt(ans.length() - 1) == p.character && ans.charAt(ans.length() - 2) == p.character) {
        if (pq.isEmpty()) break;
        Pair temp = pq.poll();
        ans.append(temp.character);
        if (temp.count - 1 > 0)
          pq.add(new Pair(temp.count - 1, temp.character));
      } else {
        count--;
        ans.append(character);
      }

      if (count > 0)
        pq.add(new Pair(count, character));
    }
    return ans.toString();
  }

  // OR:
  public String longestDiverseString2(int a, int b, int c) {
    int curra = 0, currb = 0, currc = 0;
    int totalIterations = a + b + c;
    StringBuilder ans = new StringBuilder();
    for (int i = 0; i < totalIterations; i++) {
      if ((a >= b && a >= c && curra != 2) ||
          (a > 0 && (currb == 2 || currc == 2))
      ) {
          ans.append('a');
          a--;
          curra++;
          currb = currc = 0;
      } else if ((b >= a && b >= c && currb != 2) ||
                  (b > 0 && (currc == 2 || curra == 2))
      ) {
        ans.append('b');
        b--;
        currb++;
        curra = currc = 0;
      } else if (
        (c >= a && c >= b && currc != 2) ||
        (c > 0 && (curra == 2 || currb == 2))
      ) {
        ans.append('c');
        c--;
        currc++;
        curra = currb = 0;
      }
    }
    return ans.toString();
  }
}
