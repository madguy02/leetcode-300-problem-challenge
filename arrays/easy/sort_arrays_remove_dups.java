// https://leetcode.com/problems/remove-duplicates-from-sorted-array
// This will pass partially

class Solution {
    public int removeDuplicates(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        int j = 0;
        int len = nums.length;
        for (int i=0;i<nums.length;i++) {
            if (!hm.containsKey(nums[i])) {
                hm.put(nums[i], j);
                j++;
            }
        }
        int k = 0;
        Set<Integer> keys = hm.keySet();
        for(Integer key: keys){
            nums[k] = key;
            ++k;
        }

        return k+1;
        
    }
}

// complete solution

class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 0;

        for (int j=1;j<nums.length;j++) {
            if (nums[i] != nums[j]) {
                i++;
                nums[i] = nums[j];
            }
        }

        return i+1;
        
    }
}
