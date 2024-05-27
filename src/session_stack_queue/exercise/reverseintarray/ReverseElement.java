package session_stack_queue.exercise.reverseintarray;

import session_stack_queue.practice.stackarray.MyStack;

public class ReverseElement {
    public static void main(String[] args) throws Exception {
        int[] arr = {1,2,3,4,5};
        MyStack<Integer> stack = new MyStack<>(arr.length);

        for (int i = 0; i < arr.length; i++) {
            stack.push(arr[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = stack.pop();
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        String str = "Dung";
        MyStack<Character> wStack = new MyStack<>(str.length());
        for (int i = 0; i < str.length(); i++) {
            wStack.push(str.charAt(i));
        }
        String newStr = "";
        while (!wStack.isEmpty()){
            newStr += wStack.pop();
        }
        System.out.println(newStr);
    }
}
