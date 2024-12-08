import java.util.Scanner; 
public class IT24104117Lab5Q1 {
public static void main(String[] args) {
Scanner input = new Scanner(System.in); 

int num1, num2, num3;

System.out.print("Enter the first integer: ");
num1 = input.nextInt();

System.out.print("Enter the second integer: "); 
num2 = input.nextInt();

System.out.print("Enter the third integer: ");
num3 = input.nextInt();

    int smallest;
        if (num1 < num2 && num1 < num3) { 
            smallest = num1;
        } else if (num2 < num3) {
            smallest = num2;
        } else {
            smallest = num3;
        }

        int largest;
        if (num1 > num2 && num1 > num3) {
            largest = num1;
        } else if (num2 > num3) {
            largest = num2;
        } else {
            largest = num3;
        }

System.out.println("User entered numbers are: " + num1 + " " + num2 + " " + num3);
System.out.println("The Smallest number is: " + smallest);
System.out.println("The Largest number is: " + largest);

        input.close();
    }
}