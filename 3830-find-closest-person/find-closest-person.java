class Solution {
    public int findClosest(int x, int y, int z) {
        int a=Math.abs(z-x);
        int b=Math.abs(z-y);
        int c=Math.min(a,b);
        if(a==b)
        {
            return 0;
        }
        if(c==a)
        {
            return 1;
        }
        return 2;
    }
}
