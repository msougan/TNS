package com.tns.controlstatements;

public class controlstatements {
	
	public static void main(String[] args) {
		int a=10;
		int b=20;
		int c=30;
		System.out.println("CONDITIONAL STATEMENTS");
		System.out.println();
		System.out.println("if statement");
		if(b>a) {
			System.out.println("a is less than b");
		}
		System.out.println();
		System.out.println("if else statements");
		if(a>b) {
			System.out.println("a is greater than b");
		}
		else {
			System.out.println("a is less than b");
		}
		System.out.println();
		System.out.println("else if ladder");
		if(a>b&&a>c) {
			System.out.println("a is largest number");
		}
		else if(b>c&&b>a) {
			System.out.println("b is largest number");
		}
		else {
			System.out.println("c is largest number");
		}
		System.out.println();
		System.out.println("nested if");
		int marks=60;
		if(marks>=55) {
			if(marks>=80) {
				System.out.println("first class");
			}
			else {
				System.out.println("pass");
			}
		}
		else {
			System.out.println("fail");
		}
		System.out.println();
		System.out.println("LOOPING STATEMENTS");
		System.out.println();
		int i=1;
		System.out.println("while LOOP");
		while(i<10) {
			System.out.println(i);
			i++;
		}
		System.out.println();
		System.out.println("do while LOOP");
		do {
	
			System.out.println(i);
			i--;
		}while(i>0);
		System.out.println();
		System.out.println("for LOOP");
		for(i=1;i<=10;i++)
		{
			System.out.println(i);
		}

	}


}
