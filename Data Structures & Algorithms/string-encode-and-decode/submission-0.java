class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for(String str: strs){
            sb.append(str);
            sb.append("π");
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        String[] decodedStrings = str.split("π",-1);
        return new ArrayList<>(Arrays.asList(decodedStrings).subList(0,decodedStrings.length-1));
    }
}
