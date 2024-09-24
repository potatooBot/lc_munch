class Solution {
    public static void dfs(int cur,int n,List<Integer> ds){
        if(cur>n) return ;
        ds.add(cur);


        for(int i=0;i<=9;i++){
            if(cur * 10 +i >n) break ;
            dfs(cur *10+i,n,ds);
        }
    }
    public List<Integer> lexicalOrder(int n) {
        List<Integer> ds=new ArrayList<>();

        for(int i=1;i<=9;i++){
            dfs(i,n,ds);
        }
        return ds;
    }
}