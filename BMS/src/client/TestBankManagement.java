package client;

import service.Rbi;
import serviceImpl.Sbi;

import java.util.Scanner;

public class TestBankManagement {
    public static void main(String[] args) {
        Rbi bank = new Sbi();
        System.out.println("Welcome to SBI Bank");
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
             System.out.println("Hello Customer...");
             System.out.println("Welcome...")
       
            System.out.println("Enter your choice....");
            System.out.println(" 1. Create Account \n 2. Display Account Details \n 3. Money Deposit \n 4. Money Withdraw \n 5. Check bank Balance \n 0 exit");
            choice = sc.nextInt();

            switch (choice){
                case 1: bank.createAccount();
                        System.out.println("Account created successfully");
                    break;
                case 2: bank.displayAllDetails();
                    break;
                case 3: bank.depositeMoney();
                    break;
                case 4: bank.withdrawal();
                    break;
                case 5: bank.balanceCheck();
                    break;
                case 0:
                    System.out.println("Exit");
                default:
                    System.out.println("Invalid choice");
                    break;

            }
            System.out.println("Enter choice ...");
        }while (choice != 0);
    }
}
