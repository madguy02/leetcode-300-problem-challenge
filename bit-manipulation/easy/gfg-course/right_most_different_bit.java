// https://practice.geeksforgeeks.org/batch/gcl-19/track/DSASP-BitMagic/problem/rightmost-different-bit-1587115621

class Solution
{
    //Function to find the first position with different bits.
    public static int posOfRightMostDiffBit(int m, int n)
    {
            
        // Your code here  
        int [] val = convertToBinary(m);
        int [] val1 = convertToBinary(n);
        
        for (int i=0;i<val.length;i++) {
            if ((val[i]^val1[i]) !=0) {
                return i+1;
            }
        }
        
        return -1;
            
    }
    
    public static int[] convertToBinary(int n) {
        int [] binary = new int[35];
        int id = 0;
        
        while (n > 0) {
            binary[id++] = n%2;
            n = n/2;
        }
        
        return binary;
    }
    
}
