class Solution {


    static void backtrack(int start, String s, List<String> path,boolean ans[],int n ) {
       
        if (start == s.length()) {
        int sum=0;

        for(String ele:path ) sum=sum+ Integer.parseInt(ele);

        if(sum==n) 
        {
             ans[0]=true;
        }
            return;
        }
        for (int end = start + 1; end <= s.length(); end++) {
            path.add(s.substring(start, end));
            backtrack(end, s, path, ans,n);
            path.remove(path.size() - 1);
        }
    }
    public int punishmentNumber(int n) {
        int sum=0;
        for(int i=1;i<=n;i++){


    boolean ans[]=new boolean[1];
    backtrack(0,String.valueOf((int)Math.pow(i,2)),new ArrayList<>(),ans,i);
if(ans[0]==true){
    sum=sum+   (int)Math.pow(i,2);

}
        }
        return sum;
    }
}