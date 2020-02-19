package com.pravee.task4;

import java.lang.Math;

public class InterestCalculation 
{
	double simpleInterest(double principal,double rateOfInterest,double timePeriod)
	{
		return (principal*rateOfInterest*timePeriod)/100;
	}
	
	double compoundInterest(double principal,double rateOfInterest,double timePeriod,double noOfTimesInterestApplied)
	{
		return (principal)*Math.pow(1+(rateOfInterest/(100*noOfTimesInterestApplied)),timePeriod*noOfTimesInterestApplied);
	}
}
