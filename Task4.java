package GuviJavaTask2;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of rows: ");
        int n = scanner.nextInt();
        scanner.close();
    	
//    	int n = 5;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                
                if (j == i || j == (n - i + 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" "); 
                }
            }
            System.out.println(); 
        }
    }
}
