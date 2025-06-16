class Solution {
    public int lengthOfLastWord(String s) {
        s=s.trim();
        int lengthOfLastWord=s.lastIndexOf(' ');
        return s.length()-lengthOfLastWord-1;
        
    }
}