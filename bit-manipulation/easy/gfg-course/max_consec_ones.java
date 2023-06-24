// https://practice.geeksforgeeks.org/batch/gcl-19/track/DSASP-BitMagic/problem/longest-consecutive-1s-1587115620

class Solution{
    
    /*  Function to calculate the longest consecutive ones
    *   N: given input to calculate the longest consecutive ones
    */
    public static int maxConsecutiveOnes(int N) {
        int count = 0;
        while (N!=0) {
            N = (N &(N << 1));
            count++;
        }
        
        return count;
        
    }
    
}

/*
Logic:
1. Find N by N & N << 1
2. the number of times it takes to reach 0 is the count for consecutive 1's

*/