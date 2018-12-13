package com.practice.JAVA8;

/*
 * Single Abstract Method(SAM)
 * Example: Runnable,Callable,Comparator
 */
@FunctionalInterface
interface Operation{
	int op(int a,int b);
}
public class Calculator {

	public int operate(int a,int b,Operation opr) {
		return opr.op(a, b);
	}
	
	public static void main(String[] args) {
		Calculator c=new Calculator();
		//Lamda expression
		Operation add=(a,b)->a+b;
		Operation sub=(a,b)->a-b;
		Operation mul=(a,b)->a*b;
		
		
		System.out.println(c.operate(2, 3, add));
		System.out.println(c.operate(3, 2, sub));
		System.out.println(c.operate(2, 3, mul));
	}
	
}
