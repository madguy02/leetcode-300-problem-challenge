// https://leetcode.com/problems/missing-number

// Not the optimal solution 

class Solution {
    public int missingNumber(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        int count=1;
        Arrays.sort(nums);
        if (nums[0] != 0) {
            return 0;
        }
        for (int i=1;i<nums.length;i++) {
            if (count == nums[i]){
                hm.put(nums[i], i);
            }
            if(nums[i] != count) {
                return count;
            }

            count++;
        }

        return nums.length;

    }
}