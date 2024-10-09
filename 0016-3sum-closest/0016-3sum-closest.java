class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);

int close=0;

close=nums[0]+nums[1]+nums[2];
for(int i=0;i<nums.length-2;i++){
int low=i+1;
int high=nums.length-1;

while(low<high){
    int sum=nums[i]+nums[low]+nums[high];
if(sum==target) return sum;
    if(Math.abs(target-sum)<Math.abs(target-close)){
close=sum;
    }
if(sum>target){
    high--;
}
else if(sum<target){
    low++;
}

}
}
return close;
    }
}