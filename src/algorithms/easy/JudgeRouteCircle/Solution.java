package algorithms.easy.JudgeRouteCircle;

public class Solution {
  public boolean judgeCircle(String moves) {
    int vertical = 0;
    int horizontal = 0;
    for (char c : moves.toCharArray()) {
      switch (c) {
        case 'U':
          vertical++;
          continue;
        case 'D':
          vertical--;
          continue;
        case 'L':
          horizontal--;
          continue;
        case 'R':
          horizontal++;
      }
    }
    return vertical == 0 && horizontal == 0;
  }
}