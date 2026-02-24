class Solution {
    public int[] frequencySort(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        List<Integer> list=new ArrayList<>();
        for(int num:nums){
            list.add(num);
        }
        Collections.sort(list,(a,b)->
        {
             if(!map.get(a).equals(map.get(b)))
             return map.get(a)-map.get(b);
             return b-a;
        });
        for(int i=0;i<n;i++){
            nums[i]=list.get(i);

        }
        return nums;
    }
}   
