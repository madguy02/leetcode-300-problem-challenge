// https://leetcode.com/problems/semi-ordered-permutation
// This solution does not pass all test cases, but an attempt to solve

class Solution {
    public int semiOrderedPermutation(int[] nums) {
        int count = 0;
        int [] arr = new int[nums.length];
        if (nums[0] == 1  && nums[nums.length-1] == nums.length) {
            return 0;
        }
        for (int i=0;i<nums.length;i++) {
            arr[i] = nums[i];
        }
        
        Arrays.sort(arr);
        for (int j=0;j<nums.length;j++) {
            if (arr[j] != nums[j]) {
                int index = search(nums, arr[j]);;
                int temp = nums[j];
                nums[j] = nums[index];
                nums[index] = temp;
                count++;
            }
        }
        
        return count;
        
        
    }
    
    public static int search(int[] nums, int elem) {
        for (int i=0;i<nums.length;i++) {
            if (nums[i] == elem) {
                return i;
            }
        }
        
        return 0;
    }
}

// Solution

class Solution {
    public int semiOrderedPermutation(int[] nums) {
        int f = 0;
        int l = 0;
        int n = nums.length;

        for (int i=0;i<n;i++) {
            if (nums[i] == 1) {
                f = i;
            }
            if (nums[i] == n) {
                l = i;
            }
        }

        int min = 0;
        if (f < l) {
            min = (f + (n-l-1));
        } else {
            min = (f + (n-l-2));
        }

        return min;
    }
}