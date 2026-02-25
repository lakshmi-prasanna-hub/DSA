class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int i=0,j=0,m=nums1.length,n=nums2.length;
        Set<Integer> res=new HashSet<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        while(i<m&&j<n){
            if(nums1[i]<nums2[j])
            i++;
            else if(nums1[i]>nums2[j])
            j++;
            else{
            res.add(nums1[i]);
            i++;
            j++;

            }   
        }
        i=0;
        int arr[]=new int[res.size()];
        for(int num:res)
        arr[i++]=num;
        return arr;
    }
}
