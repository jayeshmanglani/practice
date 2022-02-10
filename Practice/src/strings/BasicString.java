package strings;
import java.util.Scanner;

public class BasicString {

	public static void main(String[] args) {
		//String is a class but can be used like a data type
		String str = new String("Jayesh");
		System.out.println(str);
		String jay = "Jayesh";
		System.out.println(jay);
		
		int a = 5;
		float b= 3.444f;
		//System.out.printf("The value of a is %d and the value of b is %f", a , b);
		System.out.format("The value of a is %d and the value of b is %f", a , b);
		
		Scanner sc = new Scanner(System.in);
		String st = sc.nextLine();
		System.out.println(st);
		

	}

}
