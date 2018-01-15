package algorithms.easy.DetectCaptial;

/**
 * Created by cao.zm on 2017/3/2.
 */
public class Solution {
  public boolean detectCapitalUse(String word) {
    return word.equals(word.toUpperCase()) || word.equals(word.toLowerCase()) || (Character
            .isUpperCase(word.charAt(0))
            && word.substring(1).equals(word.substring(1).toLowerCase()));
  }
}
