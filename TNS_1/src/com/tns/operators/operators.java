package com.tns.operators;

public class operators {
public static void main(String[] args) {
		
		int a=10;
		int b=20;
		System.out.println();
		System.out.println("ARITHMETIC OPERATORS");
		System.out.println();
		System.out.println("(a+b)="+(a+b));
		System.out.println("(b-a)="+(b-a));
		System.out.println("(a*b)="+(a*b));
		System.out.println("(a/b)="+(a/b));
		System.out.println("(a%b)="+(a%b));
		System.out.println();
		System.out.println("COMPARISION OPERATORS");
		System.out.println();
		System.out.println("(a==b) "+(a==b));
		System.out.println("(a!=b) "+(a!=b));
		System.out.println("(a>b) "+(a>b));
		System.out.println("(a<b) "+(a<b));
		System.out.println("(a>=b) "+(a>=b));
		System.out.println("(a<=b) "+(a<=b));
		System.out.println();
		System.out.println("LOGICAL OPERATORS");
		System.out.println();
		System.out.println("Logical AND operator(&&)");
		if(a<b && a>5) {
			System.out.println("a="+a);
		}
		System.out.println("Logical OR operator(||)");
		if(a<b || a>5) {
			System.out.println("a="+a);
		}
		System.out.println("Logical XOR operator(^)");
		if(a<10 ^ a>5) {
			System.out.println("a="+a);
		}
		System.out.println("Logical NOT operator(!)");
		if(!(a>b)) {
			System.out.println("a="+a);
		}
		System.out.println();
		System.out.println("BITWISE OPERATORS");
		System.out.println();
		System.out.println("(a&b) "+(a&9));
		System.out.println("(a|b) "+(a|b));
		System.out.println("(a^b) "+(a^b));
		System.out.println("(~b) "+(~b));
		System.out.println("(a<<) "+(a<<2));
		System.out.println("(a>>) "+(a>>2));
		System.out.println();
		System.out.println("ASSIGNMENT OPERATORS");
		System.out.println();
		System.out.println("(a+=) "+(a+=5));
		System.out.println("(a-=) "+(a-=5));
		System.out.println("(a*=) "+(a*=5));
		System.out.println("(a/=) "+(a/=5));
		System.out.println("(a%=) "+(a%=5));
		System.out.println();
		System.out.println("TERNARY OPERATOR");
		System.out.println();
		int t=(a>b)? a:b;
		System.out.println(t);
	}


}
