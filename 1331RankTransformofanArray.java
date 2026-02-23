class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int n=arr.length;
        //int[] temp=arr.clone();
        int temp[]=new int[n];
        for(int i=0;i<n;i++){
            temp[i]=arr[i];
        }
        Arrays.sort(temp);
        HashMap<Integer,Integer> map=new HashMap<>();
        int rank=1;
        for(int num:temp){
            if(!map.containsKey(num))
            map.put(num,rank++);
        }
        for(int i=0;i<n;i++){
            arr[i]=map.get(arr[i]);
        }
        return arr;
        
    }      
}
