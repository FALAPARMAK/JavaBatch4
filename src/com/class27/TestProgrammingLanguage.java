package com.class27;

public class TestProgrammingLanguage {

	public static void main(String[] args) {
		
		ProgrammingLanguage obj=new Java();
		obj.understandLogic();
		obj.knowSyntax();
		obj.writeCode();
		obj.debug();
		
		ProgrammingLanguage p=new CSharp();
		p.knowSyntax();
		p.understandLogic();
		p.debug();
		p.writeCode();
		

	}

}
