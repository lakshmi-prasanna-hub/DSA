class Solution {
    public int removeDuplicates(int[] nums) {
 int n=nums.length;
        int j=0;
        for(int i=0;i<n-1;i++){
            if(nums[i]!=nums[i+1]){
              nums[j]=nums[i];
              j++;
            }
        }
        nums[j]=nums[nums.length-1];
        j++;
        return j;
    }
}
