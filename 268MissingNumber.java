class Solution {
    public int missingNumber(int[] nums) {
       int fullxor=0,arrxor=0;
       for(int i=0;i<=nums.length;i++){
           fullxor=i^fullxor;
       }
       for(int num:nums)
       arrxor=num^arrxor;
        return arrxor^fullxor;
        
    }
}
