class Solution {
    public boolean isPalindrome(String s) {
        String str=s.replaceAll("[^a-zA-Z0-9]+","");
        str=str.toLowerCase();
        int n=str.length();
        int left=0,right=n-1;
        while(left<=right){
            if(str.charAt(left)==str.charAt(right)){
            left++;
            right--;
            }
            else
            return false;

        }
        return true;
    
    }
}
