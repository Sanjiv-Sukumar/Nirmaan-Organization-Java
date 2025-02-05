package bank;

import java.util.Scanner;

public class ui {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Bank bank = new Bank();

        System.out.print("Enter your Pin: ");
        int pin = input.nextInt();

        if (pin != bank.getPin()) {
            System.out.println("Incorrect PIN. Please try again.");
        } else {
            boolean isRunning = true;

            while (isRunning) {
                System.out.println("Menu:");
                System.out.println("1. Check Balance");
                System.out.println("2. Withdraw Money");
                System.out.println("3. Exit");
                System.out.print("Choose an option: ");
                int key = input.nextInt();

                switch (key) {
                    case 1:
                        System.out.println("Your Balance: $" + bank.getAmount());
                        break;
                    case 2:
                        System.out.print("Enter amount to withdraw: ");
                        int withdrawMoney = input.nextInt();
                        if (bank.getAmount() >= withdrawMoney) {
                            bank.setAmount(bank.getAmount() - withdrawMoney);
                            System.out.println("Withdrawal Successful! Remaining Balance: $" + bank.getAmount());
                        } else {
                            System.out.println("Insufficient Balance.");
                        }
                        break;
                    case 3:
                        System.out.println("Exiting... Thank you for using our service.");
                        isRunning = false;
                        break;
                    default:
                        System.out.println("Invalid choice. Please enter 1, 2, or 3.");
                }
            }
        }
        
        input.close();
    }
}
