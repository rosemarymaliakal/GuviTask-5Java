package GuviJavaTask2;

import java.util.Scanner;

public class Staircase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
//		
		System.out.println("Enter number");
//		
		int num = scanner.nextInt();
		
//		System.out.println(num);
		int n = 1;
//		int num = 4;
		for(int i =1 ; i < num ; i++) {
			for(int j = 1 ; j <= i ; j++) {
				System.out.print(n + " ");
				n++;
			}
			System.out.println();
		}
		

	}

}
