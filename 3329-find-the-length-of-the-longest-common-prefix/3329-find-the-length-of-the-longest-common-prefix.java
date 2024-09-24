class Node{
    Node links[];
    int cntStart;
    Node(){
        links=new Node[10];
        cntStart=0;

    }
    public void put(char ch,Node node){
        links[ch-'0']=node;
    }
    public Node get(char ch){
        return links[ch-'0'];

    }
    public void increaseStart(){
        cntStart++;
    }
    public boolean containsKey(char ch){
        return links[ch-'0']!=null;
    }
}

class Solution{
    private Node root;
    Solution (){
        root=new Node();

    }

    public void insert(String s){
        Node node=root;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(!node.containsKey(ch)){
               node.put(ch,new Node());
            }
            node=node.get(ch);
            node.increaseStart();
        }
    }

    public int startWith(String s){
        Node node=root;
        int cnt=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(node.containsKey(ch)){
                node=node.get(ch);
            cnt++;
            }
            else{
                return cnt;
            }
        }
    return cnt;
    }
    public int longestCommonPrefix(int[] arr1, int[] arr2) {
        Solution trie=new Solution();
for(int ele: arr1){
    String s=String.valueOf(ele);
    trie.insert(s);
}


int ans=0;


for(int ele:arr2){
    String s=String.valueOf(ele);
int val=trie.startWith(s);
ans=Math.max(ans,val);
    }

return ans;
    }
}