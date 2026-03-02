class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length())
        return false;
        Map<Character,Character> mapst=new HashMap<>();
        Map<Character,Character> mapts=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char c1=s.charAt(i),c2=t.charAt(i);
            if(mapst.containsKey(c1)){
                if(mapst.get(c1)!=c2)
                return false;
            }
            else
                mapst.put(c1,c2);
            
            if(mapts.containsKey(c2)){
                if(mapts.get(c2)!=c1)
                return false;
            }
            else
                mapts.put(c2,c1);
            

        }
        return true;
    }
}
