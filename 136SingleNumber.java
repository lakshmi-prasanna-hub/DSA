class Solution {
    public int singleNumber(int[] nums) {
        int xorArr=0;
        for(int i=0;i<nums.length;i++){
        xorArr^=nums[i];
        }
        return xorArr;
        
    }
}
