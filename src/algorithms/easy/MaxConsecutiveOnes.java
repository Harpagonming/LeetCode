package algorithms.easy;

/**
 * Created by cao.zm on 2017/3/2.
 */
public class MaxConsecutiveOnes {
  public int findMaxConsecutiveOnes(int[] nums) {
    int result = 0;
    int count = 0;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] == 1) {
        count++;
        result = Math.max(count, result);
      }
      else count = 0;
    }
    return result;
  }
}