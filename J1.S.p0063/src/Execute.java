/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Execute {

    private static final Scanner in = new Scanner(System.in);

    public static int checkInputInt() {
        while (true) {
            try {
                int result = Integer.parseInt(in.nextLine());
                if (result <= 0) {
                    System.err.println("Please input positive number");
                }else
                return result;
            } catch (NumberFormatException e) {
                System.err.println("You must input digit");
            }
        }
    }

    public static String checkInputString() {
        while (true) {
            String result = in.nextLine();
            if (result.isEmpty()) {
                System.err.println("Not Empty");
            } else {
                return result;
            }
        }
    }

    public static double checkInputSalary() {
        while (true) {
            try {
                System.out.print("Please Input Salary");
                double result = Double.parseDouble(in.nextLine());
                if (result < 0) {

                    System.err.println("Salary is greater than zero");
                }else
                return result;
            } catch (NumberFormatException e) {
                
                System.out.println("You must input digid: ");
            }
        }
    }

    public static int checkInputNumberStudent() {
        System.out.println("Enter number student: ");
        int n = checkInputInt();
        return n;
    }

    public static Person inputPersonInfo() {
        System.out.println("Input information of Person: ");
        System.out.println("Input Name: ");
        String name = checkInputString();
        System.out.println("Input Address: ");
        String address = checkInputString();
        System.out.println("Input Salary: ");
        double salary = checkInputSalary();
        return new Person(name, address, salary);
    }

    public static Person[] sort(Person[] listperson) {
        Person temp;
        for (int i = 0; i < listperson.length; i++) {
            for (int j = 0; j < listperson.length -i -1; j++) {
                if (listperson[j].getSalary() > listperson[j+1].getSalary()) {
                    temp = listperson[j];
                    listperson[j] = listperson[j+1];
                    listperson[j+1] = temp;
                }
            }
        }
        System.out.println("Sort success");
        System.out.println();
        return listperson;
    }
}
