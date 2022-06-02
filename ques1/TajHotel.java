package com.ques1;

public class TajHotel implements Hotel{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public void welcomeDrink(){
		System.out.println("Welcome Drink from the TajHotel");
	}

	@Override
	public void chickenBiryani() {
		// TODO Auto-generated method stub
		System.out.println("Chicken Biryani of Taj Hotel");
		
	}

	@Override
	public void masalaDosa() {
		// TODO Auto-generated method stub
		System.out.println("Masala Dosa of Taj Hotel");
		
	}

}
