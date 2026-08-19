package chapter4;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SeetMapApisFunc {
  public static void main(String[] args) {
    Set<Integer> set = new HashSet<>();

    System.out.println(set.add(66)); // true
    System.out.println(set.add(66)); // false
    System.out.println(set.size()); // 1
    set.remove(66);
    System.out.println(set.isEmpty()); // true

    // MAPS

    Map<String, String> map = new HashMap<>();
    map.put("koala", "bamboo");

    String food = map.get("koala"); // bamboo
    String other = map.getOrDefault("ant", "leaf"); // leaf

    for (String key : map.keySet())
      System.out.println(key + " " + map.get(key)); // koala bamboo
  }
}
