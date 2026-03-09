class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
       int count=0,len=0;
        for(int num:nums){
            if(num==1){
                count++;
                len=Math.max(len,count);
            }
            else
                count=0;
        }
        return len;
    }
}
