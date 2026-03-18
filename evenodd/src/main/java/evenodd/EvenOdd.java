package evenodd;
import java.util.*;
public class EvenOdd {

	public static void main(String[] args) {
		System.out.print("Enter number: ");
		Scanner s = new Scanner(System.in);
		int input = s.nextInt();
		if (input % 2 == 0) {
			System.out.print(" is even numbeer");
		}else {
			System.out.print(" is Odd numbe89r");
		}
		s.close();
	}

}
