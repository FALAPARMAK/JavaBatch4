package com.class27;

public abstract class File {
	/*
	 * Create a class File that will have the following behaviors: open, edit,
	 * close. Edit and close are implemented method while open is an abstract.
	 * Create 3 subclasses: JavaFile, WordFile, PDFFile that will provide specific
	 * implementation of open behaviour: Exmaple: to open .java file we need
	 * notepad++ or sublime tex, to open .doc file we need Microsoft word to be
	 * installed
	 * 
	 */

	public abstract void open() ;

	

	public void edit() {
System.out.println("We need to edit the file");
	}

	public void close() {
System.out.println("Close the file");
	}
}

  class JavaFile extends File{

	@Override
	public void open() {
		System.out.println("To open Java file we need notepad");
		
	}
	
}
  class WordFile extends File{

	@Override
	public void open() {
		System.out.println("Open the WordFile ");
		
	}
	  
  }
  class  PDF extends File{

	@Override
	public void open() {
		System.out.println("Open PDF");
		
	}
	  
  }
