package algorithms.easy;

/**
 * Created by cao.zm on 2017/3/17.
 */
public class MinimumMovestoEqualArrayElements {
  public int minMoves(int[] nums) {
    int sumInitial = 0;
    int max = nums[0];
    for (int i : nums) {
      sumInitial += i;
      if (i > max) {
        max = i;
      }
    }
    int moves = 0;
    while (max * nums.length > sumInitial + moves * (nums.length - 1) &&
            (sumInitial + moves * (nums.length - 1)) % nums.length != 0) {
      moves++;
    }
    return moves;
  }
}
