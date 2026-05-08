class Solution {
    public boolean isValid(String s) {   
        char stack[] = new char[s.length()];
        int top = -1; 
        
        for(int i = 0; i < s.length(); i++) {
            char a = s.charAt(i);
            

            if(a == '(' || a == '{' || a == '[') {
                ++top;
                stack[top] = a;
            }
            else if (a == '}' || a == ')' || a == ']') {

                if (top == -1) {
                    return false;
                }

                if (a == '}') {
                    if (stack[top] == '{') {
                        top--;
                        continue;
                    }
                    return false;
                }
                else if (a == ')') {
                    if (stack[top] == '(') {
                        top--;
                        continue;
                    }
                    return false;
                }
                else if (a == ']') {
                    if (stack[top] == '[') {
                        top--;
                        continue;
                    }
                    return false;
                }
            }
        }

        if (top == -1) {
            return true;
        }
        return false;
    }
}