// https://leetcode.com/problems/find-the-prefix-common-array-of-two-arrays
class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
     int ans[] = new int[A.length];

     HashSet<Integer> hs = new HashSet<Integer>();
     for (int i=0;i<A.length;i++) {
         int count = 0;
         for (int n=i;n>=0;n--) {
             System.out.println(n);
             hs.add(A[n]);
         }

         for (int n=i;n>=0;n--) {
             if (hs.contains(B[n])) {
                 count++;
             }
         }

         ans[i] = count;
     }  
     return ans; 
    }
}