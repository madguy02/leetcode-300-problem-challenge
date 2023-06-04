// https://leetcode.com/problems/concatenation-of-array/description/

class Solution {
    public int[] getConcatenation(int[] nums) {
        int length = 2 * nums.length;
        int [] ans = new int [length];

        for (int i=0;i<nums.length;i++) {
            ans[i] = nums[i];
            ans[i+nums.length] = nums[i];
        }


        return ans;

    }
}
