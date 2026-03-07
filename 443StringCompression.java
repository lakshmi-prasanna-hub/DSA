class Solution {
    public int compress(char[] chars) {
        int n=chars.length,count=1,k=0;
        char ch=chars[0];
        if(n==1)
        return 1;
        for(int i=0;i<n-1;i++){
            ch=chars[i];
            chars[k++]=ch;
            count=1;
            while(i<n-1&&chars[i]==chars[i+1]){
                count++;
                i++;
            }
            if(count==1){
              continue;
            }
            else{
             String s=String.valueOf(count);
             for(char c:s.toCharArray()){
                chars[k++]=c;
             }
            }
        }
        if(k<n&&ch!=chars[n-1])
        chars[k++]=chars[n-1];
        return k;
    }
}
/*class Solution {
    public int compress(char[] chars) {
        int n = chars.length;
        int k = 0;

        for (int i = 0; i < n; i++) {
            char ch = chars[i];
            int count = 0;

            // count same chars
            while (i < n && chars[i] == ch) {
                i++;
                count++;
            }

            // place character
            chars[k++] = ch;

            // place count if >1
            if (count > 1) {
                for (char c : String.valueOf(count).toCharArray()) {
                    chars[k++] = c;
                }
            }

            i--; // adjust because for loop will increment
        }

        return k;
    }
}
*/
