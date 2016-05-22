package session3_assignment;

import java.util.Scanner;

public class Calculator {
	
	public static int add(int num1, int num2)
	{
		int sum = (num1+num2);
		return sum;
	}
	public static int subtract(int num1, int num2)
	{
		int difference = (num1-num2);
		return difference;
	}
	public static int multiply(int num1, int num2)
	{
		int product = (num1*num2);
		return product;
	}
	public static int divide(int num1, int num2)
	{
		int quotient = (num1/num2);
		return quotient ;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1,num2;
		Scanner sc = new Scanner(System.in);
		num1 = sc.nextInt();
		System.out.println("The First number is:" +num1);
		num2 = sc.nextInt();
		System.out.println("The First number is:" +num2);
		System.out.println(add(num1,num2));
		System.out.println(subtract(num1,num2));
		System.out.println(multiply(num1,num2));
		System.out.println(divide(num1,num2));
	}

}
