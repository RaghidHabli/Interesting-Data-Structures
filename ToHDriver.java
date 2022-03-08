
import java.util.Scanner;

public class ToHDriver {

	public static void main(String[] args) {
		int N;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter nb of disks: ");
		N = scan.nextInt();
		ToHHelper toh = new ToHHelper(N);
		toh.solve();
		
		scan.close();
	}

}
