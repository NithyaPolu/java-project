 /*basic syntax of stack implementation 
 using methods or functions push() - to add in the stack 
 peek()- to get the top element in the stack
 pop()- to remove the top element of the stack
 */

import java.util.*;
public class collection{
    public static void pushAtBottom(int data,Stack<Integer> s){
        if(s.isEmpty()){
            s.push(data);// the number to add at the bottom is data
            return;
        }
        int top=s.pop();
        pushAtBottom(data,s);// recursion (recursive call)
        s.push(top);
    }
    public static void main(String []args){
        Stack<Integer> s=new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        pushAtBottom(4,s);
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}