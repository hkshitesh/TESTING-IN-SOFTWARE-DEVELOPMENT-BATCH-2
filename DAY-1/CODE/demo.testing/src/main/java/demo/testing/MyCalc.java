package demo.testing;

import java.util.Scanner;

public class MyCalc {
	public int sum(int a, int b)
	{
		return a+b;
	}
	public int diff(int a, int b)
	{
		return a-b;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Num 1");
		int num1 = sc.nextInt();
		System.out.println("Enter Num 2");
		int num2 = sc.nextInt();
		MyCalc calc = new MyCalc();
		System.out.println("Sum is :"+calc.sum(num1, num2));
		System.out.println("Diff is :"+calc.diff(num1, num2));

	}

}
