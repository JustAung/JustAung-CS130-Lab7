import java.util.Scanner;

public class Oct13_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter employee number: ");
		int ID = scan.nextInt();
		int Position = ID;
		System.out.println("Position: ");
		switch (Position)
		{
		case 100:
			System.out.println("General Manager");
			break;
		case 200:
			System.out.println("Supervisor");
			break;
		case 300:
			System.out.println("Staff");
			break;
		case 400:
			System.out.println("Contractor");
			break;
		default:
			System.out.println("Invalid Employee");		
		}
		}

	}
