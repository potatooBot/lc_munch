class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> stk=new Stack<>();
        for(char ch:s.toCharArray()){
            if(stk.isEmpty()==false&&stk.peek()=='('&&ch==')'){
                stk.pop();
                continue;
            }

        else{
            stk.push(ch);
        }
        }

        return stk.size();
    }
}