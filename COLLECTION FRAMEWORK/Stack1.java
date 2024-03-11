package com.Stack;

import java.util.Stack;

public class Stack1 {
	public static void main(String[] args) {
		Stack stack = new Stack();
		stack.push(100);
		stack.push(200);
		stack.push(300);
		stack.push(400);
System.out.println(stack);
System.out.println(stack.capacity());
System.out.println(stack.pop());
System.out.println(stack);

for(int i=0;i<8;i++)
{
	System.out.println(stack.push(i));
	
}

	}
}
