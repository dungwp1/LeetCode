public class D120_14_Longest_Common_Prefix {
    TrieNode root = new TrieNode();

    public String longestCommonPrefix(String[] strs) {
        for (String str : strs) {
            if (str.isEmpty()) return "";
            root.insert(str);
        }
        StringBuilder prefix = new StringBuilder();
        TrieNode current = root;
        while (current.countChild == 1 && !current.isEnd) {
            for (int i = 0; i < 26; i++) {
                if (current.children[i] != null) {
                    prefix.append((char) ('a' + i));
                    current = current.children[i];
                    break;
                }
            }
        }
        return prefix.toString();
    }


    public String longestCommonPrefix1(String[] strs) {
        if (strs == null || strs.length == 0) return "";
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) return "";
            }
        }
        return prefix;
    }
}

