// https://leetcode.com/problems/jewels-and-stones
// O(n)
class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        HashMap<String, Integer> hm = new HashMap<>();
        int count = 0;
        for (int i=0;i<jewels.length();i++) {
            String s = String.valueOf(jewels.charAt(i));
            hm.put(s, 1);
        }

        for (int i=0;i<stones.length();i++) {
            String s = String.valueOf(stones.charAt(i));
            if (hm.containsKey(s)) {
                count++;
            }
        }

        return count;
    }
}