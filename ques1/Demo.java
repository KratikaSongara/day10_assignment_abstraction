package com.ques1;

import java.util.Scanner;

public class Demo {

	public Hotel provideFood(int amount) {
		if(amount>1000)
		{
			return new TajHotel();
		}
		else if(amount>200 && amount<1000)
		{
			return new RoadSideHotel();
		}
		else
		{
			return null;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter amount");
		int amount = sc.nextInt();
		
		Demo demo = new Demo();
		Hotel hotel=demo.provideFood(amount);
		if(hotel!=null) 
		{
			if(hotel instanceof TajHotel) {
				((TajHotel) hotel).welcomeDrink();
				hotel.chickenBiryani();		
				hotel.masalaDosa();
			}
			else if(hotel instanceof RoadSideHotel)
			{
				hotel.chickenBiryani();
				hotel.masalaDosa();
			}
		}
		else
		{
			System.out.println("Please Enter a valid amount");
		}

	}
}
