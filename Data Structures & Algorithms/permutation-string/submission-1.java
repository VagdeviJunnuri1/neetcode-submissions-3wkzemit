class Solution {
    public boolean checkInclusion(String s1, String s2) {
        char[] chArr1 = s1.toCharArray();
        Arrays.sort(chArr1);
        String sortedS1 = new String(chArr1);
        for(int i=0;i<s2.length();i++){
            for(int j=i;j<s2.length();j++){
                if(j>=s1.length()-1){
                    char[] chArr2 = s2.substring(i,j+1).toCharArray();
                    Arrays.sort(chArr2);
                    String sortedS2 = new String(chArr2);
                    if(sortedS1.equals(sortedS2)){
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
