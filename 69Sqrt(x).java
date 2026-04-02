class Solution {
    public int mySqrt(int x) {
         if(x==0||x==1)
         return x;
         int left=0,right=x,mid=0,ans=0;
        
         while(left<=right){
            mid=left+(right-left)/2;
            long sqr=(long)mid*mid;
            if(sqr==x)
            return mid;
            else if(sqr<x){
                 ans=mid;
                left=mid+1;
            } 
            else
            right=mid-1;
         }

        return ans;
    }
}
