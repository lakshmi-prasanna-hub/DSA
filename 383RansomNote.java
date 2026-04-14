class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int mag[]=new int[26];
        int ras[]=new int[26];
        for(char c:magazine.toCharArray()) 
        mag[c-'a']++;
        for(char c:ransomNote.toCharArray())
        ras[c-'a']++;
        for(char c:ransomNote.toCharArray()){
            if(ras[c-'a']>mag[c-'a'])
            return false;
        }
        return true;
    }
}
