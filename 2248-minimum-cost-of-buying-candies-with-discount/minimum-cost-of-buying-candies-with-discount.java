class Solution {
    public int minimumCost(int[] cost) {
        Arrays.sort(cost);
        int ans=0;
        int temp=0;
        for (int i=cost.length-1;i>=0;i--)
        {
            if(temp==2)
            {
                temp=0;
            }
            else
            {
                ans=ans+cost[i];
                temp++;
            }
        }
        return ans;
        
    }
}