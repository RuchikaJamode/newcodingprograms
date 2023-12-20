package com.bridgelabz.employeewage;
import java.util.Scanner;

public class employeewage{
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a empid:");
		int randomno=sc.nextInt();
	
		if(randomno==1) {
			System.out.println("employee is present");
			
		}
		else {
		
		System.out.println("employee is absent");
	}
	}
}
