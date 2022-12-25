import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            Restaurant restaurant = new Restaurant();
            int customerID;
            int orderQty;
            try {
                System.out.print("Enter Customer ID: ");
                customerID = input.nextInt();

                System.out.print("Enter how much food to made: ");
                orderQty = input.nextInt();

                Thread thread1 = new Thread(restaurant);
                Waiters waiters = new Waiters(customerID, orderQty);
                Thread thread2 = new Thread(waiters);

                thread1.start();
                thread2.start();
                thread1.join();
                thread2.join();

            } catch (Exception e) {
                System.out.println("Input must be Integer");
            }
        }
    }
}
