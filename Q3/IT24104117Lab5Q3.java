import java.util.Scanner;

public class IT24104117Lab5Q3 {
    public static void main(String[] args) {
    final int ROOM_CHARGE_PER_DAY = 48000; 
    final int DISCOUNT_3_TO_4_DAYS = 10;  
    final int DISCOUNT_5_OR_MORE_DAYS = 20; 

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Start Date (1-31): ");
        int startDate = scanner.nextInt();

        System.out.print("Enter End Date (1-31): ");
        int endDate = scanner.nextInt();

            if (startDate < 1 || startDate > 31 || endDate < 1 || endDate > 31) {
            System.out.println("Error: Days must be between 1 and 31");
        }
        else if (startDate >= endDate) {
            System.out.println("Error: Start Date must be less than End Date");
        } else {
            int numberOfDays = endDate - startDate;
            int totalRoomCharge = numberOfDays * ROOM_CHARGE_PER_DAY;
            int discountRate = 0;

            if (numberOfDays >= 3 && numberOfDays <= 4) {
                discountRate = DISCOUNT_3_TO_4_DAYS;
            } else if (numberOfDays >= 5) {
                discountRate = DISCOUNT_5_OR_MORE_DAYS;
            }

           
            double discountAmount = totalRoomCharge * discountRate / 100.0;
            double totalAmountToPay = totalRoomCharge - discountAmount;

            System.out.println("Room Charge Per Day: Rs. " + ROOM_CHARGE_PER_DAY + "/=");
            System.out.println("Number of Days Reserved: " + numberOfDays);
            System.out.println("Total Amount to be Paid: " + totalAmountToPay);
        }

        scanner.close();
    }
}