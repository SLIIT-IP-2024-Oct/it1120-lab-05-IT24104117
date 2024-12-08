import java.util.Scanner;
public class IT24104117Lab5Q2 {
	public static void main (String[]args){
		Scanner input = new Scanner(System.in);
		
		int num1;
		
		System.out.print ("Enter number of new members introduced : " );
		num1 = input.nextInt();
		
		if (num1>=0){
		switch (num1)
		{
			case '0' : System.out.print("No prize");
			break;
			case '1' : System.out.print("Price is a : Pen");
			break;
			
			case '2' : System.out.print("price is a : Umbrella");
			break;
			
			case '3' : System.out.print("price is a : Bag");
			break;
			
			case '4' : System.out.print("price is a : Travelling Chair");
			break;
			
			default : System.out.print("price is a : Headphone");
			break;
			
			
		}
	} else {
		System.out.print("Invalid input. Input must a number 0 or greater ");
	}
		
	}

}
