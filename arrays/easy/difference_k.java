// https://leetcode.com/problems/count-number-of-pairs-with-absolute-difference-k
class Solution {
    public int countKDifference(int[] nums, int k) {
        int count = 0;
        for (int i=0;i<nums.length-1;i++) {
            if (Math.abs(nums[i] - nums[i+1]) == k) {
                count ++;
            }
        }

        return count;
    }
}
