package evenodd;
import java.util.*;
public class EvenOdd {

	public static void main(String[] args) {
		System.out.print("Enter number: ");
		Scanner s = new Scanner(System.in);
		int input = s.nextInt();
		if (input%2==0) {
			System.out.print(n+ " is even numbeer");
		}else {
			System.out.print(n+" is Odd number");
		}
		s.close();
	}

}
