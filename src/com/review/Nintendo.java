package com.review;

public class Nintendo extends GameConsole {

	public static void main(String[] args) {
	Nintendo nintendo=new Nintendo();
	nintendo.controller="red  & blue";
	nintendo.ifTvNeeded=true;
	nintendo.cd=false;
	nintendo.powerSource="outlet";
	//-----------below are attributes------------
	System.out.println(nintendo.controller);
	System.out.println(nintendo.ifTvNeeded);
	System.out.println(nintendo.cd);
	System.out.println(nintendo.powerSource);
	
	nintendo.ableToPlay();
	nintendo.portable();//will not print because boolean
	System.out.println(nintendo.portable());//false
	System.out.println(nintendo.powerSource+ " if tv is needed");
/////---------------below are behaviours--------
	
	System.out.println(nintendo.portable()+" is game system portable");
	//System.out.println(nintendo.readDisk()+" is game read disk");
	nintendo.readDisk();
	
	
	}

}
