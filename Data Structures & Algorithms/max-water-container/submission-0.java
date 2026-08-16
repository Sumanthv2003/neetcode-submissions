class Solution {
    public int maxArea(int[] heights) {
        int maxcapacity = 0;
        int i=0, j=heights.length - 1;
        while(i<j){
            maxcapacity = Math.max(maxcapacity, (j-i) * Math.min(heights[i], heights[j]));
            if(heights[i]>heights[j]){
                j--;
            }else{
                i++;
            }
        }
        return maxcapacity;
    }
}
