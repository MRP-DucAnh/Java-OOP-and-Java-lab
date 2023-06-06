/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package wallet90;

/**
 *
 * @author DELL
 */
public class main2 {
    public static void main(String[] args) {
        Wallet w = new Wallet();
        Person p = new Person(w);
        p.setMoney();
        int[] bills = p.inputBills();
        p.printTotalAndResult(bills, p.getMoney());
    }
}
