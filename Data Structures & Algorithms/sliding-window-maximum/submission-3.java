class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int[] res = new int[n-k+1];
        // for(int i=0;i<=n-k;i++){
        //     int maxi = nums[i];
        //     for(int j=i; j<i+k;j++){
        //         if(nums[j]>maxi){
        //             maxi = Math.max(maxi, nums[j]);
        //         }
        //     }
        //     res[i] = maxi;
        // }
        PriorityQueue<int[]> heap = new PriorityQueue<>((a,b) -> b[0]-a[0]);
        int index = 0;
        for(int i=0;i<n;i++){
            heap.offer(new int[]{nums[i], i});
            if(i >= k-1){
                while(heap.peek()[1] <= i-k){
                    heap.poll();
                }
                res[index++] = heap.peek()[0];
            }
        }
        return res;
    }
}
