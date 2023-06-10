class Solution {
    public int divisorSubstrings(int num, int k) {
        String s = String.valueOf(num);
        int left = 0;
        int right = 1;
        int count = 0;
        for (int i=k;i<=s.length();i++) {
           int divisor = Integer.parseInt(s.substring(left, i));
           if (divisor != 0 && num % divisor == 0) {
               count++;
           }
           left++;
        }

        return count;
    }
}