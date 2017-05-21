package com.demo.domain;

/**
 * Created by diwakar on 21/05/17.
 */
public class User {

    private String name;

    private int accountNumber;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", accountNumber='" + accountNumber + '\'' +
                '}';
    }
}
