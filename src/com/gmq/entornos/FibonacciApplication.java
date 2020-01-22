package com.gmq.entornos;

public class FibonacciApplication {

	public static void main(String[] args) {
		
		int x = Integer.valueOf(args[0]);
		
		int fib = 1,fib2=1,cuenta=0;
		
		
		for (int i=0;i<x;i++) {
			
			cuenta=fib+fib2;
			fib2=fib;
			fib=cuenta;
			
		}
		System.out.println(cuenta);
	}
	
}
