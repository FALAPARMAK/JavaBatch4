package com.class23;

public class Test {
	public static void main(String[] args) {
		System.out.println(" ------Creating employee object--------");
		Employee emp=new Employee();
		System.out.println(Employee.department);//Static olunca sinif ismi ile cagirilir
		Employee.Work();
		emp.salary=90000;
		emp.getPaid();
		
		System.out.println(" ------Creating ScrumTeam object--------");
		ScrumTeam st=new ScrumTeam();
		st.salary=100000;
		st.getPaid();
		st.artifacts="Product Backlog, Sprint Backlog, BurnDown chart";
		st.ceremonies="Sprint grooming, Sprint planning, Daily Stand up, Sprint Demo";
		st.attendScrumMeeting();
		st.workOnArtifacts();
		
		
		System.out.println(" ------Creating Developer object--------");
		Developer dev=new Developer();
		dev.salary=120000;
		dev.getPaid();
		dev.artifacts="Sprint backlog";
		dev.ceremonies="Sprint grooming, Sprint planning, Daily Stand up, Sprint Demo";
		dev.workOnArtifacts();
		dev.attendScrumMeeting();
		dev.code();
		
		System.out.println(" ------Creating Tester object--------");
		Tester qa=new Tester();
		qa.salary=120000;
		qa.getPaid();
		qa.artifacts="Sprint backlog";
		qa.ceremonies="Sprint grooming, Sprint planning, Daily Stand up, Sprint Demo";
		qa.workOnArtifacts();
		qa.attendScrumMeeting();
		qa.Test();
		System.out.println(" ------Creating Business Analysst object--------");
		
		
		BussinessAnalyst ba=new BussinessAnalyst();
		ba.salary=120000;
		ba.getPaid();
		ba.artifacts="Sprint backlog";
		ba.ceremonies="Sprint grooming, Sprint planning, Daily Stand up, Sprint Demo";
		ba.workOnArtifacts();
		ba.attendScrumMeeting();
		ba.WriteUserStory();
		
		System.out.println(" ------Creating Scrum Master object--------");
		
		ScrumMaster sm=new ScrumMaster();
		sm.salary=90000;
		sm.getPaid();
		sm.artifacts="Burn Down Chart";
		sm.ceremonies="Sprint grooming, Sprint Planning, Daily standUp, Sprint Demo, Sprint Retro";
		sm.workOnArtifacts();
		sm.driveScrumMeetings();
		
		System.out.println(" ------Creating Product Owner object--------");
		
		ProductOwner po=new ProductOwner();
		po.salary=150000;
		po.getPaid();
		po.artifacts="Sprint Backlog, Product Backlog";
		po.ceremonies="Sprint grooming, Sprint planning,Sprint Demo";
		po.workOnArtifacts();
		po.attendScrumMeeting();
		po.prioritizeBacklog();
		po.talkToTheClient();
	}
	

}
