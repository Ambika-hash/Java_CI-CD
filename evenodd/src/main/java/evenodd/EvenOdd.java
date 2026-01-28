package evenodd;
import java.util.*;
public class EvenOdd {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		//System.out.print("Enter: ");
		int input = s.nextInt();
		if (input%2==0) {
			System.out.print("Even number");
		}else {
			System.out.print("Odd number");
		}
		s.close();
	}

}
