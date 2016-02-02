package com.nikhilparanjape.week2;

import java.util.ArrayList;;

public class Main {
	public static void main(String[] args){
		System.out.println("Hello World!");
		Test t = new Test();
		System.out.println(t.run());
		stuff();
	}
	public static void stuff(){
		ArrayList<String> l = new ArrayList();
		l.add("a");
		l.add("b");
		l.add("c");
		System.out.println(l);
	}
}