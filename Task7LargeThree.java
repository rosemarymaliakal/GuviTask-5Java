package GuviJavaTask2;
import java.util.Scanner;

public class Task7LargeThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter first number");
		int num1 = scanner.nextInt();
//		System.out.println(num1);
		
		System.out.println("Enter second number");
		int num2 = scanner.nextInt();
//		System.out.println(num2);
		
		System.out.println("Enter Third number");
		int num3 = scanner.nextInt();
//		System.out.println(num3);
		
		if (num1>num2) {
			if(num1>num3) {
				System.out.println("Largest number is "+num1);
			}
			else {
				if(num3>num2) {
					System.out.println("Largest is "+num3);
				}
			}
			
		}
		else {
			if(num2>num3) {
				System.out.println("Largest is "+num2);
			}
			else {
				System.out.println("Largest is "+num3);
			}
		}
	}

}
