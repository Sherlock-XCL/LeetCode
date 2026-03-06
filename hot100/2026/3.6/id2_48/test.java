import java.util.*;

public class test {
  public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<String, List<String>>();
        for (String str : strs) {
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray); // bat -> abt
            String key = new String(charArray);
            List<String> list = map.getOrDefault(key, new ArrayList<String>());
            // ate eat ... (add tea)
            list.add(str);
            map.put(key, list);
        }
        Collection<List<String>> values = map.values();
        System.out.println(values);
        List<List<String>> ans = new ArrayList<>(values);
        return ans;
    }
    
    public static void main(String[] args) {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> groupAnagrams = groupAnagrams(strs);
        System.out.println(groupAnagrams);
    }
}
