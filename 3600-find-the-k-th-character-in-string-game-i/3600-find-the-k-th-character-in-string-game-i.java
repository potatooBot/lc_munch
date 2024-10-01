class Solution {
    public char kthCharacter(int k) {
        String s="a";

        for(int i=0;i<=500;i++){
            if(s.length()>=k){
                return s.charAt(k-1);
            }

            String ele="";

            for( int j=0;j<s.length();j++){
                int asci=(int)s.charAt(j)+1;

                if(s.charAt(i)=='z'){
                    ele=ele+'a';
                }
                else{

ele= ele +(char)asci;
                }
            }
            s=s+ele;
        }


        return '1';
            }
}