package GuviJavaTask2;
import java.util.Scanner;
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the string");
		
		String MyString = scanner.nextLine();
		
//		System.out.println("String is "+MyString);
		
		if(isPalindrome(MyString)) {
			System.out.println("It is Palindrome");
			
		}
		else
		{
			System.out.println("It is not Palindrome");
		}

	}
	
	public static boolean isPalindrome(String str) {
		int strLeft = 0;
		int strRight = str.length() - 1;
		
		while(strLeft<strRight) {
			if(str.charAt(strLeft) != str.charAt(strRight)) {
				return false;
				
			}
			strLeft++;
			strRight--;
			
		}
		return true;
	}

}
