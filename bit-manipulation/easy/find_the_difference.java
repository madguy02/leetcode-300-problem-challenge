// https://leetcode.com/problems/find-the-difference/
class Solution {
    public char findTheDifference(String s, String t) {
        int sum = 0;
        int sum2 = 0;
        for (int i=0;i<s.length();i++) {
            sum += (int)s.charAt(i);
        }
        for (int i=0;i<t.length();i++) {
            sum2 += (int)t.charAt(i);
        }

        char diff = (char)Math.abs(sum-sum2);

        return diff;
    }
}