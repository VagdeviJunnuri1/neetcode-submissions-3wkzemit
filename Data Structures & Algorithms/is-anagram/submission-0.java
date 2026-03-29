class Solution {
    public boolean isAnagram(String s, String t) {
        char[] chArr_s = s.toCharArray();
        char[] chArr_t = t.toCharArray();
        Arrays.sort(chArr_s);
        String s1 = new String(chArr_s);
        Arrays.sort(chArr_t);
        String s2 = new String(chArr_t);
        if(s1.equals(s2)){
            return true;
        }else{
            return false;
        }
    }
}
