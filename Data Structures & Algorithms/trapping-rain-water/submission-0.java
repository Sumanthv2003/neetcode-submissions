class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int[] left = new int[n];
        int[] right = new int[n];
        int leftMax = 0;
        int total = 0;
        for(int i=0; i<n;i++){
            leftMax = Math.max(leftMax, height[i]);
            left[i] = leftMax;
        }
        int rightMax = 0;
        for(int i=n-1; i>=0; i--){
            rightMax = Math.max(rightMax, height[i]);
            right[i] = rightMax;
        }
        for(int i=0; i<n; i++){
            total += Math.min(left[i], right[i]) - height[i];
        }
        return total;
    }
}
