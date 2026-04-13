class Solution {
    public int countCharacters(String[] words, String chars) {
        int count=0;
        int base[]=new int[26];
        for(int i=0;i<chars.length();i++){
            base[chars.charAt(i)-'a']++;
        }
        for(String word:words){
            int temp[]=new int[26];
            boolean isGood=true;
            for(int i=0;i<word.length();i++)
            temp[word.charAt(i)-'a']++; 
            for(int i=0;i<26;i++)
            {
                if(temp[i]>base[i]){
                isGood=false;
                break;
                }
            }
            if(isGood)
            count+=word.length();
        }
        return count;
    }
}
