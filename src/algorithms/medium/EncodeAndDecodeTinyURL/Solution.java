package algorithms.medium.EncodeAndDecodeTinyURL;

import java.util.HashMap;
import java.util.Map;

public class Solution {
  private static Map<String, String> longUrlIndex = new HashMap<>();
  private static Map<String, String> shortUrlIndex = new HashMap<>();

  private static String BASE = "http://tinyurl.com/";

  // Encodes a URL to a shortened URL.
  public String encode(String longUrl) {
    if (longUrlIndex.containsKey(longUrl)) {
      return longUrlIndex.get(longUrl);
    }
    String charSet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    StringBuilder sb;
    do {
      sb = new StringBuilder("");
      for (int i = 0; i < 6; i++) {
        sb.append(charSet.charAt((int) (Math.random() * charSet.length())));
      }
    } while (shortUrlIndex.containsKey(sb.toString()));
    shortUrlIndex.put(sb.toString(), longUrl);
    return BASE + sb.toString();
  }

  // Decodes a shortened URL to its original URL.
  public String decode(String shortUrl) {
    return shortUrlIndex.get(shortUrl.replace(BASE, ""));
  }
}

// Your Solution object will be instantiated and called as such:
// Solution codec = new Solution();
// codec.decode(codec.encode(url));