class Solution {
    public boolean isValid(String s) {
        
        
        Stack<Character> stack= new Stack<>();
        
        for(char c : s.toCharArray()){
            if(c=='(' || c== '{' || c=='['){
                stack.push(c);
            }
            
            if(c==')' || c== '}' || c==']'){
                if(stack.isEmpty()){
                    return false;
                }
                
                if(!check(c, stack.pop())){
                    return false;
                }
            }
        }
        
        if(!stack.isEmpty())
            return false;
        else
            return true;
    }
    
    public boolean check (char c1, char c2){
        if(c1==')' && c2=='(')
            return true;
        if(c1=='}' && c2=='{')
            return true;
        if(c1==']' && c2=='[')
            return true;
        return false;
    }
}