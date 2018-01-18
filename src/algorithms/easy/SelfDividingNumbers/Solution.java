package algorithms.easy.SelfDividingNumbers;

import java.util.ArrayList;
import java.util.List;

public class Solution {
  public List<Integer> selfDividingNumbers(int left, int right) {
    List<Integer> list = new ArrayList<>();
    for (int i = left; i <= right; i++) {
      if (isValid(i)) {
        list.add(i);
      }
    }
    return list;
  }

  boolean isValid(int number) {
    int current = number;
    do {
      int digit = current % 10;
      if (digit == 0 || number % digit != 0) {
        return false;
      }
      current = current / 10;
    } while (current != 0);
    return true;
  }
}
