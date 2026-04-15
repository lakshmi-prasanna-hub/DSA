class Solution {
    public String largestGoodInteger(String num) {
        int n=num.length(),lar=-1;
        String str="";
        for(int i=0;i<n-2;i++){
            if(num.charAt(i)==num.charAt(i+1)&&num.charAt(i+1)==num.charAt(i+2)){
            int digit=num.charAt(i)-'0';
            if(digit>lar){
            lar=digit;
            str=num.substring(i,i+3);
            }
        }     
    }
    return str;
}
}
