import java.math.BigInteger;
class Solution {
    public String multiply(String num1, String num2) {
        BigInteger arr1=new BigInteger(num1);
        BigInteger arr2=new BigInteger(num2);
        BigInteger result=arr1.multiply(arr2);
        String res=result.toString();
       return res;
    }
}