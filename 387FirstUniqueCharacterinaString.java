class Solution {
    public int firstUniqChar(String s) {
        int n=s.length();
        int[] present=new int[26];
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            present[ch-'a']++;
        }
        for(int i=0;i<n;i++){
            char ch1=s.charAt(i);
            if(present[ch1-'a']==1)
            {
                return i;
            }
        }
        return -1;
    }
}
