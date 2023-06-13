// https://leetcode.com/problems/find-the-winner-of-the-circular-game/

class Solution {
    public int findTheWinner(int n, int k) {
        return myJos(n, k) + 1;
    }

    public static int myJos(int n, int k) {
        if(n==1) {
            return 0;
        }

        return (myJos(n-1, k) + k)%n;
    }
}