// https://leetcode.com/problems/contains-duplicate-ii/

class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashSet<Integer> hs = new HashSet();


        for (int sd=0;sd<k && sd < nums.length;sd++) {
            if (hs.contains(nums[sd])) {
                return true;
            }

            hs.add(nums[sd]);
        }

        for (int i=k;i<nums.length;i++) {
            if (hs.contains(nums[i])) {
                return true;
            }

            hs.add(nums[i]);
            hs.remove(nums[i-k]);
        }

        return false;
    }
}