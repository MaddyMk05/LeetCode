class Solution {
    public boolean isValid(String s) {
        Stack <Character> par=new Stack<>();
        char [] ch=s.toCharArray();
        for(int i=0;i<ch.length;i++){
            if(ch[i]=='('){
                par.push(')');
            }
            else if(ch[i]=='['){
                par.push(']');
            }
            else if(ch[i]=='{'){
                par.push('}');
            }
            else if(par.isEmpty() || par.pop()!=ch[i]){
                return false;
            }
        }
        return par.isEmpty();
    }
}