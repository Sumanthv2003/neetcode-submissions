class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxlength = 0;
        //BRUTEeee
        // for(int i=0;i<s.length();i++){
        //     Set<Character> charSet = new HashSet<>();
        //     for(int j=i;j<s.length();j++){
        //         if(charSet.contains(s.charAt(j))){
        //             break;
        //         }
        //         charSet.add(s.charAt(j));
        //     }
        //     maxlength = Math.max(maxlength, charSet.size());
        // }

        //OPTIMAL
        int left = 0, right = 0;
        Map<Character, Integer> mp = new HashMap<>();
        while(right<s.length()){
            if(mp.containsKey(s.charAt(right))){
                left = Math.max(left, mp.get(s.charAt(right))+1);
            }
            mp.put(s.charAt(right), right);
            maxlength = Math.max(maxlength, right-left+1);
            right++;
        }
        return maxlength;
    }
}
