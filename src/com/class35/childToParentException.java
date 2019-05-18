package com.class35;

public class childToParentException {

	public static void main(String[] args) {
		
		int [] array= {17,99,8};
		try {
			Thread.sleep(1000);
		System.out.println(array[3]);// new ArrayIndexOutOfBoundsException
		}
//		}catch(Exception e) {
//			
//		}
		
		catch(InterruptedException e) {
			System.out.println(e.getMessage());
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Code after an exception");
		ArrayIndexOutOfBoundsException e=new ArrayIndexOutOfBoundsException();
		Exception e1=new ArrayIndexOutOfBoundsException();

	}

}
