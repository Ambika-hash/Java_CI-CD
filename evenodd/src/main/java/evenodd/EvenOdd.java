package evenodd;
import java.util.*;
public class EvenOdd {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		//System.out.print("Enter: ");
		int input = s.nextInt();
		if (input%2==0) {
			System.out.print(n+ " is Even number");
		}else {
			System.out.print(n+" is Odd number");
		}
		s.close();
	}

}
