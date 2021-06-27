import java.util.Scanner;
public class calculator{
	public static int mult(int num1,int num2){
		int result = num1 * num2;
		return result;
	}
	public static int sub(int num1,int num2){
		int result = num1 - num2;
		return result;
	}
	public static int div(int num1,int num2){
		int result = num1/num2;
		return result;
	}
	public static int add(int num1,int num2){
		int result = num1 + num2;
		return result;
	}
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.println("Which of the following operations would you wish to " +
			"call in your arithmetic problem? (multiplication, division, addition, subtraction)");
		String operation = scan.nextLine();
		while(!operation.equals("multiplication") && !operation.equals("division") && !operation.equals("addition") && !operation.equals("substraction")){
			System.out.println("Operation given unknown. Please input a valid mathematic operation (multiplication, division, addition, subtraction).");
			operation = scan.nextLine();
		}
		if(operation.equals("multiplication")){
			System.out.println("Please give two integers to multiply.");
			int num1 = scan.nextInt();
			int num2 = scan.nextInt();
			int result = mult(num1,num2);
			System.out.println("The answer is: " + result);
		}
		else if(operation.equals("division")){
			System.out.println("Please give two integers to divide.");
			int num1 = scan.nextInt();
			int num2 = scan.nextInt();
			int result = div(num1,num2);
			System.out.println("The answer is: " + result);
		}
		else if(operation.equals("subtraction")){
			System.out.println("Please give two integers to subtract.");
			int num1 = scan.nextInt();
			int num2 = scan.nextInt();
			int result = sub(num1,num2);
			System.out.println("The answer is: " + result);
		}
		else if(operation.equals("addition")){
			System.out.println("Please give two integers to add.");
			int num1 = scan.nextInt();
			int num2 = scan.nextInt();
			int result = add(num1,num2);
			System.out.println("The answer is: " + result);
		}
	}
}
