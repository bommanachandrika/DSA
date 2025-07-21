class Solution {
    public int maxProduct(int[] nums) {
        int ans=0;
        int n=nums.length;
        for(int i=0;i<n-1;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                int temp=(nums[i]-1) * (nums[j]-1);
                ans=Math.max(ans,temp);
            }
        }
        return ans;
    }
}