class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
       /* int n=nums.length;
        List<Integer> res=new ArrayList<>();
        int vis[]=new int[n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if((i+1)==nums[j]){
                vis[i]=1;
                break;
                }
                else
                vis[i]=0;
            }
        }
        for(int i=0;i<n;i++){
            if(vis[i]==0)
            res.add(i+1);
        }
        return res;
        */
        int n=nums.length;
        boolean[] present = new boolean[n + 1]; 
        for (int num : nums) {
            if (num >= 1 && num <= n) {
                present[num] = true;
            }
        }
        List<Integer> missing = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (!present[i]) {
                missing.add(i);
            }
        }

        return missing;
    }
}
