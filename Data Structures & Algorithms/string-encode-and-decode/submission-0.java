class Solution {

    public String encode(List<String> strs) {
        StringBuffer sb = new StringBuffer();
        for(String str : strs){
            sb.append(str.length()).append('#').append(str);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        int n = str.length();
        List<String> strs = new ArrayList<>();
        int i = 0;
        while(i<n){
            int j = i;
            while(str.charAt(j)!='#'){
                j++;
            }
            int length = Integer.parseInt(str.substring(i,j));
            i = j+1;
            String temp = str.substring(i, i+length);
            strs.add(temp);
            i = i + length;
        }
        return strs;
    }
}
