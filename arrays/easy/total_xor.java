// https://leetcode.com/problems/sum-of-all-subset-xor-totals

class Solution {
    int sum = 0;
    public int subsetXORSum(int[] nums) {
        totalXor(nums, 0,0);
        return sum;
    }

    public void totalXor(int[] nums, int prev, int start) {
            for (int i=start;i<nums.length;i++) {
                int t = prev ^ nums[i];
                sum +=t;

                totalXor(nums,t,i+1);
            }
    }
}