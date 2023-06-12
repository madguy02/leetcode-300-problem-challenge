class Solution {
    public int countGoodSubstrings(String s) {
        int count = 0;

        int left=0;
        int right = 2;
        for (int i=1;i<s.length()-1;i++) {
            if (s.charAt(i) != s.charAt(right) && s.charAt(i) != s.charAt(left) 
            && s.charAt(left) != s.charAt(right)) {
                count++;
            }
            left++;
            right++;
        }
        return count;
    }

}