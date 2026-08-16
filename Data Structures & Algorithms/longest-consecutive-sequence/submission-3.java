class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int maxlen = 0;
        int count = 0;
        int lastMax = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==lastMax)continue;
            if(nums[i]-1 == lastMax){
                count++;
            }else if(nums[i]-1!=lastMax){
                count = 1;
            }
            lastMax = nums[i];
            maxlen = Math.max(maxlen, count);
        }
        return maxlen;
        
    }
}
