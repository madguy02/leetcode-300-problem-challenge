https://leetcode.com/problems/divide-array-into-equal-pairs/description/

class Solution {
    public boolean divideArray(int[] nums) {
        int count = 1;
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i=0;i<nums.length;i++) {
            if (hm.containsKey(nums[i])) {
                hm.put(nums[i], hm.get(nums[i])+1);
            } else {

            hm.put(nums[i], count);
            }
        }

        for (int i=0;i<nums.length;i++) {
            if (hm.get(nums[i]) % 2 != 0) {
                return false;
            }
        }

        return true;
    }
}