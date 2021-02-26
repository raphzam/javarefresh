package java_basics;

 public class MyUtils {
	
	public static String printSomeJunk(String argument) {
		return argument;
	}
	
	
	public static void printSomeJunk(int argument) {
		System.out.println("Integer passed in " + argument);
	}
	
	public static void sumTwoNumbers(int x, int y) {
		System.out.println(x+y);
	}
	
	public int addTen(int x) {
		int result = x+10;
		
		return result;
	}

}
