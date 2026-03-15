package com.tns.accessmodifiers.first;

public class diffclass {
	
	public static void main(String args[])
	{
		
		sameclass sc = new sameclass();
		
		sc.default_method();
		sc.public_method();
		sc.private_method();
		sc.protected_method();
		
		System.out.println(sc.def_var);
		System.out.println(sc.pub_var);
		System.out.println(sc.pro_var);
		
		// we can't access private 
			
	}

}
