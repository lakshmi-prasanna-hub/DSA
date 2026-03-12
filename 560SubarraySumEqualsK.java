class Solution {
    public int subarraySum(int[] nums, int k) {
        int n=nums.length;
        int left=0,right=0;
        int sum=0,count=0;
        while(right<n){
           sum+=nums[right];
           while(left<right&&sum>k){
            sum-=nums[left];
            left++;
           }
           if(sum==k)
           count++;
            right++;

        }
        return count;
        /*int n=nums.length;
        Map<Long,Integer> preSumMap=new HashMap<Long,Integer>();
        long sum=0;
        int len=0,count=0;
        for(int i=0;i<n;i++){
        sum+=nums[i];
        if(sum==k){
            count++;
            len=Math.max(len,i+1);
        }
        long rem=sum-k;
        if(preSumMap.containsKey(rem)){
            count++;
            len=Math.max(len,i-preSumMap.get(rem));
        }
        if((preSumMap.containsKey(sum)))
        count++;
        if(!(preSumMap.containsKey(sum)))
        preSumMap.put(sum,i);

    }
    return count;
    */
    /*int count=0;
    int n=nums.length;
    for(int i=0;i<n;i++){
        int sum=0;
        for(int j=i;j<n;j++){
            sum+=nums[j];
            if(sum==k)
                count++;
        }
    }
    return count;*/
