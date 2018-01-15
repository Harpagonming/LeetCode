package algorithms.easy.FindAnagramMappings;

import java.util.HashSet;
import java.util.Set;

public class Solution {
  public int[] anagramMappings(int[] A, int[] B) {
    Set<Integer> set = new HashSet<>();
    for (int i = 0; i < A.length; i++) {
      set.add(i);
    }
    int[] result = new int[set.size()];
    for (int i = 0; i < A.length; i++) {
      for (int j : set) {
        if (B[j] == A[i]) {
          set.remove(j);
          result[i] = j;
          break;
        }
      }
    }
    return result;
  }
}
