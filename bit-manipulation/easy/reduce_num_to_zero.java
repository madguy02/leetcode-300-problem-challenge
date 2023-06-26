// https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/
class Solution {
    public int numberOfSteps(int num) {
        int count = 0;
        while (num > 0) {
            if (num %2 ==0) {
                num = num >> 1;
                count++;
            } else {
                num = num-1;
                count++;
            }

        }

        return count;
    }
}