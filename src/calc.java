import java.util.Scanner;
public class calc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboardInput = new Scanner(System.in);
		System.out.println("Please input two numbers");
		
		int num1 = keyboardInput.nextInt();
		int num2 = keyboardInput.nextInt();
		
		System.out.println(add(num1,num2));
		System.out.println(sub(num1,num2));
		System.out.println(mul(num1,num2));
		System.out.println(div(num1,num2));
	}
	public static int add( int num1, int num2) 
	{
		int sum = num1 + num2;
		return sum;
	}
	public static int sub( int num1, int num2) 
	{
		int sum = num1 - num2;
		return sum;
	}
	public static int mul( int num1, int num2) 
	{
		int sum = num1 * num2;
		return sum;
	}
	public static int div( int num1, int num2) 
	{
		int sum = num1 / num2;
		return sum;
	}

}
