package com.pravee.task4;

import java.util.*;

public class Main
{
	public static void main(String[] args) 
	{
	
		Scanner sc=new Scanner(System.in);
		InterestCalculation interest=new InterestCalculation();
	
		while(true)
		{
			
			System.out.println("Enter your choice..");
			System.out.println("1.SimpleInterest");
			System.out.println("2.CompoundInterest");	
			int choice=sc.nextInt();
			
			
			switch(choice)
			{
				case 1:
				{
					System.out.println("Enter the principal amount(p)");
					double principal=sc.nextDouble();
					System.out.println("Enter the rate of interest in percentage(r)");
					double rateOfInterest=sc.nextDouble();
					System.out.println("Enter the time period(t)");
					double timePeriod=sc.nextDouble();

					System.out.println("Simple interest amount is:"+interest.simpleInterest(principal,rateOfInterest,timePeriod));
					break;
				}
				
				case 2:
				{
					System.out.println("Enter the principal amount(p)");
					double principal=sc.nextDouble();
					System.out.println("Enter the rate of interest in percentage(r)");
					double rateOfInterest=sc.nextDouble();
					System.out.println("Enter the time period(t)");
					double timePeriod=sc.nextDouble();
					System.out.println("Enter the number of times interest applied per time period(n)");
					double noOfTimesInterestApplied=sc.nextDouble();

					System.out.println("Compound interest amount is:"+interest.compoundInterest(principal,rateOfInterest,timePeriod,noOfTimesInterestApplied));			
					break;
				}
				
				default:
				{
					System.out.println("Invalid choice");				
					break;
				}
				
			}
			
			System.out.println("Continue? Y/N");
			char ch=sc.next().charAt(0);
			
			if(ch=='Y')
				continue;
			else
				break;
		}
		
		
		sc.close();
	}

}
