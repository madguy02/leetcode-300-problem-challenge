// unoptimized solution O(n^2)
// https://leetcode.com/problems/word-break/
// fails for test cases
class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        int count = 0;
        for (int i=0;i<s.length();i++) {
            for (int j=i+1;j<s.length();j++) {
                String str = s.substring(i,j);

                System.out.println(str);

                if (wordDict.contains(str)) {
                    count++;
                }
            }
        }

        if (count == wordDict.size()) {
            return true;
        }

        return false;
    }
}

// correct but not optimized solution

class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
      boolean[] word_Marker = new boolean[s.length() + 1];
        word_Marker[0] = true;
        for(int i=0; i<=s.length(); i++){
            for(int j=0; j<i; j++){
                if(word_Marker[j] && wordDict.contains(s.substring(j,i))){
                    word_Marker[i] = true;
                    break;
                }
            }
        }
        return word_Marker[s.length()];
    }
}