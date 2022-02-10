package basics;
import java.util.*;

public class TakingUserInput {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		System.out.print("Enter a number: ");
//		int a = sc.nextInt();
//		System.out.println("Entered number is: " + a);
//		System.out.println("************************");
//		boolean b = sc.hasNextInt();
//		System.out.println("Given number is an integer? "+b);
//		System.out.println("************************");
		String s = sc.nextLine();
		System.out.println("You entered: "+s);

	}

}
