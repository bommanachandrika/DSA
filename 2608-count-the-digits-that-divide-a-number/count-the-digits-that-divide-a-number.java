class Solution {
    public int countDigits(int num) {
        String s=Integer.toString(num);
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            int digits=c-'0';
            if(num % digits==0)
            {

               
                count++;
            }
        }
        return count;
        
    }
}