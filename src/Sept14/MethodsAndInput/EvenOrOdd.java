
package Sept14.MethodsAndInput;
import java.util.Scanner;

public class EvenOrOdd {
	static void evenOrOdd(int x) {
		if (x % 2 == 0) {
			System.out.println("Number is even");
			}
		else System.out.println("Number is odd");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner myObj = new Scanner(System.in);
		System.out.print("Enter the number: ");
		
		int x = myObj.nextInt();
		evenOrOdd(x);
		
}
}
