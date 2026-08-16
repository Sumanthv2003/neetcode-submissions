class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxlength = 0;
        for(int i=0;i<s.length();i++){
            Set<Character> charSet = new HashSet<>();
            for(int j=i;j<s.length();j++){
                if(charSet.contains(s.charAt(j))){
                    break;
                }
                charSet.add(s.charAt(j));
            }
            maxlength = Math.max(maxlength, charSet.size());
        }
        return maxlength;
    }
}
