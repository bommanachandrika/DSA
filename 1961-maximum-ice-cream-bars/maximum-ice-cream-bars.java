class Solution {
    public int maxIceCream(int[] costs, int coins) {
        int count=0;
        int sum=0;
        int max=0;
        Arrays.sort(costs);
        for(int i=0;i<costs.length;i++)
        {
            sum+=costs[i];
            if(sum>coins)
            {
                break;
            }
            count++;
        }
        return count;
    }
}