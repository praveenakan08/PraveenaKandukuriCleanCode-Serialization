package com.pravee.task4.prob2;


import java.util.*;
public class Main 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Choose the material standard (options:1,2,3,4)");
		System.out.println("MATERIAL STANDARD			CONSTRUCTION COST PER SQUAREFEET");
		System.out.println("1.Standard				1200INR");
		System.out.println("2.AboveStandard				1500INR");
		System.out.println("3.HighStandard				1800INR");
		System.out.println("4.HighStandard & FullyAutomatedHome	2500INR");
		
		int choice=sc.nextInt();
		int costPerSqFeet=0;
		
		switch(choice)
		{
			case 1:{
				costPerSqFeet=1200;
				break;		
			}
			
			case 2:{
				costPerSqFeet=1500;
				break;		
			}
			
			case 3:{
				costPerSqFeet=1800;
				break;		
			}
			
			case 4:{
				costPerSqFeet=2500;
				break;		
			}
			
		}
		
		System.out.println("Enter total area of the house in sqFt");
		int areaOfHouse=sc.nextInt();
		
		HouseConstructionCost houseCost=new HouseConstructionCost();
		
		System.out.println("Total house cost is "+houseCost.calculateHouseCost(areaOfHouse,costPerSqFeet));
		
	
		sc.close();
	}
}
