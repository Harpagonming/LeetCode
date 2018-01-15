package algorithms.easy.AssignCookies;

import java.util.Arrays;

/**
 * Created by cao.zm on 2017/3/13.
 */
public class Solution {
  public int findContentChildren(int[] g, int[] s) {
    int num = 0;
    Arrays.sort(g);
    Arrays.sort(s);
    int j = g.length - 1;
    for (int i = s.length - 1; i >= 0; i--) {
      while (g[j] > s[i] && j > 0) {
        j--;
      }
      if (g[j] <= s[i]) {
        num++;
        if (j > 0) {
          j--;
        } else {
          break;
        }
      }
    }
    return num;
  }
}
