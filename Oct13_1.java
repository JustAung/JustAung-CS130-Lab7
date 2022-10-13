import java.util.Scanner;

public class Oct13_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double level, amount, capacity;
Scanner scan = new Scanner(System.in);
System.out.println("Enter the capacity of your gas tank and gas you have left");
capacity = scan.nextDouble();
amount = scan.nextDouble();
level = amount/capacity;
System.out.println(level);
if (level<.25){
	System.out.println("Less than a quarter");
	}
	else if (level<.50) {
		System.out.println("Less than a half of a tank");}
		else if (level<.75) {
			System.out.println("Less than three quarters of a tank");}
			else 
				System.out.println("Almost a full tank");
			
	}

}
