class Solution {
    public int findLucky(int[] arr) {
        int max=-1;
        int freq[]=new int[501];
        for(int num:arr)
        freq[num]++;
        for(int i=0;i<arr.length;i++){
            if(freq[arr[i]]==arr[i])
             max=Math.max(max,arr[i]);
        }
    return max;   
    }
}
