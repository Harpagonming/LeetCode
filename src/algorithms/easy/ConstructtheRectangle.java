package algorithms.easy;

/**
 * Created by cao.zm on 2017/3/7.
 */
public class ConstructtheRectangle {
  public int[] constructRectangle(int area) {
    int[] result = new int[2];
    int L = (int) Math.ceil(Math.sqrt(area));
    while (area % L != 0) {
      L++;
    }
    result[0] = L;
    result[1] = area / L;
    return result;
  }
}
