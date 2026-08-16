class Solution {
    public boolean isPalindrome(String s) {
        StringBuffer sb = new StringBuffer();
        s = s.toLowerCase();
        for(int i=0;i<s.length();i++){
            if(Character.isDigit(s.charAt(i)) || Character.isLetter(s.charAt(i))){
                sb.append(s.charAt(i));
            }
        }
        int n= sb.length();
        for(int i=0;i<n/2;i++){
            if(sb.charAt(i)!=sb.charAt(n-i-1)){
                return false;
            }
        }
        return true;
    }
}
