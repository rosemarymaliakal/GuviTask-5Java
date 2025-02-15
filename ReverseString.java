package GuviJavaTask2;
import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the String");
		
		String MyString = scanner.nextLine();
		
//		System.out.println(MyString);
		
//		String RevStr= new StringBuilder(MyString).reverse().toString();
//		
//		System.out.println(RevStr);
		
		System.out.println(ReversedString(MyString.length(), MyString));
		
	}
	
	
	public static String ReversedString( int len, String NewStr) {
		int count;
		int lastIndex = len -1;

		String RevStr = "";
		System.out.println(lastIndex);
		
		for(count=lastIndex;count>=0;count--) {
//			System.out.println(NewStr.charAt(count));
			RevStr += NewStr.charAt(count);
	
		}

		return RevStr;

	}
	
}


