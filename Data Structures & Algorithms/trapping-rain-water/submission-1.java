class Solution {
    public int trap(int[] height) {
        int n = height.length;
        // int[] left = new int[n];
        // int[] right = new int[n];
        // int leftMax = 0;
        // int total = 0;
        // for(int i=0; i<n;i++){
        //     leftMax = Math.max(leftMax, height[i]);
        //     left[i] = leftMax;
        // }
        // int rightMax = 0;
        // for(int i=n-1; i>=0; i--){
        //     rightMax = Math.max(rightMax, height[i]);
        //     right[i] = rightMax;
        // }
        // for(int i=0; i<n; i++){
        //     total += Math.min(left[i], right[i]) - height[i];
        // }

        //2nd way of code without extra space
        int maxheight = 0, leftMax = 0, rightMax = 0, total = 0;
        for(int i=0; i<n;i++){
            if(height[i] > height[maxheight]){
                maxheight = i;
            }
        }
        for(int i=0;i<maxheight;i++){
            leftMax = Math.max(leftMax, height[i]);
            total += leftMax - height[i];
        }
        for(int i=n-1; i>maxheight;i--){
            rightMax = Math.max(rightMax, height[i]);
            total += rightMax - height[i];
        }
        return total;
    }
}
