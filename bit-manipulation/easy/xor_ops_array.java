// https://leetcode.com/problems/xor-operation-in-an-array/

class Solution {
    public int xorOperation(int n, int start) {
        int [] arr = new int[n];
        int xor_sum = 0;
        for (int i=0;i<n;i++) {
            arr[i] = start + (2*i);
            xor_sum ^= arr[i];
        }

        return xor_sum;
    }
}