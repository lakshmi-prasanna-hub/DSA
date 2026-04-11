class Solution {
    public int maxNumberOfBalloons(String text) {
        int  max=Integer.MAX_VALUE;
        int[] freq=new int[27];
        for(char ch:text.toCharArray()){
            freq[ch-'a']++;
        }
        int b=freq['b'-'a'];
        int a=freq['a'-'a'];
        int l=freq['l'-'a']/2;
        int o=freq['o'-'a']/2;
        int n=freq['n'-'a'];
        max=Math.min(b,Math.min(a,Math.min(l,Math.min(o,n))));
        return max;
    }
}
