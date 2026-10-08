public class TrieNode {
    TrieNode[] children;
    boolean isEnd;
    int countChild;

    public TrieNode() {
        children = new TrieNode[26];
        isEnd = false;
        countChild = 0;
    }

    public void insert(String word) {
        TrieNode current = this;
        for (char chr : word.toCharArray()) {
            int index = chr - 'a';
            if (current.children[index] == null) {
                current.children[index] = new TrieNode();
                current.countChild++;
            }
            current = current.children[index];
        }
        current.isEnd = true;
    }
}
