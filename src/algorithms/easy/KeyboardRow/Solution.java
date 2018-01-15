package algorithms.easy.KeyboardRow;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by cao.zm on 2017/2/28.
 */
public class Solution {
  public String[] findWords(String[] words) {
    Set<Character> upper = new HashSet<>();
    Set<Character> mid = new HashSet<>();
    Set<Character> lower = new HashSet<>();
    upper.add('q');
    upper.add('w');
    upper.add('e');
    upper.add('r');
    upper.add('t');
    upper.add('y');
    upper.add('u');
    upper.add('i');
    upper.add('o');
    upper.add('p');

    mid.add('a');
    mid.add('s');
    mid.add('d');
    mid.add('f');
    mid.add('g');
    mid.add('h');
    mid.add('j');
    mid.add('k');
    mid.add('l');

    lower.add('z');
    lower.add('x');
    lower.add('c');
    lower.add('v');
    lower.add('b');
    lower.add('n');
    lower.add('m');
    List<String> result = new ArrayList<>();
    for (String word : words) {
      char[] string = word.toLowerCase().toCharArray();
      Set<Character> set;
      if (upper.contains(string[0])) {
        set = upper;
      } else if (mid.contains(string[0])) {
        set = mid;
      } else {
        set = lower;
      }
      boolean isSameLane = true;
      for (char a : string) {
        if (!set.contains(a)) {
          isSameLane = false;
          break;
        }
      }
      if (isSameLane == true) {
        result.add(word);
      }
    }
    return result.toArray(new String[result.size()]);
  }
}
