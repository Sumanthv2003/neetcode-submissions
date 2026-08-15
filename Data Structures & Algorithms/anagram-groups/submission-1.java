class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> mp = new HashMap<>();
        for(String str : strs){
            char[] ch = str.toCharArray();
            Arrays.sort(ch);
            String keys = String.valueOf(ch);
            if(!mp.containsKey(keys)){
                mp.put(keys, new ArrayList<>());
            }
            mp.get(keys).add(str);
        }
        return new ArrayList<>(mp.values());
    }
}
