class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int ans=0;
        for(int i=0;i<nums.length;i=i+2)
        {
            int temp=Math.min(nums[i],nums[i+1]);
            ans=ans+temp;
        }
        return ans;
        
    }
}