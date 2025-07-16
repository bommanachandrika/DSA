class Solution {
    public int longestOnes(int[] nums, int k) {
        int temp=0;
        int ans=0;
        int j=0;
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
            if(nums[i]==0)
            {
                temp++;
            }
            while(temp>k)
            {
                if(nums[j]==0)
                {
                    temp--;
                }
                j++;
            }
            ans=Math.max(ans,i-j+1);
        }
        return ans;
        
    }
}