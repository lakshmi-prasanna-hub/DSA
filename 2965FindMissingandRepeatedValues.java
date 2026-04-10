class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int lar=1,n=grid.length;
        /*for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                if(grid[i][j]>lar)
                lar=grid[i][j];
            }
        }*/
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                map.put(grid[i][j],map.getOrDefault(grid[i][j],0)+1);
            }
        }
        int nums[]=new int[2];
        for(int i=1;i<=n*n;i++){
           int freq=map.getOrDefault(i,0);
           if(freq==0)
           nums[1]=i;
           else if(freq==2)
           nums[0]=i;
        }
        return nums;
    }
}
