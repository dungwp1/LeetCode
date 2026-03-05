import java.util.*;

public class D34_49 {
    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);
            if (map.containsKey(key)) {
                map.get(key).add(str);
            } else {
                List<String> listValue = new ArrayList<>();
                listValue.add(str);
                map.put(key, listValue);
            }
        }
        List<List<String>> result = new ArrayList<>();
        for (String key : map.keySet()) {
            List<String> element = new ArrayList<>();
            for (String str : map.get(key)) {
                element.add(str);
            }
            result.add(element);
        }
        return result;
    }
}
