// https://leetcode.com/problems/split-a-string-in-balanced-strings

class Solution {
    public int balancedStringSplit(String s) {
        int count = 0;
        int vl = 0;
        int rl=0;
        for (int i=0;i<s.length();i++) {
            if (s.charAt(i) == 'R') {
                vl++;
            } else {
                rl++;
            }

            if (vl == rl) {
                count++;
            }
        }

        return count; 
    }
}