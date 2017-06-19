package algorithms.easy;

/**
 * Created by cao.zm on 2017/3/14.
 */
public class TwoSumII {
  public int[] twoSum(int[] numbers, int target) {
    int j = numbers.length - 1;
    boolean pivot;
    int i;
    for (i = 0; i < numbers.length; i++) {
      if (numbers[i] + numbers[j] == target) {
        break;
      }
      pivot = false;
      while (numbers[i] + numbers[j] > target) {
        j--;
        pivot = true;
      }
      if (pivot == true && numbers[i] + numbers[j] < target) {
        continue;
      }
      if (j == numbers.length - 1) {
        continue;
      }
      while (numbers[i] + numbers[j] < target) {
        j++;
        pivot = true;
      }
      if (pivot == true && numbers[i] + numbers[j] > target) {
        continue;
      }
    }
    int[] result = {i + 1, j + 1};
    return result;
  }
}
