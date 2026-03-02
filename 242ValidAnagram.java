class Solution {
    public boolean isAnagram(String s, String t) {
       int present[]=new int[26];
       if(s.length()!=t.length())
       return false;
       for(int i=0;i<s.length();i++){
        char ch=s.charAt(i);
        present[ch-'a']++;
       }
        for(int i=0;i<s.length();i++){
        char ch=t.charAt(i);
        present[ch-'a']--;
       }
       for(int i=0;i<26;i++){
        if(present[i]!=0)
        return false;
       }
        return true;
    }
}
