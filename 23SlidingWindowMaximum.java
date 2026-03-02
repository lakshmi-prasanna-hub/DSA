class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n=nums.length;
        int arr[]=new int[n-k+1];
        
        int r=0;
        ArrayDeque<Integer> q=new ArrayDeque<>();
        for(int i=0;i<n;i++){
            if(!q.isEmpty()&&q.peek()==i-k){
                q.poll();
            }
            while(!q.isEmpty()&&nums[q.peekLast()]<nums[i])
            q.pollLast();
           
           q.offer(i);
           if(i>=k-1){
            arr[r++]=nums[q.peekFirst()];
           }
        }
        return arr;
    }
}
