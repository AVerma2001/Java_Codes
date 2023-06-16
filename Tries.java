import java.util.*;
public class Tries{
    static class Node{
        Node children[] = new Node[26];
        boolean eow = false;
        Node(){
            for(int i = 0;i<26;i++){
                children[i] = null;
            }
        }

    }
    public static Node root = new Node();

    public static void Insert(String word){ //O(L)
        Node curr= root;
        for(int level = 0;level<word.length();level++){
            int idx = word.charAt(level)-'a'; // finding the index of current character in the children array
            if(curr.children[idx] == null){ // if that index is empty then add new Node
                curr.children[idx] = new Node();
            }
            curr = curr.children[idx];
        }
        curr.eow = true;
    }

    public static boolean Search(String key){
        Node curr =root;
        for(int level=0;level<key.length();level++){
            int idx = key.charAt(level)-'a';
            if(curr.children[idx] == null){
                return false;
            }
            curr = curr.children[idx];
        }
        return curr.eow == true;
    }

    ///// Word Break Problem /////
    public static boolean wordBreak(String key){
        if(key.length() == 0){
            return true;

        }
        for(int i=1;i<=key.length();i++){
            if(Search(key.substring(0, i)) && wordBreak(key.substring(i))){
                return true;

            }
        }
        return false;
    }

    ///// Starts with Prefix /////
    public static boolean startsWith(String prefix){
        Node curr = root;
        for(int i=0;i<prefix.length();i++){
            int idx = prefix.charAt(i)-'a';
            if(curr.children[idx] == null){
                return false;
            }
            curr = curr.children[idx];
        }
        return true;
    }


    public static void main(String args[]){
        String words[] = {"apple","app","woman","mango","man"};

        String prefix1 = "app";
        String prefix2 = "moon";

        // inserting in a trie
        for(int i=0;i<words.length;i++){
            Insert(words[i]);
        }
        System.out.println(startsWith((prefix1)));
        System.out.println(startsWith((prefix2)));

        // String key = "ilikesamsung";
        // System.out.println(wordBreak(key));
        // System.out.println(Search("thee"));
        // System.out.println(Search("thor"));
        // System.out.println(Search("an"));

    }
}