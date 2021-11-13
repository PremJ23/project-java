package com.type_casting;

public class Two_Types {

public static void main(String[] args) {
		
		System.out.println("***Widening Typecast***");
		
		byte a = 127;
		short b = a;
		char c = (char) b;
		int d = c;
		long e = d;
		float f = e;
		double g = f;
		
		System.out.println("Before conversion, Value of a is :"+a);
		System.out.println("After conversion, Value of b is :"+b);
		System.out.println("After conversion, Value of c is :"+c);
		System.out.println("After conversion, Value of d is :"+d);
		System.out.println("After conversion, Value of e is :"+e);
		System.out.println("After conversion, Value of f is :"+f);
		System.out.println("After conversion, Value of g is :"+g);


System.out.println("***Narrowing Typecast***");
		
		
	    short x = 129;
		
		byte n = (byte) x;

		
		System.out.println("After conversion, Value of k is :"+x);
		
		System.out.println("After conversion, Value of n is :"+n);
		
	}
	
		
	}
	




