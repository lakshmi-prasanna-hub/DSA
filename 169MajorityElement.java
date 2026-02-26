/*class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;
        int count=1,x=0,maxcount=0;
        if(n==1)
        return nums[0];
        for(int i=0;i<n;i++){
            count=1;
            for(int j=i+1;j<n;j++){
                if(nums[i]==nums[j])
                count++;
            }
            if(count>n/2&&count>maxcount){
                maxcount=count;
                x=nums[i];
             }

            }     
        
    return x;
}
}*/
class Solution{
     public int majorityElement(int[] nums) {
        int count=0,el=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
        if(count==0){
            count=1;
            el=nums[i];
        }
        else if(el==nums[i])
              count++;
        else
          count--;
        }
        int count1=0;
        for(int i=0;i<n;i++){
            if(el==nums[i])
            count1++;
        }
        if(count1>n/2)
        return el;
       return -1; 
     }

}
