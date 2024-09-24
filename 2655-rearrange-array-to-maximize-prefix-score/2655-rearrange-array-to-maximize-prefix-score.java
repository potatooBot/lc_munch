class Solution {
    public int maxScore(int[] nums) {
List<Integer> ds=new ArrayList<>();
for(int ele:nums)
 ds.add(ele);
 Collections.sort(ds,Collections.reverseOrder());
        int ans=0;
        long sum=0;
        for(int ele:ds){
            sum=sum+ele;
            if(sum>0) ans++;
        }
        return ans;
            }
}