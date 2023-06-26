// https://leetcode.com/problems/hamming-distance/
class Solution {
    public int hammingDistance(int x, int y) {
        int[] val1 = convertToBinary(x);
        int [] val2 = convertToBinary(y);
        int count = 0;
        for (int i=0;i<val1.length;i++) {
            if ((val1[i] ^ val2[i]) != 0) {
                count++;
            }
        }

        return count;
    }

    public static int[] convertToBinary(int x) {
        int id = 0;
        int [] arr = new int[35];

        while (x > 0) {
            arr[id++] = x%2;
            x=x/2;
        }

        return arr;
    }
}