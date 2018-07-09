package algorithms.easy.JewelsAndStones;

/**
 * Created by win on 2018-07-09.
 */
public class Solution {
    public int numJewelsInStones(String J, String S) {
        return S.length() - S.replaceAll("[" + J + "]", "").length();
    }
}
