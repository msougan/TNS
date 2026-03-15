package com.tns.accessmodifiers.first;

public class sameclass {
	
	int def_var=10;
	public int pub_var =20;
	private int pri_var=30;
	protected int pro_var=40;
	
	public void default_method()
	{
		System.out.println("The default value is : "+def_var);
	}
	
	public void public_method()
	{
		System.out.println("The public value is : "+pub_var);
	}
	
	public void private_method()
	{
		System.out.println("The private value is : "+pri_var);
	}
	
	public void protected_method()
	{
		System.out.println("The protected value is : "+pro_var);
	}

}
