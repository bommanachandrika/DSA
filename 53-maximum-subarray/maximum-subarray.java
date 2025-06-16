class Solution {
    public int maxSubArray(int[] nums) {
        int sum=nums[0];
        int total=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            total=Math.max(nums[i],total+nums[i]);
            sum=Math.max(sum,total);
        }
        return sum;
        
        
    }
}