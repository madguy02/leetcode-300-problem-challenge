// https://practice.geeksforgeeks.org/batch/gcl-19/track/DSASP-BitMagic/problem/power-of-2-1587115620

class Solution{
    
    // Function to check if given number n is a power of two.
    public static boolean isPowerofTwo(long n){
        
        // Your code here
        if (n > 0) {
            return (n & (n-1))==0;
        }
        
        return false;
        
    }
    
}

/*
Logic:
1. if a number is power of 2 the MSB is set
2. if a number is not power of 2 MSB is not set
3. when we find the AND of n & n-1 if it returns 0, then the given
   number is power of 2 else not power of 2



*/