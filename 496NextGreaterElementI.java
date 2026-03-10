class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        ArrayList<Integer> list=new ArrayList<>();
        int i=0,j=0;
        while(i<nums1.length){
           j=0;
           int max=-1;
           int x=nums1[i];
             while(j<nums2.length){
                if(x==nums2[j]){
                  for(int k=j+1;k<nums2.length;k++){
                  if(nums2[k]>x){
                  max=Math.max(max,nums2[k]);
                  break;
                  }
                }
             }
            
            j++; 
        }
         list.add(max);
        i++;
    }
    int arr[]=new int[list.size()];
    for(i=0;i<arr.length;i++)
    arr[i]=list.get(i);

return arr;
}
}
