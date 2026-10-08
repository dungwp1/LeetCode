public class D121_720_Longest_Word_in_Dictionary {
    TrieNode1 root = new TrieNode1();
    String result = null;

    public String longestWord(String[] words) {

        for (String word : words) {
            root.insert(word);
        }
        root.word = "";
        dfs(root);
        return result;
    }

    private void dfs(TrieNode1 node) {
        if (node == null) return;
        if (node.word == null) return;
        if (result == null || node.word.length() > result.length()) result = node.word;

        for (TrieNode1 child : node.children) {
            if (child != null) {
                dfs(child);
            }
        }
    }
}

class TrieNode1 {
    TrieNode1[] children;
    String word;

    public TrieNode1() {
        children = new TrieNode1[26];
        word = null;
    }

    public void insert(String word) {
        TrieNode1 current = this;
        for (char chr : word.toCharArray()) {
            int index = chr - 'a';
            if (current.children[index] == null) {
                current.children[index] = new TrieNode1();
            }
            current = current.children[index];
        }
        current.word = word;
    }
}


