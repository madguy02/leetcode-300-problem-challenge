// https://leetcode.com/problems/find-the-punishment-number-of-an-integer/description/
class Solution {
    public int punishmentNumber(int n) {
        int sum = 0;
        for (int i=1;i<=n;i++) {
            int sqrt = i*i;
            if (punish(sqrt, i)) {
                sum +=sqrt;
            }
        }

        return sum;
    }

    public static boolean punish(int num, int target) {
        if(target < 0 || num < target){
                return false;
        }
        if (num == target) {
            return true;
        }

        return punish(num/10,target-num%10) || punish(num/100,target-num%100) || punish(num/1000,target-num%1000);
    }
}