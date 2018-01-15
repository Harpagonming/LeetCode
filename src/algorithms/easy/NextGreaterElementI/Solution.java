package algorithms.easy.NextGreaterElementI;

/**
 * Created by cao.zm on 2017/2/28.
 */
public class Solution {
  public int[] nextGreaterElement(int[] findNums, int[] nums) {
    int[] result = new int[findNums.length];
    int k = 0;
    for (int i : findNums) {
      boolean equal = false;
      boolean hasGreater = false;
      for (int j : nums) {
        if (equal == false) {
          if ((i ^ j) == 0) {
            equal = true;
          }
        } else {
          if (hasGreater == false) {
            if (i < j) {
              hasGreater = true;
              result[k] = j;
              continue;
            }
          }
        }
        if (hasGreater == false) {
          result[k] = -1;
        }
      }
      k++;
    }
    return result;
  }
}