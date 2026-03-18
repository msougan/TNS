package com.tns.constructor;

import java.util.Scanner;

public class demo_cons {

	public static void main(String[] args) {
		
		cons c=new cons();
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter student id:");
		c.sid=sc.nextInt();
		System.out.println("Enter student Name:");
		Scanner sc1=new Scanner(System.in);
		c.sname=sc1.nextLine();
		System.out.println("Enter student marks1:");
		c.smarks=sc.nextInt();
		
		

	}

}
