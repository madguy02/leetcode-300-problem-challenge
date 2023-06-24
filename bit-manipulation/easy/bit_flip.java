// https://leetcode.com/problems/minimum-bit-flips-to-convert-number/

class Solution {
    public int minBitFlips(int start, int goal) {
        if (start == goal) {
            return 0;
        }

        int xor = start ^ goal;
        int count = 0;

        while (xor > 0) {
            xor = xor & (xor-1);
            count++;
        }

        return count;
    }
}