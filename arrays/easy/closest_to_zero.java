// https://leetcode.com/problems/find-closest-number-to-zero
class Solution {
    public int findClosestNumber(int[] nums) {
        int closest = Integer.MAX_VALUE;
        int diff = Integer.MAX_VALUE;
        ArrayList<Integer> list = new ArrayList<Integer>();

        if (nums.length ==1) {
            return nums[0];
        }   

        for (int i=0;i<nums.length;i++) {
            int v = Math.abs(nums[i] - 0);
            diff = Math.min(diff, v);
        }

        for (int i=0;i<nums.length;i++) {
            if (Math.abs(nums[i])-diff == 0) {
                list.add(nums[i]);
            }
        }
        Collections.sort(list);
        System.out.println(list);

        return list.get(list.size()-1);

    }
}


class Solution {
    public int findClosestNumber(int[] nums) {
        int min=Integer.MAX_VALUE;
        int res=0;
        for(int i=0;i<nums.length;i++){
            if(Math.abs(nums[i])< min || nums[i]== Math.abs(min) ){
                min=Math.abs(nums[i]);
                res=nums[i];

            } 
        }
        return res;
    }
}