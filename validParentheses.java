// Question 20: Valid Parentheses


class Solution {
    public boolean isValid(String s) {

        Stack<String> stack = new Stack<String>();
        for(int i = 0; i < s.length; i++){
            if(s.indexOf(i) == "{" || s.indexOf(i) == "(" ||s.indexOf(i) == "["){
                stack.add(s.indexOf(i));
            }
            else if((s.indexOf(i) == "}" || s.indexOf(i) == ")" ||s.indexOf(i) == "]") && stack.empty()){
                return false;
            }
            else if(){
                
            }
        }
        
    }
}

/*
Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.
 

Example 1:

Input: s = "()"

Output: true

Example 2:

Input: s = "()[]{}"

Output: true

Example 3:

Input: s = "(]"

Output: false

Example 4:

Input: s = "([])"

Output: true

 

Constraints:

1 <= s.length <= 104
s consists of parentheses only '()[]{}'.
*/
