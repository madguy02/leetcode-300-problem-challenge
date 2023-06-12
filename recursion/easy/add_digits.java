// https://leetcode.com/problems/add-digits/description/
class Solution {
    public int addDigits(int num) {
        String s = String.valueOf(num);
        
        if (s.length() == 1) {
            return Integer.parseInt(s);
        }
        
        int sum =  num%10 + addDigits(num/10);
        return addDigits(sum/10) + sum%10;
    }
}