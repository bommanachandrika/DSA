class Solution {
    public int buyChoco(int[] prices, int money) {
        int n=prices.length;
        int sum=0;
        Arrays.sort(prices);
            sum=prices[0]+prices[1];
            if(sum<money)
            {
            return money-sum;
        }
        else if(sum-money==0)
        {
            return 0;
        }

        return money;
    }
}