/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package wallet90;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Person {
    private static Scanner in = new Scanner(System.in);
    private Wallet wallet;

    public Wallet getWallet() {
        return wallet;
    }

    public void setWallet(Wallet wallet) {
        this.wallet = wallet;
    }

    public Person(Wallet wallet) {
        this.wallet = wallet;
    }
    
    //money in wallet generating
    public void setMoney(){
        System.out.print("Input value of wallet: ");
        wallet.setMoney(checkInputInt());
    }

    public Person() {
    }
    public int getMoney(){
        
        return wallet.getMoney();
    }
    
    public static int checkInputInt() {
        while (true) {
            try {
                int result = Integer.parseInt(in.nextLine());
                return result;
            } catch (NumberFormatException e) {
                System.err.println("Please input a number.");
                System.out.print("Enter again: ");
            }
        }
    }
    
    public  int[] inputBills() {
        System.out.print("Input number of bill: ");
        int size = checkInputInt();
        int[] bills = new int[size];
        //allow user input bills
        for (int i = 0; i < bills.length; i++) {
            System.out.print("Input value of bill " + (i + 1) + ": ");
            bills[i] = checkInputInt();
        }
        return bills;
    }
    //Calculate the total amount of the bills
    public int calcTotal(int[] bills) {
        int total = 0;
        for (int i = 0; i < bills.length; i++) {
            total += bills[i];
        }
        return total;
    }
     //Check whether the amount in the wallet is enough to pay. 
    public boolean payMoney(int total, int wallet) {
        return total <= wallet;
    }
    
    //Print total of bill and result
    public void printTotalAndResult(int[] bills, int wallet) {
        int total = calcTotal(bills);
        System.out.println("This is total of bill: " + total);
        if (payMoney(total, wallet)) {
            System.out.println("You can buy it");
        } else {
            System.err.println("You can't buy it.");
        }
    }
     
}
