// https://leetcode.com/problems/longest-common-prefix/
class Solution {
    public String longestCommonPrefix(String[] strs) {
        String pref = strs[0];
        for (int i=1;i<strs.length;i++) {
            while (strs[i].indexOf(pref) != 0) {
                pref = pref.substring(0, pref.length()-1);
            }

            if (pref.isEmpty()) {
                break;
            }
        }

        return pref;
    }

    
}

/*
Logic for this pattern:
1. store the first element
2. loop from second element
3. if the first element is not found using indexOf , it will return -1
4. which is not equal to 0
5. add it to prefix again, but reducing 1 character
6. continue this until, we find the prefix, else return empty string


*/
