package algorithms;

import algorithms.easy.FindAnagramMappings.Solution;

public class Main {
  public static void main(String[] args) {
    Solution solution = new Solution();
    int[] A = {12, 28, 46, 32, 50};
    int[] B = {50, 12, 32, 46, 28};
    System.out.println(solution.anagramMappings(A, B));
  }
}
