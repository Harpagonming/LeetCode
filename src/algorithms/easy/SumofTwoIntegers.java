package algorithms.easy;

/**
 * Created by cao.zm on 2017/3/7.
 */
public class SumofTwoIntegers {
  public int getSum(int a, int b) {
    if (b == 0)
      return a;
    int sum = a ^ b;
    int carry = (a & b) << 1;
    return getSum(sum, carry);
  }
}
