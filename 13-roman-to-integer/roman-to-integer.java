class Solution {
    public int romanToInt(String s) 
    {
        int result=0;
        int prevalue=0;
        for(int i=s.length()-1;i>=0;i--)
        {
            int value=getValue(s.charAt(i));
            if(value>=prevalue)
            {
                result=result+value;
            }
            else
            {
                result=result-value;
            }
            prevalue=value;
        }
        return result;
    }
    private static int getValue(char c)
    {
        switch(c)
        {
            case 'I':return 1;
            case 'V':return 5;
            case 'X':return 10;
            case 'L':return 50;
            case 'C':return 100;
            case 'D':return 500;
            case 'M':return 1000;
            default:return 0; 


        }
    }
}