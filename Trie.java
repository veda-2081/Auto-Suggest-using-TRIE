import java.util.*;

class TrieNode {
    Map<Character, TrieNode> children = new HashMap<>();
    boolean isWord;
}

class Trie {
    private final TrieNode root;
    
    public Trie() {
        root = new TrieNode();
    }
    
    public void insert(String word) {
        TrieNode node = root;
        for (char ch : word.toCharArray()) {
            node.children.putIfAbsent(ch, new TrieNode());
            node = node.children.get(ch);
        }
        node.isWord = true;
    }
    
    public boolean search(String word) {
        TrieNode node = root;
        for (char ch : word.toCharArray()) {
            if (!node.children.containsKey(ch)) return false;
            node = node.children.get(ch);
        }
        return node.isWord;
    }
    
    public List<String> autoSuggest(String prefix) {
        List<String> result = new ArrayList<>();
        TrieNode node = root;
        for (char ch : prefix.toCharArray()) {
            if (!node.children.containsKey(ch)) return result;
            node = node.children.get(ch);
        }
        dfs(node, new StringBuilder(prefix), result);
        return result;
    }
    
    private void dfs(TrieNode node, StringBuilder path, List<String> result) {
        if (node.isWord) result.add(path.toString());
        for (char ch : node.children.keySet()) {
            dfs(node.children.get(ch), path.append(ch), result);
            path.deleteCharAt(path.length() - 1);
        }
    }
}
