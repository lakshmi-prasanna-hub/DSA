class Solution {
    public int pivotIndex(int[] nums) {
       /* int n=nums.length;
        int p=0,prefix,suffix,i=0,j=0;
        while(p<n){
            prefix=0;suffix=0;i=0;j=n-1;
            while(i<p){
                prefix=prefix+nums[i];
                i++;
            }
            while(j>p){
                suffix=suffix+nums[j];
                j--;
            }
                if(prefix==suffix)
                return p;
            
            p++;
        }
        return -1;
        */
        int n=nums.length;
        int total=0,left=0,right=0;
        for(int i=0;i<n;i++)
        total+=nums[i];
        for(int i=0;i<n;i++){
            right=total-left-nums[i];
            if(left==right)
            return i;
            left+=nums[i];
        }
        return -1;
    }
}
