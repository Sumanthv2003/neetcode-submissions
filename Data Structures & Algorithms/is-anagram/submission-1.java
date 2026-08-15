class Solution {
    public boolean isAnagram(String s, String t) {
        s = s.toUpperCase();
        t = t.toUpperCase();
        int n1 = s.length();
        int n2 = t.length();
        if(n1 !=n2){
            return false;
        }

        int[] result = new int[26];
        for(int i=0; i<n1; i++){
            result[s.charAt(i) - 'A'] +=1;
        }
        for(int i=0; i<n2; i++){
            result[t.charAt(i) - 'A'] -=1;
        }
        for(int num: result){
            if(num != 0){
                return false;
            }
        }
        return true;
    }
}
