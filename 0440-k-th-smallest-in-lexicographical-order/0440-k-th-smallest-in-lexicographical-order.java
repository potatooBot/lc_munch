class Solution {

public static long count(long cur,long next,int n){
long countNum=0;

while(cur<=n){
    countNum=countNum+(next-cur);
    cur=cur*10;
    next=next*10;
    next=Math.min(next,(long)n+1);

}
return countNum;
}
    public int findKthNumber(int n, int k) {


        long cur=1;
        k--;
        while(k>0){
            long countNum=count(cur,cur+1,n);
            if(countNum<=k){
                cur++;
                k=k-(int)countNum;
            }
            else {
cur=cur*10;
k--;
            }
        }

        return (int)cur;
    }
}