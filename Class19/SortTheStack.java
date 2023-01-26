package Week_1_DP5_CipherSchools.Class19;

import java.util.Stack;

public class SortTheStack {
    public static void sort(Stack<Integer> stack){
        if(stack.isEmpty()){
            return;
        }
        int element=stack.pop();
        sort(stack);
        addInStack(stack,element);
    }

    private static void addInStack(Stack<Integer> stack, int element) {

        if(stack.isEmpty() || element>stack.peek()){
            stack.push(element);
            return;
        }
        int tempElement=stack.pop();
        addInStack(stack,element);
        stack.push(tempElement);
    }

    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();
        stack.push(4);
        stack.push(1);
        stack.push(2);
        stack.push(9);
        stack.push(7);
        sort(stack);
        System.out.println(stack);
    }
}
