// https://leetcode.com/problems/pascals-triangle-ii/
class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> out= new ArrayList<List<Integer>>();
        List<Integer>prev = new ArrayList<Integer>();

        if (rowIndex <0) {
            return prev;
        }

        prev.add(1);
        out.add(prev);

        for (int i=1;i<=rowIndex;i++) {
            List<Integer> cur = new ArrayList<Integer>();
            cur.add(1);
            for (int j=0;j<prev.size()-1;j++) {
                cur.add(prev.get(j)+prev.get(j+1));
            }

            cur.add(1);
            if (i==rowIndex) {
                return cur;
            }

            out.add(cur);
            prev = cur;
        }

        return prev;



    }
}