/*author: enigmak9 */
public class Order {
    public static void main(String[] args) {
        double costOfTheItem = 30.99;
        boolean readyToSend = false;

        if (costOfTheItem > 24.00) {
            System.out.println("The cost of the item is really high!");
        }

        if (readyToSend){
            System.out.println("Item sent");
        } else {
            System.out.println("Item was not sent or is not ready.");
        }
    }
}
