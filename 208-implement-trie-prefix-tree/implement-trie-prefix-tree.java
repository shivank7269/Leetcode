class TrieNode {
    TrieNode[] child;
    boolean isEnd;

    public TrieNode() {
        child = new TrieNode[26];
        isEnd = false;
    }
}

class Trie {
    private final TrieNode root;

    public Trie() {
        root = new TrieNode();
    }

    public void insert(String word) {
        TrieNode node = root;
        for (char ch : word.toCharArray()) {
            int idx = ch - 'a';
            if (node.child[idx] == null) {
                node.child[idx] = new TrieNode();
            }
            node = node.child[idx];
        }
        node.isEnd = true;
    }

    public boolean search(String word) {
        TrieNode node = searchPrefix(word);
        return node != null && node.isEnd;
    }

    public boolean startsWith(String prefix) {
        return searchPrefix(prefix) != null;
    }

    private TrieNode searchPrefix(String str) {
        TrieNode node = root;
        for (char ch : str.toCharArray()) {
            int idx = ch - 'a';
            if (node.child[idx] == null) {
                return null;
            }
            node = node.child[idx];
        }
        return node;
    }
}