class Solution {
    public boolean canAliceWin(int[] nums) {
        int sum=0;
        int total=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]<10)
            {
                sum+=nums[i];
            }
        }
        for(int j=0;j<nums.length;j++)
        {
            if(nums[j]>=10)
            {
                total+=nums[j];
            }
        }
        if(sum==total)
        {
            return false;

        }
        return true;
    }
}