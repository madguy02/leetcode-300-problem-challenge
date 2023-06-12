
// partially correct
// https://leetcode.com/problems/minimum-recolors-to-get-k-consecutive-black-blocks
class Solution {
    public int minimumRecolors(String blocks, int k) {
        int left = 0;
        int maxi = Integer.MAX_VALUE;
        int val = 0;

        for (int i=0;i<blocks.length()-k;i++) {
            if (blocks.charAt(i) == blocks.charAt(i+1)) {
                val++;
            }
            if (val == k) {
                return 0;
            }
        }
        for (int i=0;i<blocks.length();i++) {
            String s = blocks.substring(left, k);
            int count = 0;
            for (int j=0;j<s.length();j++) {
                if (s.charAt(j) == 'W') {
                    count++;
                }
            }
            maxi = Math.min(count, maxi);
        }

        return maxi;
        
    }
}

// correct solution!!