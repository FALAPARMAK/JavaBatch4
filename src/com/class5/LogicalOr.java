package com.class5;

public class LogicalOr {

	public static void main(String[] args) {
		/*we have 7 day
		 * if days are from 1-5 weekday
		 * if days are from 6-7 weekend
		 * otherwise not valid day
		 * 
		 */
      int day= 8;

		if(day==1 || day ==2||  day==3 || day==4 ||day==5) {
			System.out.println(" weekday");
		}else if(day==6 || day==7) {
			System.out.println(" weekend");
		}else {
			System.out.println(" not valid day");
		}
		
		
	}

}
