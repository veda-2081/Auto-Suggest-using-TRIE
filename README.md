# 🌐 Auto-Suggest using TRIE

## 📌 Project Description

This project implements an **Auto-Suggestion System** using the **TRIE (Prefix Tree)** data structure in Java. It supports efficient insertion, word search, and auto-completion of words based on a given prefix. TRIE is a powerful tool for string manipulation and is widely used in real-world applications such as autocomplete, spell-checking, and IP routing.

---

## 🧩 Features

- 🔤 Insert words into the TRIE
- 🔍 Search for exact word match
- ✨ Auto-suggest words from a given prefix
- 🚀 Optimized DFS traversal for suggestion generation

---

## 🛠️ Core Operations

### ✅ insert(String word)
Adds a word character by character into the TRIE.

### ✅ search(String word)
Checks if a word exists in the TRIE.

### ✅ autoSuggest(String prefix)
Returns a list of all words in the TRIE that begin with the specified prefix.

---

## 📄 Trie.java Overview

```java
Trie trie = new Trie();

trie.insert("apple");
trie.insert("app");
trie.insert("application");

System.out.println(trie.search("app"));        // true
System.out.println(trie.autoSuggest("ap"));    // [app, apple, application]
System.out.println(trie.autoSuggest("bat"));   // []
📁 File Structure
├── .gitignore           # Git ignored files
├── LICENSE              # Open-source license (MIT recommended)
├── README.md            # Project documentation
├── Trie.java            # Complete TRIE implementation
💡 Real-World Applications of TRIE
🔎 Autocomplete systems (Google search, IDEs, mobile keyboards)

📝 Spell-checking

📡 IP routing (longest prefix match)

📚 Search engines and dictionaries

🧬 DNA sequence analysis
📄 License
This project is licensed under the MIT License.
See the LICENSE file for more information.

🙌 Contributions
Pull requests and suggestions are welcome!
If you find a bug or want to improve this project, feel free to fork and contribute.


---

Let me know if you want a `.gitignore` template (for Java) or a default `LICENSE` file (MIT/Apache/etc.) as well.
