package com.tns.exception_handling;

public class exceptions {
	public static void main(String args[])
	{
		try {
			int a=10;
			int b=0;
			int c=a/b;
			System.out.println(c);
		}
	
		catch(Exception e)
		{
			System.out.println("Arithmetic Exception");
		}
		finally
		{
			System.out.println("program completed");
		}
	}


}
