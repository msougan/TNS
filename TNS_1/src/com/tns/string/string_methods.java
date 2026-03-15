package com.tns.string;

public class string_methods {

	public static void main(String[] args) {
		
		String s="Welcome to Java Training";
		String t="Hai! ";
		System.out.println(s.charAt(0));
		System.out.println(s.compareTo(t));
		System.out.println(t.concat(s));
		System.out.println(s.contains("come"));
		System.out.println(s.endsWith("g"));
		System.out.println(s.equals(t));
		System.out.println(s.equalsIgnoreCase(t));
		System.out.println(s.indexOf("come"));
		System.out.println(s.length());
		System.out.println(t.replace("!"," "));
		System.out.println(t.replaceFirst(t, "Hello"));
		System.out.println(t.replaceAll(s, t));
		

	}

}
