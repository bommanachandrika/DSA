class Solution {
    public int subtractProductAndSum(int n) {
        int product=1;
        int sum=0;
        while(n>0)
        {
            int add=n%10;
            sum+=add;
            product*=add;
            n=n/10;
        }
        return product-sum;
        
    }
}