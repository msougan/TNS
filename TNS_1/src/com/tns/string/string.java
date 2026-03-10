package com.tns.string;

public class string {

	public static void main(String[] args) {
		
		StringBuffer s=new StringBuffer("Welcome to Java Training!");
		char h;
		System.out.println(s);
		for(int i=s.length()-1;i>=0;i--)
		{
			h=s.charAt(i);
			if(Character.isUpperCase(h))
			{
				s.deleteCharAt(i);
				s.append(h);
				
			}
		}
		System.out.println(s);

	}

}
