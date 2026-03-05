class Solution {
    public boolean isSubsequence(String s, String t) {
        int i=0,j=0,m=s.length(),n=t.length();
        while(j<m&&i<n){
           if(s.charAt(j)==t.charAt(i)){
            i++;
            j++;
           }
           else
           i++;
        }
        if(j==m)
        return true;
        return false;
        
    }
}
