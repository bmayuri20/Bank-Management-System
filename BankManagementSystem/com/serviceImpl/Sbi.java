package com.serviceImpl;

import com.model.Account;
import com.service.Rbi;

import java.util.Random;
import java.util.Scanner;

public class Sbi implements Rbi {
    Scanner sc = new Scanner(System.in);
    Account account = new Account();
    Random random = new Random();
    @Override
    public void createAccount() {
        System.out.println("Enter Name");
        account.setName(sc.nextLine());

        System.out.println("Enter Mobile Number");
        account.setMobNo(sc.nextLine());

        System.out.println("Enter Aadhaar number");
        String num = sc.nextLine();
        if(num.length() == 12)
            account.setAadhaarNo(num);
        else
            System.out.println("Invalid Aadhaar number");

        System.out.println("Enter Age");
        int age = sc.nextInt();
        if(age> 18 && age<100)
            account.setAge(age);
        else
            System.out.println("Invalid age");

        System.out.println("Enter Gender");
        String gender = sc.next();
        if (gender.equalsIgnoreCase("Female") || gender.equalsIgnoreCase("Male"))
        account.setGender(gender);
        else
            System.out.println("Invalid input");

        System.out.println("Enter amount to be deposited");
        account.setBalance(sc.nextDouble());

        account.setAccNo(random.nextInt(0,999999999));

    }

    @Override
    public void displayAllDetails() {
        System.out.println(account);
    }

    @Override
    public void depositeMoney() {
        System.out.println("Enter Account number and otp");
        if (sc.nextInt() == account.getAccNo()) {
            System.out.println("Enetr amount to be deposit");
            double bal = sc.nextDouble();
            bal += account.getBalance();
            account.setBalance(bal);
            System.out.println("Current Balance: " + account.getBalance());
        }
        else
            System.out.println("Account no is not correct");
    }

    @Override
    public void withdrawal() {
        System.out.println("Enter Account number and otp");
        if (sc.nextInt() == account.getAccNo()) {
            System.out.println("Enter amount to withdraw");
            double draw = sc.nextDouble();
            if (draw > 1000) {
                double bal = account.getBalance() - draw;
                account.setBalance(bal);
                System.out.println("Current Balance: " + account.getBalance());
            } else
                System.out.println("Insufficient Balance");
        }
        else
            System.out.println("Account no is not correct");
    }

    @Override
    public void balanceCheck() {
        int otp1 = random.nextInt(0,9999);
        System.out.println(otp1);
        System.out.println("Enter Account number and otp");
        if (sc.nextInt() == account.getAccNo() && sc.nextInt()== otp1)
            System.out.println("Current Balance: " + account.getBalance());
        else
            System.out.println("Account no or OTP is not correct");
    }

    public void FundTransfer(){
        System.out.println("Enter amount to transfer");
        double amt = sc.nextDouble();
        withdrawal();


    }
}
