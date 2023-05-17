// https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/
class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max_candies = 0;
        Boolean [] arr = new Boolean[candies.length];

        for (int i=0;i<candies.length;i++) {
            if (candies[i] > max_candies) {
                max_candies = candies[i];
            }
        }
        for (int i=0;i<candies.length;i++) {
            int val = candies[i] + extraCandies;
            if (val >= max_candies) {
                arr[i] = true;
            } else {
            arr[i] = false;
            }
        }

        return Arrays.asList(arr);
    }
}
