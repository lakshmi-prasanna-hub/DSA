class Solution {
    public static boolean ismatch(char a,char b){
        return (a=='('&&b==')')||(a=='{'&&b=='}')||(a=='['&&b==']');
    }
    public boolean isValid(String s) {
        Deque<Character> stack =new ArrayDeque<>();
        for(int i=0;i<s.length();i++){
            char x=s.charAt(i);
            if(x=='('||x=='{'||x=='[')
            stack.push(x);
            else{
                if(stack.isEmpty())
                return false;
                else if(ismatch(stack.peek(),x)==false)
                return false;
                else
                stack.pop();
            }
        }
        return stack.isEmpty();
        
    }
}
