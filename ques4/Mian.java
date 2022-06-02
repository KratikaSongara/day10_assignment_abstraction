package com.ques4;

public class Mian {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Area area = new Area();
		int circle=area.circleArea(2);
		System.out.println("Area of circle : "+circle);
		int rectangle=area.rectangleArea(4, 2);
		System.out.println("Area of rectangle : "+rectangle);
		int square=area.squareArea(2);
		System.out.println("Area of square : "+square);
	}

}
