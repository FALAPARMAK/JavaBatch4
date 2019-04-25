package com.class27;

public class TestFile {

	public static void main(String[] args) {
		File f=new PDF();
		f.close();
		f.edit();
		f.open();
		
		
		File ff= new WordFile();
		ff.close();
		ff.edit();
		ff.open();

	}

}
 