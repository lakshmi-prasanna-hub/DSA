class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
       HashSet<List<Integer>> ans=new HashSet<>();
       int n=nums.length;
       for(int i=0;i<n;i++){
        HashSet<Integer> hashset=new HashSet<>();
        for(int j=i+1;j<n;j++){
            int rem=-(nums[i]+nums[j]);
            if(hashset.contains(rem)){
                List<Integer> temp= Arrays.asList(nums[i],nums[j],rem);
                Collections.sort(temp);
                ans.add(temp);
            }
            hashset.add(nums[j]);
        }
       }

return new ArrayList<>(ans);
    }
}
