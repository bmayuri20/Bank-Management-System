package com.model;

public class Account {
    private int accNo;
    private String name;
    private String mobNo;
    private String aadhaarNo;
    private String gender;
    private int age;
    private double balance;

    @Override
    public String toString() {
        return "Account{" +
                "accNo=" + accNo +
                ", name='" + name + '\'' +
                ", mobNo='" + mobNo + '\'' +
                ", aadhaarNo='" + aadhaarNo + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", balance=" + balance +
                '}';
    }



    public void setAccNo(int accNo) {
        this.accNo = accNo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAccNo() {
        return accNo;
    }

    public String getName() {
        return name;
    }

    public String getMobNo() {
        return mobNo;
    }

    public String getAadhaarNo() {
        return aadhaarNo;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public double getBalance() {
        return balance;
    }

    public void setMobNo(String mobNo) {
        this.mobNo = mobNo;
    }

    public void setAadhaarNo(String aadhaarNo) {
        this.aadhaarNo = aadhaarNo;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
