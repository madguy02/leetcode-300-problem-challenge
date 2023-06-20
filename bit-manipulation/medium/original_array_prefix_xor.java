// https://leetcode.com/problems/find-the-original-array-of-prefix-xor/description/

// solution: a^b = a^c in case of abc, if we want to find the value in any case

class Solution {
    public int[] findArray(int[] pref) {
        int [] arr = new int [pref.length];
        arr[0] = pref[0];
        for (int i=0;i<pref.length-1;i++) {
            int val = pref[i] ^ pref[i+1];
            arr[i+1] = val;
        }

        return arr;
    }
}