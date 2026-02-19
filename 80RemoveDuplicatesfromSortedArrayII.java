class Solution {
    public int removeDuplicates(int[] nums) {
        int n=nums.length,k=0,count=0;
        for(int i=0;i<n;i++){
            int m=nums[i];
            count=0;
            while(i<n&&m==nums[i]){
               count++;
               if(count<=2){
                nums[k++]=nums[i];
               }
               i++;
            }
            i--;
        }
      return k;  
    }
}
/*
class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length <= 2) return nums.length;

        int k = 2;
        for (int i = 2; i < nums.length; i++) {
            if (nums[i] != nums[k - 2]) {
                nums[k++] = nums[i];
            }
        }
        return k;
    }
}
*/
