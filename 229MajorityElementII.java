class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int cnt1=0,cnt2=0,el1=Integer.MIN_VALUE,el2=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(cnt1==0&&el2!=nums[i])
            {
                el1=nums[i];
                cnt1=1;
            }
            else if(cnt2==0&&el1!=nums[i]){
                el2=nums[i];
                cnt2=1;
            }
            else if(nums[i]==el1)
            cnt1++;
            else if(el2==nums[i])
            cnt2++;
            else
            {
                cnt1--;
                cnt2--;
            }
        }
        cnt1=0;cnt2=0;
        List<Integer> list=new ArrayList<Integer>();
        int mini=nums.length/3+1;
        for(int i=0;i<nums.length;i++){
            if(el1==nums[i])
            cnt1++;
            if(el2==nums[i])
            cnt2++;
        }
        if(cnt1>=mini)
        list.add(el1);
        if(cnt2>=mini)
        list.add(el2);

         return list;
    }
   
}
