import java.util.Scanner;
public class ScannerWalkthrough {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboardInput = new Scanner(System.in);
		//scanner/user input setup
		System.out.println("Enter Your Name: ");
		
		//initizing variable for user to define
		String name = keyboardInput.nextLine();
		System.out.println("Hey" + name+"!");
		
		//initizing variable for user to define for numbers
		int number = keyboardInput.nextInt();
	}

}
