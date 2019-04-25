package Inheritance;

public class TaskBoolean {

	
	static boolean Boolean(boolean a, boolean b) {
		boolean flag=false;
	
	
	
	if(a==true && b==true) {
		flag=true;
	}else if(a==false&&b==true) {
		flag=false;
	}else if(a==true&&b==false) {
		flag=false;
	}else if(a==false&& b==false) {
		flag=false;
	}
	
	
	return flag;
	
	}
	
	
	public static void main(String[] args) {
		System.out.println(Boolean(true,false));//method static olmali
	}
	
}
