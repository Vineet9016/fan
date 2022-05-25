package com.cgi.Fan;

public class FanStart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Fan f =  new Fan();

		
		System.out.println("currently the fan is in this position");
		System.out.println();
		
		System.out.println(f.getDirection());
		System.out.println(f.getSpeed());
		f.speedUp();
		
		System.out.println("speed of the fan after one increase of the speed up");
		
		System.out.println(f.getSpeed());
		
		f.reverseDirection();
		System.out.println("if we change the direction  from current to reverse ");
		System.out.println(f.getDirection());
		
		
		f.reverseDirection();
		System.out.println("if we change the direction again for the fan then it comes back again to this direction");
		System.out.println(f.getDirection());
		
		System.out.println("current speed for the fan is "+f.getSpeed());
		f.speedUp();
		f.speedUp();
		
		System.out.println("speed for the fan increased by 2 times, now the speed for the fan is");
		System.out.println(f.getSpeed());
	
		
		
		
		

	}

}
