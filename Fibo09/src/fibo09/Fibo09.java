/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibo09;

/**
 *
 * @author DELL
 */
public class Fibo09 {

    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci(45);
        fibonacci.compute();

        for (int fibonaccy : fibonacci.getFibonaccies()) { //In ra các giá trị trong mảng
            System.out.print(fibonaccy + " ");
        }

        System.out.println();
    }
}

