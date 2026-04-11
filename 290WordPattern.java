class Solution {
    public boolean wordPattern(String pattern, String s) {
        int m=pattern.length(),count=1;
        String[] word=s.split(" ");
        if(m!=word.length)
        return false;
        HashMap <Character,String> pat=new HashMap<>();
        HashMap<String,Character> pat1=new HashMap<>();
        for(int i=0;i<m;i++){
            char ch=pattern.charAt(i);
            String str=word[i];
            if(pat.containsKey(ch)){
                  if(!pat.get(ch).equals(str))
                  return false;                                  
            }
            else
            pat.put(ch,str);
            if(pat1.containsKey(str)){
                if(!pat1.get(str).equals(ch))
                return false;
            }
            else
            pat1.put(str,ch);
        }
       return true;  
}
}
