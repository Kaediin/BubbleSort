package com.daiken;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Bubble bubble = new Bubble();
        bubble.generateCharacterList(10);
        bubble.sort();
        System.out.println(bubble.getList());
    }
}
