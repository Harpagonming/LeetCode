package algorithms.easy.ReverseString;

/**
 * Created by cao.zm on 2017/3/1.
 */
public class Solution {
  public String reverseString(String s) {
    char[] a = s.toCharArray();
    int i = 0;
    int j = s.length() - 1;
    while (i < j) {
      char temp;
      temp = a[i];
      a[i] = a[j];
      a[j] = temp;
      i++;
      j--;
    }
    return new String(a);
  }
}
