class Solution {
    public int characterReplacement(String s, int k) {
        int n = s.length();
        int res = 0;
        for(int i = 0;i<n;i++){
            Map<Character,Integer> map =new HashMap<>();
            int maxF = 0;
            for(int j=i;j<n;j++){
                map.put(s.charAt(j), map.getOrDefault(s.charAt(j),0)+1);
                maxF = Math.max(maxF, map.get(s.charAt(j)));
                if((j-i+1)-maxF<=k){
                    res = Math.max(res,j-i+1);
                }
            }
        }
        return res;
    }
}
