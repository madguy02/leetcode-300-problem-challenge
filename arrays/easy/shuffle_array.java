// https://leetcode.com/problems/shuffle-the-array/
class Solution {
    public int[] shuffle(int[] nums, int n) {
        HashMap<Integer, Integer>map1 = new HashMap();
        HashMap<Integer, Integer>map2 = new HashMap();

        int [] ans = new int [n*2];

        for(int i=0;i<n;i++) {
            map1.put(i, nums[i]);
            map2.put(i, nums[i+n]);
        }
        for (int i=0;i<n;i++) {
            ans[i*2] = map1.get(i);
            ans[(2*i) + 1] = map2.get(i);
        }

        

        return ans;
    }
}