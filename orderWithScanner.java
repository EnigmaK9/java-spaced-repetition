/*author: enigmak9 */
import java.util.Scanner;

public class orderWithScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the cost of the item: ");
        double costOfTheItem = scanner.nextDouble();
        System.out.print("Is the item ready to send? (T/F): ");
        char readyInput = scanner.next().charAt(0);
        boolean readyToSend = (readyInput == 'T' || readyInput == 't');

        if (costOfTheItem > 24.00) {
            System.out.println("The cost of the item is really high!");
        }

        if (readyToSend) {
            System.out.println("Item sent");
        } else {
            System.out.println("Item was not sent or is not ready.");
        }

        scanner.close();
    }
}

