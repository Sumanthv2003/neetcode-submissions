class Solution {
    public int characterReplacement(String s, int k) {
        int res = 0;
        //BRUTE (TIME LIMIT EXCEEDS IN SOMECASES)
        // for(int i=0;i<s.length();i++){
        //     Map<Character, Integer> mp = new HashMap<>();
        //     int maxrepeating = 0;
        //     for(int j=i;j<s.length();j++){
        //         mp.put(s.charAt(j), mp.getOrDefault(s.charAt(j), 0)+1);
        //         maxrepeating = Math.max(maxrepeating, mp.get(s.charAt(j)));
        //         if(j-i+1 - maxrepeating <= k){
        //             res = Math.max(res, j-i+1);
        //         }
        //     }
        // }

        //OPTIMAL
        int left = 0, maxrepeating = 0, windowsize = 0;
        int[] a = new int[26];
        for(int right = 0; right<s.length(); right++){
            a[s.charAt(right)-'A']++;
            maxrepeating = Math.max(maxrepeating, a[s.charAt(right)-'A']);
            windowsize = right - left + 1;
            if(windowsize - maxrepeating > k){
                a[s.charAt(left)-'A']--;
                left++;
            }
            res = Math.max(res, right - left+1);

        }

        return res;
    }
}
