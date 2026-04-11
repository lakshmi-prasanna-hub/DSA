class Solution {
    public int heightChecker(int[] heights) {
        int n=heights.length,count=0;
        int temp[]=new int[n];
        for(int i=0;i<n;i++)
        temp[i]=heights[i];
        Arrays.sort(heights);
        for(int i=0;i<n;i++){
            if(heights[i]!=temp[i])
            count++;
        }
        return count;
    }
}
