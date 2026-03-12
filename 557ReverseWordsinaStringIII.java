class Solution {
    public static String reverse(String str){
        int i=0,j=str.length()-1;
        char[] arr=str.toCharArray();
        while(i<j){
           char temp=arr[i];
           arr[i]=arr[j];
           arr[j]=temp;
           i++;
           j--;
        }
        return new String(arr);
    }
    public String reverseWords(String s) { 
        String[] str=s.split(" ");
        StringBuilder ans=new StringBuilder();
        for(String st:str){
          ans.append(reverse(st));
          ans.append(" ");

        }

        return ans.toString().trim(); 
    }
}
/*public class Solution {
    public String reverseWords(String s) {
        char[] arr = s.toCharArray();
        int start = 0;

        for (int i = 0; i <= arr.length; i++) {

            
            if (i == arr.length || arr[i] == ' ') {
                int left = start;
                int right = i - 1;

                while (left < right) {
                    char temp = arr[left];
                    arr[left] = arr[right];
                    arr[right] = temp;
                    left++;
                    right--;
                }

                
                start = i + 1;
            }
        }
        return new String(arr);
    }
}*/
