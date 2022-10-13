import java.util.Scanner;

public class Oct13_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan = new Scanner(System.in);
System.out.println("Enter a year: ");
int number = scan.nextInt();

if (number%4==0 && number%100!=0||number%400==0) {
	System.out.println("This is a leap year");
}
	else
	{
		System.out.println("This is a common year");

	}

}
}
