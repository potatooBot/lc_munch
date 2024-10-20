class Node{
    Node [] links=new Node[26];
    int cntPrefix=0;


    public Node get(char ch){
        return links[ch-'a'];
    }
    public boolean contains(char ch){
        return links[ch-'a']!=null;
    }
    public void put(char ch,Node node){
        links[ch-'a']=node;
    }
    public void inc(char ch) {
        links[ch - 'a'].cntPrefix++;
    }
    public int retCount(char ch){
        return links[ch-'a'].cntPrefix;
    }

}
class Trie{
    static private Node root;
    Trie(){
        root=new Node();

    }
    public static void insert(String word){
        Node node=root;
        for (int i = 0; i <word.length() ; i++) {
            if(!node.contains(word.charAt(i))){
                node.put(word.charAt(i),new Node());
            }
            node.inc(word.charAt(i));
            node=node.get(word.charAt(i));

        }
    }
    public static int startsWith(String word){
        Node node=root;
int pref=0;
        for (int i = 0; i <word.length() ; i++) {
            if(node.contains(word.charAt(i))){
                pref=pref+node.retCount(word.charAt(i));
                node=node.get(word.charAt(i));
            }

        }
        return pref;
    }
}
class Solution {
     public static int[] sumPrefixScores(String[] words) {
       Trie trie=new Trie();
        for (String word:
             words) {
            trie.insert(word);
        }

        ArrayList<Integer> ds=new ArrayList<>();
        HashMap<String,Integer> map=new HashMap<>();
        for (String str:
             words) {
            String ele=str;
            ds.add(trie.startsWith(ele));

        }
        int res[]=new int[ds.size()];
        for (int i = 0; i <ds.size() ; i++) {
            res[i]=ds.get(i);
        }
        return res;
    }
}