package Week_1_DP5_CipherSchools.Class18;

import java.util.Stack;

public class DuplicateParenthesis {
    public static boolean containsDuplicateParenthesis(String expString){
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<expString.length();i++){
            Character currentCharacter=expString.charAt(i);
            if(currentCharacter!=')'){
                stack.push(currentCharacter);
            }
            else{
                int removeElementsCount=0;
                Character top=stack.pop();
                while (top!='('){
                    removeElementsCount++;
                    top=stack.pop();
                }
                if(removeElementsCount<1){
                    return true;
                }
            }
        }
         return false;
    }

    public static void main(String[] args) {
        String str="((1+2))";
        System.out.println(containsDuplicateParenthesis(str));
    }
}
