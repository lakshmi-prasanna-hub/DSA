class Solution {
    public int maxProduct(int[] nums) {   
   /* int product=1,maxpro=Integer.MIN_VALUE,n=nums.length;
    for(int i=0;i<n;i++){
        product=1;
        for(int j=i;j<n;j++){
                product=product*nums[j];
                maxpro=Math.max(maxpro,product);
            }
        }
            return maxpro;
            */
            int prefix=1,suffix=1,maxpro=Integer.MIN_VALUE,n=nums.length;
            for(int i=0;i<n;i++){
                if(prefix==0)
                prefix=1;
                if(suffix==0)
                suffix=1;
                prefix=prefix*nums[i];
                suffix=suffix*nums[n-i-1];
                maxpro=Math.max(maxpro,Math.max(prefix,suffix));
            }
            return maxpro;
}
}
