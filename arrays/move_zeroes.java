// https://leetcode.com/problems/move-zeroes/description/
// sub optimal solution with extra space of O(N)

class Solution {
    public void moveZeroes(int[] nums) {
        int j = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] != 0){
                nums[j] = nums[i];
                j++;
            }
        }
        while(j < nums.length){
            nums[j] = 0;
            j++;
        }           
    }
}

// optimal solution without extra space O(1)

class Solution {
    public void moveZeroes(int[] nums) {
        int zeros = 0;
        int j =0;
        for (int i=0;i<nums.length;i++) {
            if (nums[i] == 0) {
                zeros +=1;
            }
        }

        for (int i=0;i<nums.length;i++) {
            if (nums[i] != 0) {
                nums[j] = nums[i];
                j++;
            }
        }

        while (zeros-- > 0) {
            nums[j] = 0;
            j++;
        }
    }
}
