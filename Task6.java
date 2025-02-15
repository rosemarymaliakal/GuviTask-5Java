package GuviJavaTask2;
import java.util.Scanner;

public class Task6 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the month");
		int month = scanner.nextInt();
//		System.out.println("Month is "+month);
		
		System.out.println("Enter Room Rent per day");
		int rent = scanner.nextInt();
//		System.out.println("Rent is "+rent);
		
		System.out.println("Enter the number of days");
		int days = scanner.nextInt();
//		System.out.println("Number of days is "+days);

	
	switch (month) {
	case 1: {
			int TotalRent=rent * days;
			System.out.println("Total hotel rent is "+TotalRent );
			break;
	}
	
	case 2: {
		int TotalRent=rent * days;
		System.out.println("Total hotel rent is "+TotalRent );
		break;
}
	
	case 3: {
		int TotalRent=rent * days;
		System.out.println("Total hotel rent is "+TotalRent );
		break;
}
	case 4: {
		double TotalRent= rent * 0.2 * days;
		System.out.println("Total hotel rent is "+TotalRent );
		break;
}
	
	case 5: {
		int TotalRent=rent * days;
		System.out.println("Total hotel rent is "+TotalRent );
		break;
}
	
	case 6: {
		double TotalRent=  rent * 0.2 * days;
		System.out.println("Total hotel rent is "+TotalRent );
		break;
}
	
	case 7: {
		int TotalRent=rent * days;
		System.out.println("Total hotel rent is "+TotalRent );
		break;
}
	
	case 8: {
		Double TotalRent= rent *0.2 * days;
		System.out.println("Total hotel rent is "+TotalRent );
		break;
}
	
	case 9: {
		int TotalRent= rent * days;
		System.out.println("Total hotel rent is "+TotalRent );
		break;
}
	
	case 10: {
		Double TotalRent = rent *0.2 * days;
		System.out.println("Total hotel rent is "+TotalRent );
		break;
}
	
	case 11: {
		int TotalRent=rent * days;
		System.out.println("Total hotel rent is "+TotalRent );
		break;
}
	
	case 12: {
		Double TotalRent= rent *0.2 * days;
		System.out.println("Total hotel rent is "+TotalRent );
		break;
}
	default:
		System.out.println("Please enter a valid number");;
	}

}
}
