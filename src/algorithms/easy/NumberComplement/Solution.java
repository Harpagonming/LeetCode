package algorithms.easy.NumberComplement;

/**
 * Created by cao.zm on 2017/2/27.
 */
public class Solution {
  public int findComplement(int num) {
    int aa = 0;
    int i = 0;
    while (num != 1) {
      aa = aa + (1 - num % 2) * (int) Math.pow(2, i);
      i++;
      num = num / 2;
    }
    return aa;
  }
}