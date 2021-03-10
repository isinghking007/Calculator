package project;
import java.io.*;
import java.util.*;
public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		//It'll take only integer input ...try this calculator using integer input only
		System.out.println("Enter the first number");
		int n=in.nextInt();
		System.out.println("Enter the second number");
		int m=in.nextInt();
		
		System.out.println("Enter either  +   -  *   / ");
		char op=in.next().charAt(0);in.close();
		switch(op) {
		case '+':
				System.out.println(n+m);
				break;
		case '-':
				System.out.println(n-m);
				break;
		case '*':
				System.out.println(n*m);
				break;
		case '/':if(m!=0) 
				System.out.println(n/m);
				else
					System.out.println("Cannot Divide by Zero");
				break;
		default:System.out.println("Please Enter the valid input");
		}
		

	}

}
