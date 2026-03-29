class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for(String str: strs){
            char[] chArr = str.toCharArray();
            Arrays.sort(chArr);
            String sorted_s = new String(chArr);
            map.putIfAbsent(sorted_s, new ArrayList<>());
            map.get(sorted_s).add(str);
        }
        return new ArrayList<>(map.values());
    }
}
