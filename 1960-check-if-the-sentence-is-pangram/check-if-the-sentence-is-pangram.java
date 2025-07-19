class Solution {
    public boolean checkIfPangram(String sentence) {
        sentence=sentence.toLowerCase();
        for(char ch='a';ch<='z';ch++)
        {
            if(sentence.indexOf(ch)==-1)
            {
                return false;
               
            }
        }
        return true;
    }
}