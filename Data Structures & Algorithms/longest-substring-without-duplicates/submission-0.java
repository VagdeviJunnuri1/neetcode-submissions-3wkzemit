class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int l = 0, res = 0;
        Set<Character> set = new HashSet<>();
        for(int r = 0;r<n;r++){
            char c = s.charAt(r);
            while(set.contains(c)){
                set.remove(s.charAt(l));
                l++;
            }
            set.add(c);
            res = Math.max(res, r-l+1);
        }
        return res;
    }
}
