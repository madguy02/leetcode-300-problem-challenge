// O(N) solution
// https://leetcode.com/problems/single-number

class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int count = 1;

        for (int i=0;i<nums.length;i++) {
            if (hm.containsKey(nums[i])) {
                hm.put(nums[i], hm.get(nums[i]) + count);
            } else {
                hm.put(nums[i], count);
            }
        }

        for (int i=0;i<nums.length;i++) {
            if (hm.get(nums[i]) == 1) {
                return nums[i];
            }
        }

        return -1;
    }
}

// O(1)

class Solution {
    public int singleNumber(int[] nums) {
        int val = nums[0];
        for (int i=1;i<nums.length;i++) {
            val = val ^ nums[i];
        }

        return val;
    }
}