class Solution {
    public int findMaxK(int[] nums) {
        int ans=-1;
        ArrayList<Integer> ds=new ArrayList<>();
        for(int ele:nums) ds.add(ele);
        for(int ele:nums){
if(ele<0&&ds.contains(Math.abs(ele))){
    ans=Math.max(ans,Math.abs(ele));
}
        }
        return ans;
    }
}