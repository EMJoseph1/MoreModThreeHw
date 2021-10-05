import java.util.Scanner;
 

public class ArmstrongNumber {
	
	public static void main(String[] args) {
		Scanner keyboardInput = new Scanner(System.in);
		
		System.out.println("Put in a number");
		
		int armstrongnum = keyboardInput.nextInt();
		
		while(armstrongnum != 0) 
		{
			int rem = armstrongnum % 10;
			int result =  rem*rem*rem;
			armstrongnum /=10;
		
		if(result == armstrongnum) {
			System.out.println(armstrongnum + "Armstrong");
		}
		else {
			System.out.println(armstrongnum + "Not Armstrong");
		}
		}
	}

}
