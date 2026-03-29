class Solution {
    public boolean isAnagram(String s, String t) {
        char[] chArr_s = s.toCharArray();
        char[] chArr_t = t.toCharArray();
        Arrays.sort(chArr_s);
        Arrays.sort(chArr_t);
        return Arrays.equals(chArr_s,chArr_t);
    }
}
