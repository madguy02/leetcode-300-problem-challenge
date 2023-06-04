// https://leetcode.com/problems/check-if-array-is-sorted-and-rotated/submissions/953110929/

public class Solution {
    public boolean check(int[] nums) {
        int x = 0;
        int y = 0;
        for (int i=1;i<nums.length;i++) {
            if (nums[i-1] <= nums[i]) {
                ++x;
            } else {
                ++y;
            }
        }
        if (nums[nums.length-1] > nums[0]) {
            ++y;
        }

        if (y==0) {
            return true;
        }

        return y ==1;
    }

}


/* Algorithm:
1. Take two variables x and y
2. if previous element is smaller than current element increment x
3. if previous element is greater than current element increment y
4. if the last element is greater than first element increment y else increment x
5. return true if y == 1 else false


*/
