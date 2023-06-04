// https://leetcode.com/problems/intersection-of-two-arrays
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> container = new HashSet<>();
        HashSet<Integer> output = new HashSet<>();        

        for (int num:nums1){
            container.add(num);
        }
        for (int num:nums2){
            if (container.contains(num)){
                output.add(num);
            }
        }

        int[] outputArray = new int[output.size()];
        int index = 0;
        for (int x:output){
            outputArray[index] = x;
            index++;
        }

        return outputArray;
    }
}
