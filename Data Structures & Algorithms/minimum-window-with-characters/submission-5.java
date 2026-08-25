class Solution {
    public String minWindow(String s, String t) {
        if(s==null||t==null||s.length()<t.length()){
            return "";
        }
        Map<Character,Integer> targetmap = new HashMap<>();
        Map<Character, Integer> window = new HashMap<>();
        int res[] = {-1, -1}, l = 0, have = 0, minlength = Integer.MAX_VALUE;

        for(char c: t.toCharArray()){
            targetmap.put(c, targetmap.getOrDefault(c,0)+1);
        }
        int need = targetmap.size();
        for(int r=0; r<s.length(); r++){
            char c = s.charAt(r);
            window.put(c, window.getOrDefault(c,0)+1);

            if(targetmap.containsKey(c) && window.get(c).equals(targetmap.get(c))){
                have++;
            }

            while(have==need){
                if(minlength > (r-l+1)){
                    minlength = r-l+1;
                    res[0] = l;
                    res[1] = r;
                }
                char leftchar = s.charAt(l);
                window.put(leftchar, window.get(leftchar)-1);
                if(targetmap.containsKey(leftchar) && window.get(leftchar)<(targetmap.get(leftchar))){
                    have--;
                }
                l++;
            }
        }
        return minlength == Integer.MAX_VALUE ? "" : s.substring(res[0], res[1]+1);
    }
   
}
