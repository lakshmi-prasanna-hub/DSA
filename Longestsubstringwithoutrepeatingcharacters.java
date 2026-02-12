
/*
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int start = 0, end = 0;
        int count = 0, maxCount = 0;
        ArrayList<Character> arr = new ArrayList<>();

        while (end < n) {
            if (!arr.contains(s.charAt(end))) {
                arr.add(s.charAt(end));
                count++;
                end++;
            } else {
                arr.remove(Character.valueOf(s.charAt(start))); 
                count--;
                start++;
            }
            maxCount = Math.max(count, maxCount);
        }
        return maxCount;
    }
}   */       
/*class Solution {
    public int lengthOfLongestSubstring(String s) {
          int left=0,right=0;
          int maxlen=0;
          Set<Character> charset=new HashSet<>();
          for(right=0;right<s.length();right++){
             while(charset.contains(s.charAt(right))){
                charset.remove(s.charAt(left));
                left++;
             }

            charset.add(s.charAt(right));
            maxlen=Math.max(maxlen,right-left+1);
          }
 return maxlen;

    }
}*/
class Solution {
    public int lengthOfLongestSubstring(String s) {
          int left=0,right=0,maxlen=0;
          HashSet<Character> charset=new HashSet<>();
          for(right=0;right<s.length();right++){
            while(charset.contains(s.charAt(right))){
            charset.remove(s.charAt(left));
            left++;
          }         
          charset.add(s.charAt(right));
          maxlen=Math.max(maxlen,right-left+1);
          }
         
         return maxlen;
    }
}
