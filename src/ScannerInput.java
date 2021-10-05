import java.util.Scanner;
public class ScannerInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please enter two numbers");
		Scanner keyboardInput = new Scanner(System.in);
		int number = keyboardInput.nextInt();
		int number2 = keyboardInput.nextInt();
		
		for(int i = 0;i <= number2; i++) {
			int newNumber = number + number2;
			number = number2;
			number2 = newNumber;
			System.out.println(number + " ");
		}
		
	}
}
