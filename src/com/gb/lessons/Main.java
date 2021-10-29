package com.gb.lessons;

public class Main {

    public static void main(String[] args) {
	    MyLinkedStack<Integer> linkedStack = new MyLinkedStack<>();

	    linkedStack.push(1);
        linkedStack.push(2);
        linkedStack.push(3);
        linkedStack.push(4);

        System.out.println(linkedStack.pop());
        System.out.println(linkedStack);
        System.out.println(linkedStack.searchIndex(1));
    }
}
